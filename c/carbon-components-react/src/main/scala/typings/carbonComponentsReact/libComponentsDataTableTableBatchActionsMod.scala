package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.carbonComponentsReact.typingsTranslationMod._CarbonTranslationKey
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableTableBatchActionsMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableBatchActions", JSImport.Default)
  @js.native
  val default: TableBatchActionsFC = js.native
  
  @js.native
  trait TableBatchActionsFC
    extends StObject
       with FunctionComponent[TableBatchActionsProps] {
    
    val translationKeys: js.Array[TableBatchActionsTranslationKey] = js.native
  }
  
  trait TableBatchActionsProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with InternationalProps[TableBatchActionsTranslationKey, TableBatchActionsTranslationArgs] {
    
    def onCancel(event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
    
    var shouldShowBatchActions: js.UndefOr[Boolean] = js.undefined
    
    var totalSelected: Double
  }
  object TableBatchActionsProps {
    
    inline def apply(onCancel: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit, totalSelected: Double): TableBatchActionsProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction1(onCancel), totalSelected = totalSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableBatchActionsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableBatchActionsProps] (val x: Self) extends AnyVal {
      
      inline def setOnCancel(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setShouldShowBatchActions(value: Boolean): Self = StObject.set(x, "shouldShowBatchActions", value.asInstanceOf[js.Any])
      
      inline def setShouldShowBatchActionsUndefined: Self = StObject.set(x, "shouldShowBatchActions", js.undefined)
      
      inline def setTotalSelected(value: Double): Self = StObject.set(x, "totalSelected", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableBatchActionsTranslationArgs extends StObject {
    
    var totalSelected: js.UndefOr[Double] = js.undefined
  }
  object TableBatchActionsTranslationArgs {
    
    inline def apply(): TableBatchActionsTranslationArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableBatchActionsTranslationArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableBatchActionsTranslationArgs] (val x: Self) extends AnyVal {
      
      inline def setTotalSelected(value: Double): Self = StObject.set(x, "totalSelected", value.asInstanceOf[js.Any])
      
      inline def setTotalSelectedUndefined: Self = StObject.set(x, "totalSelected", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotcancel
    - typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemsDotselected
    - typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemDotselected
  */
  trait TableBatchActionsTranslationKey
    extends StObject
       with _CarbonTranslationKey
  object TableBatchActionsTranslationKey {
    
    inline def carbonDottableDotbatchDotcancel: typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotcancel = "carbon.table.batch.cancel".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotcancel]
    
    inline def carbonDottableDotbatchDotitemDotselected: typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemDotselected = "carbon.table.batch.item.selected".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemDotselected]
    
    inline def carbonDottableDotbatchDotitemsDotselected: typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemsDotselected = "carbon.table.batch.items.selected".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemsDotselected]
  }
  
  type _To = TableBatchActionsFC
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableTableBatchActionsMod.foo` */
  override def _to: TableBatchActionsFC = default
}
