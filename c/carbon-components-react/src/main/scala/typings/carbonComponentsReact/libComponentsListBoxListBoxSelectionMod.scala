package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.carbonComponentsReact.typingsTranslationMod._CarbonTranslationKey
import typings.react.mod.FC
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsListBoxListBoxSelectionMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ListBox/ListBoxSelection", JSImport.Default)
  @js.native
  val default: ListBoxSelectionComponent = js.native
  
  type ListBoxSelectionComponent = FC[ListBoxSelectionProps]
  
  @js.native
  trait ListBoxSelectionProps
    extends StObject
       with InternationalProps[ListBoxSelectionTranslationKey, Record[String, Any]] {
    
    def clearSelection(e: KeyboardEvent[HTMLDivElement]): Unit = js.native
    def clearSelection(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onClearSelection: js.UndefOr[
        js.Function1[
          /* event */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var selectionCount: js.UndefOr[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.clearDotall
    - typings.carbonComponentsReact.carbonComponentsReactStrings.clearDotselection
  */
  trait ListBoxSelectionTranslationKey
    extends StObject
       with _CarbonTranslationKey
  object ListBoxSelectionTranslationKey {
    
    inline def clearDotall: typings.carbonComponentsReact.carbonComponentsReactStrings.clearDotall = "clear.all".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.clearDotall]
    
    inline def clearDotselection: typings.carbonComponentsReact.carbonComponentsReactStrings.clearDotselection = "clear.selection".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.clearDotselection]
  }
  
  type _To = ListBoxSelectionComponent
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsListBoxListBoxSelectionMod.foo` */
  override def _to: ListBoxSelectionComponent = default
}
