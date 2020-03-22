package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionOnCellCheckboxCheck extends js.Object

@JSImport("azdata", "ActionOnCellCheckboxCheck")
@js.native
object ActionOnCellCheckboxCheck extends js.Object {
  @js.native
  sealed trait customAction extends ActionOnCellCheckboxCheck
  
  @js.native
  sealed trait selectRow extends ActionOnCellCheckboxCheck
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActionOnCellCheckboxCheck with Double] = js.native
  /* 1 */ @js.native
  object customAction extends TopLevel[customAction with Double]
  
  /* 0 */ @js.native
  object selectRow extends TopLevel[selectRow with Double]
  
}

