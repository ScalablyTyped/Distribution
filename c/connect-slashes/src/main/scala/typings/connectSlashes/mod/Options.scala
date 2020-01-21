package typings.connectSlashes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional settings
  * @see https://github.com/avinoamr/connect-slashes#additional-settings
  */
trait Options extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(base: String = null, code: Int | Double = null, headers: StringDictionary[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

