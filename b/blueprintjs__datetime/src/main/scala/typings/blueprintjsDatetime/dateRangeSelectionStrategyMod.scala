package typings.blueprintjsDatetime

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangeSelectionStrategyMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy")
  @js.native
  open class DateRangeSelectionStrategy () extends StObject
  /* static members */
  object DateRangeSelectionStrategy {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.createRange")
    @js.native
    def createRange: Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.createRangeForBoundary")
    @js.native
    def createRangeForBoundary: Any = js.native
    inline def createRangeForBoundary_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createRangeForBoundary")(x.asInstanceOf[js.Any])
    
    inline def createRange_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createRange")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getBoundaryDate")
    @js.native
    def getBoundaryDate: Any = js.native
    inline def getBoundaryDate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getBoundaryDate")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getDefaultNextState")
    @js.native
    def getDefaultNextState: Any = js.native
    inline def getDefaultNextState_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultNextState")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the new date-range and the boundary that would be affected if `day` were clicked. The
      * affected boundary may be different from the provided `boundary` in some cases. For example,
      * clicking a particular boundary's selected date will always deselect it regardless of which
      * `boundary` you provide to this function (because it's simply a more intuitive interaction).
      */
    inline def getNextState(currentRange: DateRange, day: js.Date, allowSingleDayRange: Boolean): IDateRangeSelectionState = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextState")(currentRange.asInstanceOf[js.Any], day.asInstanceOf[js.Any], allowSingleDayRange.asInstanceOf[js.Any])).asInstanceOf[IDateRangeSelectionState]
    inline def getNextState(currentRange: DateRange, day: js.Date, allowSingleDayRange: Boolean, boundary: Boundary): IDateRangeSelectionState = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextState")(currentRange.asInstanceOf[js.Any], day.asInstanceOf[js.Any], allowSingleDayRange.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[IDateRangeSelectionState]
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getNextStateForBoundary")
    @js.native
    def getNextStateForBoundary: Any = js.native
    inline def getNextStateForBoundary_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getNextStateForBoundary")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getOtherBoundary")
    @js.native
    def getOtherBoundary: Any = js.native
    inline def getOtherBoundary_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOtherBoundary")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.isOverlappingOtherBoundary")
    @js.native
    def isOverlappingOtherBoundary: Any = js.native
    inline def isOverlappingOtherBoundary_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOverlappingOtherBoundary")(x.asInstanceOf[js.Any])
  }
  
  trait IDateRangeSelectionState extends StObject {
    
    /**
      * The boundary that would be modified by clicking the provided `day`.
      */
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    /**
      * The date range that would be selected after clicking the provided `day`.
      */
    var dateRange: DateRange
  }
  object IDateRangeSelectionState {
    
    inline def apply(dateRange: DateRange): IDateRangeSelectionState = {
      val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateRangeSelectionState]
    }
    
    extension [Self <: IDateRangeSelectionState](x: Self) {
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    }
  }
}
