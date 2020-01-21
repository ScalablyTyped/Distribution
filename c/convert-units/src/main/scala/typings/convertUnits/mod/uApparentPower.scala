package typings.convertUnits.mod

import typings.convertUnits.convertUnitsStrings.mVA_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.VA
  - typings.convertUnits.convertUnitsStrings.mVA_
  - typings.convertUnits.convertUnitsStrings.kVA
  - typings.convertUnits.convertUnitsStrings.MVA
  - typings.convertUnits.convertUnitsStrings.GVA
*/
trait uApparentPower extends js.Object

object uApparentPower {
  @scala.inline
  def GVA: typings.convertUnits.convertUnitsStrings.GVA = this.cast("GVA")
  @scala.inline
  def MVA: typings.convertUnits.convertUnitsStrings.MVA = this.cast("MVA")
  @scala.inline
  def VA: typings.convertUnits.convertUnitsStrings.VA = this.cast("VA")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kVA: typings.convertUnits.convertUnitsStrings.kVA = this.cast("kVA")
  @scala.inline
  def mVA: mVA_ = this.cast("mVA")
}

