package typings.chalk.chalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSupport extends js.Object {
  var has16m: Boolean
  var has256: Boolean
  var hasBasic: Boolean
  var level: Level
}

object ColorSupport {
  @scala.inline
  def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: Level): ColorSupport = {
    val __obj = js.Dynamic.literal(has16m = has16m, has256 = has256, hasBasic = hasBasic, level = level)
  
    __obj.asInstanceOf[ColorSupport]
  }
}

