package typings.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.A
  - typings.convertUnits.convertUnitsStrings.mA
  - typings.convertUnits.convertUnitsStrings.kA
*/
trait uCurrent extends js.Object

object uCurrent {
  @scala.inline
  def A: typings.convertUnits.convertUnitsStrings.A = this.cast("A")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kA: typings.convertUnits.convertUnitsStrings.kA = this.cast("kA")
  @scala.inline
  def mA: typings.convertUnits.convertUnitsStrings.mA = this.cast("mA")
}

