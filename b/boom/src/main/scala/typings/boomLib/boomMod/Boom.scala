package typings
package boomLib.boomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
  * @see {@link https://github.com/hapijs/boom#boom}
  */
trait Boom[Data]
  extends stdLib.Error {
  /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
  var data: Data
  /** isBoom - if true, indicates this is a Boom object instance. */
  var isBoom: scala.Boolean
  /**
    * "If message is unset, the 'error' segment of the header will not be present and
    * isMissing will be true on the error object." mentioned in
    * @see {@link https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes}
    */
  var isMissing: js.UndefOr[scala.Boolean] = js.undefined
  /** isServer - convenience bool indicating status code >= 500. */
  var isServer: scala.Boolean
  /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
  var output: boomLib.boomMod.BoomNs.Output
  /** reformat() - rebuilds error.output using the other object properties. */
  def reformat(): java.lang.String
}

object Boom {
  @scala.inline
  def apply[Data](
    data: Data,
    isBoom: scala.Boolean,
    isServer: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    output: boomLib.boomMod.BoomNs.Output,
    reformat: () => java.lang.String,
    isMissing: js.UndefOr[scala.Boolean] = js.undefined,
    stack: java.lang.String = null
  ): Boom[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isBoom = isBoom, isServer = isServer, message = message, name = name, output = output, reformat = js.Any.fromFunction0(reformat))
    if (!js.isUndefined(isMissing)) __obj.updateDynamic("isMissing")(isMissing)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Boom[Data]]
  }
}

