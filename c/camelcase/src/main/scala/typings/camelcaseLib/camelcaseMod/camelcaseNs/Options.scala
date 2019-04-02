package typings
package camelcaseLib.camelcaseMod.camelcaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Uppercase the first character: `foo-bar` → `FooBar`.
  		@default false
  		*/
  val pascalCase: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(pascalCase: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pascalCase)) __obj.updateDynamic("pascalCase")(pascalCase)
    __obj.asInstanceOf[Options]
  }
}

