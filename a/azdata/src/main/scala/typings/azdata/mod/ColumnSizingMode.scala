package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnSizingMode extends StObject
@JSImport("azdata", "ColumnSizingMode")
@js.native
object ColumnSizingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnSizingMode & Double] = js.native
  
  /**
    * Columns will be ForceFit up to a certain number; currently 3.  At 4 or more the behavior will switch to NO force fit
    */
  @js.native
  sealed trait AutoFit
    extends StObject
       with ColumnSizingMode
  /* 1 */ val AutoFit: typings.azdata.mod.ColumnSizingMode.AutoFit & Double = js.native
  
  /**
    * Columns use sizing based on cell data, horizontal scroll bar present if more cells than visible in view area
    */
  @js.native
  sealed trait DataFit
    extends StObject
       with ColumnSizingMode
  /* 2 */ val DataFit: typings.azdata.mod.ColumnSizingMode.DataFit & Double = js.native
  
  /**
    * All columns will be sized to fit in viewable space, no horizontal scroll bar
    */
  @js.native
  sealed trait ForceFit
    extends StObject
       with ColumnSizingMode
  /* 0 */ val ForceFit: typings.azdata.mod.ColumnSizingMode.ForceFit & Double = js.native
}
