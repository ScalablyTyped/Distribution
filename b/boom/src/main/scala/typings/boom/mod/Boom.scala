package typings.boom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
  * @see {@link https://github.com/hapijs/boom#boom}
  */
@js.native
trait Boom[Data] extends Error {
  /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
  var data: Data = js.native
  /** isBoom - if true, indicates this is a Boom object instance. */
  var isBoom: Boolean = js.native
  /**
    * "If message is unset, the 'error' segment of the header will not be present and
    * isMissing will be true on the error object." mentioned in
    * @see {@link https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes}
    */
  var isMissing: js.UndefOr[Boolean] = js.native
  /** isServer - convenience bool indicating status code >= 500. */
  var isServer: Boolean = js.native
  /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
  var output: Output = js.native
  /** reformat() - rebuilds error.output using the other object properties. */
  def reformat(): String = js.native
  /** typeof - the constructor used to create the error (e.g. Boom.badRequest). */
  def typeof(): js.Any = js.native
}

object Boom {
  @scala.inline
  def apply[Data](
    data: Data,
    isBoom: Boolean,
    isServer: Boolean,
    message: String,
    name: String,
    output: Output,
    reformat: () => String,
    typeof: () => js.Any
  ): Boom[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isBoom = isBoom.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reformat = js.Any.fromFunction0(reformat), typeof = js.Any.fromFunction0(typeof))
    __obj.asInstanceOf[Boom[Data]]
  }
  @scala.inline
  implicit class BoomOps[Self <: Boom[_], Data] (val x: Self with Boom[Data]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBoom(value: Boolean): Self = this.set("isBoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsServer(value: Boolean): Self = this.set("isServer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: Output): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setReformat(value: () => String): Self = this.set("reformat", js.Any.fromFunction0(value))
    @scala.inline
    def setTypeof(value: () => js.Any): Self = this.set("typeof", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMissing(value: Boolean): Self = this.set("isMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMissing: Self = this.set("isMissing", js.undefined)
  }
  
}

