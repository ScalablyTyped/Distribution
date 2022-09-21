package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerConstantsMod {
  
  @JSImport("baseui/datepicker/constants", "DEFAULT_MONTHS")
  @js.native
  val DEFAULT_MONTHS: js.Array[Double] = js.native
  
  object DENSITY extends Shortcut {
    
    @JSImport("baseui/datepicker/constants", "DENSITY.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/datepicker/constants", "DENSITY.high")
    @js.native
    val high: typings.baseui.baseuiStrings.high = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `DENSITY.foo` */
    override def _to: default_ = default
  }
  
  @JSImport("baseui/datepicker/constants", "DISPLAY_FORMAT")
  @js.native
  val DISPLAY_FORMAT: /* "L" */ String = js.native
  
  object INPUT_ROLE {
    
    @JSImport("baseui/datepicker/constants", "INPUT_ROLE.endDate")
    @js.native
    val endDate: typings.baseui.baseuiStrings.endDate = js.native
    
    @JSImport("baseui/datepicker/constants", "INPUT_ROLE.startDate")
    @js.native
    val startDate: typings.baseui.baseuiStrings.startDate = js.native
  }
  
  @JSImport("baseui/datepicker/constants", "ISO_FORMAT")
  @js.native
  val ISO_FORMAT: /* "YYYY-MM-DD" */ String = js.native
  
  @JSImport("baseui/datepicker/constants", "ISO_MONTH_FORMAT")
  @js.native
  val ISO_MONTH_FORMAT: /* "YYYY-MM" */ String = js.native
  
  /* Inlined std.Readonly<{ readonly horizontal :'horizontal',  readonly vertical :'vertical'}> */
  object ORIENTATION {
    
    @JSImport("baseui/datepicker/constants", "ORIENTATION.horizontal")
    @js.native
    val horizontal: typings.baseui.baseuiStrings.horizontal = js.native
    
    @JSImport("baseui/datepicker/constants", "ORIENTATION.vertical")
    @js.native
    val vertical: typings.baseui.baseuiStrings.vertical = js.native
  }
  
  object RANGED_CALENDAR_BEHAVIOR extends Shortcut {
    
    @JSImport("baseui/datepicker/constants", "RANGED_CALENDAR_BEHAVIOR.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/datepicker/constants", "RANGED_CALENDAR_BEHAVIOR.locked")
    @js.native
    val locked: typings.baseui.baseuiStrings.locked = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `RANGED_CALENDAR_BEHAVIOR.foo` */
    override def _to: default_ = default
  }
  
  /* Inlined std.Readonly<{ readonly change :'change',  readonly moveUp :'moveUp',  readonly moveDown :'moveDown',  readonly moveLeft :'moveLeft',  readonly moveRight :'moveRight',  readonly mouseOver :'mouseOver',  readonly mouseLeave :'mouseLeave'}> */
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/datepicker/constants", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
    
    @JSImport("baseui/datepicker/constants", "STATE_CHANGE_TYPE.mouseLeave")
    @js.native
    val mouseLeave: typings.baseui.baseuiStrings.mouseLeave = js.native
    
    @JSImport("baseui/datepicker/constants", "STATE_CHANGE_TYPE.mouseOver")
    @js.native
    val mouseOver: typings.baseui.baseuiStrings.mouseOver = js.native
    
    @JSImport("baseui/datepicker/constants", "STATE_CHANGE_TYPE.moveDown")
    @js.native
    val moveDown: typings.baseui.baseuiStrings.moveDown = js.native
    
    @JSImport("baseui/datepicker/constants", "STATE_CHANGE_TYPE.moveLeft")
    @js.native
    val moveLeft: typings.baseui.baseuiStrings.moveLeft = js.native
    
    @JSImport("baseui/datepicker/constants", "STATE_CHANGE_TYPE.moveRight")
    @js.native
    val moveRight: typings.baseui.baseuiStrings.moveRight = js.native
    
    @JSImport("baseui/datepicker/constants", "STATE_CHANGE_TYPE.moveUp")
    @js.native
    val moveUp: typings.baseui.baseuiStrings.moveUp = js.native
  }
  
  @JSImport("baseui/datepicker/constants", "WEEKDAYS")
  @js.native
  val WEEKDAYS: js.Array[Double] = js.native
}
