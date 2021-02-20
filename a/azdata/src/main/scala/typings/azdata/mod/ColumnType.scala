package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnType extends StObject
@JSImport("azdata", "ColumnType")
@js.native
object ColumnType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnType with Double] = js.native
  
  @js.native
  sealed trait button extends ColumnType
  /* 2 */ val button: typings.azdata.mod.ColumnType.button with Double = js.native
  
  @js.native
  sealed trait checkBox extends ColumnType
  /* 1 */ val checkBox: typings.azdata.mod.ColumnType.checkBox with Double = js.native
  
  @js.native
  sealed trait text extends ColumnType
  /* 0 */ val text: typings.azdata.mod.ColumnType.text with Double = js.native
}
