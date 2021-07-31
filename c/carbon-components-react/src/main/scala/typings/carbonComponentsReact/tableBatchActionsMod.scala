package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.translationMod._CarbonTranslationKey
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBatchActionsMod extends Shortcut {
  
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
       with InternationalProps[TableBatchActionsTranslationKey] {
    
    def onCancel(event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
    
    var shouldShowBatchActions: js.UndefOr[Boolean] = js.undefined
    
    var totalSelected: Double
  }
  object TableBatchActionsProps {
    
    @scala.inline
    def apply(onCancel: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit, totalSelected: Double): TableBatchActionsProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction1(onCancel), totalSelected = totalSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableBatchActionsProps]
    }
    
    @scala.inline
    implicit class TableBatchActionsPropsMutableBuilder[Self <: TableBatchActionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCancel(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldShowBatchActions(value: Boolean): Self = StObject.set(x, "shouldShowBatchActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldShowBatchActionsUndefined: Self = StObject.set(x, "shouldShowBatchActions", js.undefined)
      
      @scala.inline
      def setTotalSelected(value: Double): Self = StObject.set(x, "totalSelected", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def carbonDottableDotbatchDotcancel: typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotcancel = "carbon.table.batch.cancel".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotcancel]
    
    @scala.inline
    def carbonDottableDotbatchDotitemDotselected: typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemDotselected = "carbon.table.batch.item.selected".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemDotselected]
    
    @scala.inline
    def carbonDottableDotbatchDotitemsDotselected: typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemsDotselected = "carbon.table.batch.items.selected".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotbatchDotitemsDotselected]
  }
  
  type _To = TableBatchActionsFC
  
  /* This means you don't have to write `default`, but can instead just say `tableBatchActionsMod.foo` */
  override def _to: TableBatchActionsFC = default
}
