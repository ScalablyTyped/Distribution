package typings
package atBlueprintjsDatetimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atBlueprintjsDatetimeLibStrings {
  @js.native
  sealed trait millisecond
    extends atBlueprintjsDatetimeLib.libEsmTimePickerMod.TimePrecision
  
  @js.native
  sealed trait minute
    extends atBlueprintjsDatetimeLib.libEsmTimePickerMod.TimePrecision
  
  @js.native
  sealed trait second
    extends atBlueprintjsDatetimeLib.libEsmTimePickerMod.TimePrecision
  
  @scala.inline
  def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
}

