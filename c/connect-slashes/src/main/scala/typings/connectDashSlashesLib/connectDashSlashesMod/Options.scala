package typings
package connectDashSlashesLib.connectDashSlashesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional settings
  * @see https://github.com/avinoamr/connect-slashes#additional-settings
  */
trait Options extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var code: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    code: scala.Int | scala.Double = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Options]
  }
}

