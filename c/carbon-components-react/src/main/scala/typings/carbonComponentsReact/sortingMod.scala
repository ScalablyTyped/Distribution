package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactStrings.ASC
import typings.carbonComponentsReact.carbonComponentsReactStrings.DESC
import typings.carbonComponentsReact.carbonComponentsReactStrings.NONE
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortingMod {
  
  @JSImport("carbon-components-react/lib/components/DataTable/state/sorting", "initialSortState")
  @js.native
  val initialSortState: Extract[DataTableSortState, NONE] = js.native
  
  @JSImport("carbon-components-react/lib/components/DataTable/state/sorting", "sortStates")
  @js.native
  val sortStates: DataTableSortStates = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.ASC
    - typings.carbonComponentsReact.carbonComponentsReactStrings.DESC
    - typings.carbonComponentsReact.carbonComponentsReactStrings.NONE
  */
  trait DataTableSortState extends StObject
  object DataTableSortState {
    
    @scala.inline
    def ASC: typings.carbonComponentsReact.carbonComponentsReactStrings.ASC = "ASC".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.ASC]
    
    @scala.inline
    def DESC: typings.carbonComponentsReact.carbonComponentsReactStrings.DESC = "DESC".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.DESC]
    
    @scala.inline
    def NONE: typings.carbonComponentsReact.carbonComponentsReactStrings.NONE = "NONE".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.NONE]
  }
  
  /* Inlined std.Readonly<{  ASC :std.Extract<carbon-components-react.carbon-components-react/lib/components/DataTable/state/sorting.DataTableSortState, 'ASC'>,   DESC :std.Extract<carbon-components-react.carbon-components-react/lib/components/DataTable/state/sorting.DataTableSortState, 'DESC'>,   NONE :std.Extract<carbon-components-react.carbon-components-react/lib/components/DataTable/state/sorting.DataTableSortState, 'NONE'>}> */
  trait DataTableSortStates extends StObject {
    
    val ASC: Extract[DataTableSortState, typings.carbonComponentsReact.carbonComponentsReactStrings.ASC]
    
    val DESC: Extract[
        DataTableSortState, 
        typings.carbonComponentsReact.carbonComponentsReactStrings.DESC
      ]
    
    val NONE: Extract[
        DataTableSortState, 
        typings.carbonComponentsReact.carbonComponentsReactStrings.NONE
      ]
  }
  object DataTableSortStates {
    
    @scala.inline
    def apply(
      ASC: Extract[DataTableSortState, ASC],
      DESC: Extract[DataTableSortState, DESC],
      NONE: Extract[DataTableSortState, NONE]
    ): DataTableSortStates = {
      val __obj = js.Dynamic.literal(ASC = ASC.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableSortStates]
    }
    
    @scala.inline
    implicit class DataTableSortStatesMutableBuilder[Self <: DataTableSortStates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setASC(value: Extract[DataTableSortState, ASC]): Self = StObject.set(x, "ASC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDESC(value: Extract[DataTableSortState, DESC]): Self = StObject.set(x, "DESC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONE(value: Extract[DataTableSortState, NONE]): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    }
  }
}
