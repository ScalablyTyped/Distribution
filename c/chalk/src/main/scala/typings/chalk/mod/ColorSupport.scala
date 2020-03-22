package typings.chalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Detect whether the terminal supports color.
	*/
trait ColorSupport extends js.Object {
  /**
  		Return whether Chalk supports Truecolor 16 million colors.
  		*/
  var has16m: Boolean
  /**
  		Return whether Chalk supports ANSI 256 colors.
  		*/
  var has256: Boolean
  /**
  		Return whether Chalk supports basic 16 colors.
  		*/
  var hasBasic: Boolean
  /**
  		The color level used by Chalk.
  		*/
  var level: Level
}

object ColorSupport {
  @scala.inline
  def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: Level): ColorSupport = {
    val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorSupport]
  }
}

