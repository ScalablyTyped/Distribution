package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionOnCellCheckboxCheck extends StObject
@JSImport("azdata", "ActionOnCellCheckboxCheck")
@js.native
object ActionOnCellCheckboxCheck extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActionOnCellCheckboxCheck with Double] = js.native
  
  @js.native
  sealed trait customAction extends ActionOnCellCheckboxCheck
  /* 1 */ val customAction: typings.azdata.mod.ActionOnCellCheckboxCheck.customAction with Double = js.native
  
  @js.native
  sealed trait selectRow extends ActionOnCellCheckboxCheck
  /* 0 */ val selectRow: typings.azdata.mod.ActionOnCellCheckboxCheck.selectRow with Double = js.native
}
