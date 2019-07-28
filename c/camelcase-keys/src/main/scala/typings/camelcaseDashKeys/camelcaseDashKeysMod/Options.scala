package typings.camelcaseDashKeys.camelcaseDashKeysMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Recurse nested objects and objects in arrays.
  		@default false
  		*/
  val deep: js.UndefOr[Boolean] = js.undefined
  /**
  		Exclude keys from being camelCased.
  		@default []
  		*/
  val exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
}

object Options {
  @scala.inline
  def apply(deep: js.UndefOr[Boolean] = js.undefined, exclude: js.Array[String | RegExp] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    __obj.asInstanceOf[Options]
  }
}

