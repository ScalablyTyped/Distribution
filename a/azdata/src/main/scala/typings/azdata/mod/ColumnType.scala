package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnType extends StObject
@JSImport("azdata", "ColumnType")
@js.native
object ColumnType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnType & Double] = js.native
  
  @js.native
  sealed trait button
    extends StObject
       with ColumnType
  /* 2 */ val button: typings.azdata.mod.ColumnType.button & Double = js.native
  
  @js.native
  sealed trait checkBox
    extends StObject
       with ColumnType
  /* 1 */ val checkBox: typings.azdata.mod.ColumnType.checkBox & Double = js.native
  
  @js.native
  sealed trait text
    extends StObject
       with ColumnType
  /* 0 */ val text: typings.azdata.mod.ColumnType.text & Double = js.native
}
