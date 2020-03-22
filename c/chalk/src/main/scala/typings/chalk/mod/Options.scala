package typings.chalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Specify the color support for Chalk.
  		By default, color support is automatically detected based on the environment.
  		*/
  var level: js.UndefOr[Level] = js.undefined
}

object Options {
  @scala.inline
  def apply(level: Level = null): Options = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

