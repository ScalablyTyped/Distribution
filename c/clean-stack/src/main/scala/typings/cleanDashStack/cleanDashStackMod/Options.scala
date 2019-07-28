package typings.cleanDashStack.cleanDashStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Prettify the file paths in the stack:
  		`/Users/sindresorhus/dev/clean-stack/unicorn.js:2:15` → `~/dev/clean-stack/unicorn.js:2:15`
  		@default false
  		*/
  val pretty: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(pretty: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    __obj.asInstanceOf[Options]
  }
}

