package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnSizingMode extends js.Object
@JSImport("azdata", "ColumnSizingMode")
@js.native
object ColumnSizingMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnSizingMode with Double] = js.native
  
      // columns will be ForceFit up to a certain number; currently 3.  At 4 or more the behavior will switch to NO force fit
  @js.native
  sealed trait AutoFit extends ColumnSizingMode
  /* 1 */ @js.native
  object AutoFit extends TopLevel[AutoFit with Double]
  
  @js.native
  sealed trait DataFit extends ColumnSizingMode
  /* 2 */ @js.native
  object DataFit extends TopLevel[DataFit with Double]
  
     // all columns will be sized to fit in viewable space, no horiz scroll bar
  @js.native
  sealed trait ForceFit extends ColumnSizingMode
  /* 0 */ @js.native
  object ForceFit extends TopLevel[ForceFit with Double]
}
