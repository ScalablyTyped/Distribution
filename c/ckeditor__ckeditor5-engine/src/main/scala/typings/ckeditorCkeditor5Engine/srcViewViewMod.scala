package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.Instantiable1
import typings.ckeditorCkeditor5Engine.anon.Fake
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typings.ckeditorCkeditor5Engine.srcViewItemMod.Item
import typings.ckeditorCkeditor5Engine.srcViewObserverArrowkeysobserverMod.ArrowKeysObserver
import typings.ckeditorCkeditor5Engine.srcViewObserverClickobserverMod.ClickObserver
import typings.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.DomEventObserver
import typings.ckeditorCkeditor5Engine.srcViewObserverFakeselectionobserverMod.FakeSelectionObserver
import typings.ckeditorCkeditor5Engine.srcViewObserverFocusobserverMod.FocusObserver
import typings.ckeditorCkeditor5Engine.srcViewObserverInputobserverMod.InputObserver
import typings.ckeditorCkeditor5Engine.srcViewObserverKeyobserverMod.KeyObserver
import typings.ckeditorCkeditor5Engine.srcViewObserverMouseobserverMod.MouseObserver
import typings.ckeditorCkeditor5Engine.srcViewObserverSelectionobserverMod.SelectionObserver
import typings.ckeditorCkeditor5Engine.srcViewSelectionMod.Selectable
import typings.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor
import typings.std.HTMLElement
import typings.std.Map
import typings.std.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewViewMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/view", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with View {
    def this(stylesProcessor: StylesProcessor) = this()
  }
  
  trait Observers extends StObject {
    
    var ArrowKeysObserver: typings.ckeditorCkeditor5Engine.srcViewObserverArrowkeysobserverMod.ArrowKeysObserver
    
    var ClickObserver: typings.ckeditorCkeditor5Engine.srcViewObserverClickobserverMod.ClickObserver
    
    var DomEventObserver: typings.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.DomEventObserver
    
    var FakeSelectionObserver: typings.ckeditorCkeditor5Engine.srcViewObserverFakeselectionobserverMod.FakeSelectionObserver
    
    var FocusObserver: typings.ckeditorCkeditor5Engine.srcViewObserverFocusobserverMod.FocusObserver
    
    var InputObserver: typings.ckeditorCkeditor5Engine.srcViewObserverInputobserverMod.InputObserver
    
    var KeyObserver: typings.ckeditorCkeditor5Engine.srcViewObserverKeyobserverMod.KeyObserver
    
    var MouseObserver: typings.ckeditorCkeditor5Engine.srcViewObserverMouseobserverMod.MouseObserver
    
    var MutationObserver: typings.std.MutationObserver
    
    var SelectionObserver: typings.ckeditorCkeditor5Engine.srcViewObserverSelectionobserverMod.SelectionObserver
  }
  object Observers {
    
    inline def apply(
      ArrowKeysObserver: ArrowKeysObserver,
      ClickObserver: ClickObserver,
      DomEventObserver: DomEventObserver,
      FakeSelectionObserver: FakeSelectionObserver,
      FocusObserver: FocusObserver,
      InputObserver: InputObserver,
      KeyObserver: KeyObserver,
      MouseObserver: MouseObserver,
      MutationObserver: MutationObserver,
      SelectionObserver: SelectionObserver
    ): Observers = {
      val __obj = js.Dynamic.literal(ArrowKeysObserver = ArrowKeysObserver.asInstanceOf[js.Any], ClickObserver = ClickObserver.asInstanceOf[js.Any], DomEventObserver = DomEventObserver.asInstanceOf[js.Any], FakeSelectionObserver = FakeSelectionObserver.asInstanceOf[js.Any], FocusObserver = FocusObserver.asInstanceOf[js.Any], InputObserver = InputObserver.asInstanceOf[js.Any], KeyObserver = KeyObserver.asInstanceOf[js.Any], MouseObserver = MouseObserver.asInstanceOf[js.Any], MutationObserver = MutationObserver.asInstanceOf[js.Any], SelectionObserver = SelectionObserver.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observers] (val x: Self) extends AnyVal {
      
      inline def setArrowKeysObserver(value: ArrowKeysObserver): Self = StObject.set(x, "ArrowKeysObserver", value.asInstanceOf[js.Any])
      
      inline def setClickObserver(value: ClickObserver): Self = StObject.set(x, "ClickObserver", value.asInstanceOf[js.Any])
      
      inline def setDomEventObserver(value: DomEventObserver): Self = StObject.set(x, "DomEventObserver", value.asInstanceOf[js.Any])
      
      inline def setFakeSelectionObserver(value: FakeSelectionObserver): Self = StObject.set(x, "FakeSelectionObserver", value.asInstanceOf[js.Any])
      
      inline def setFocusObserver(value: FocusObserver): Self = StObject.set(x, "FocusObserver", value.asInstanceOf[js.Any])
      
      inline def setInputObserver(value: InputObserver): Self = StObject.set(x, "InputObserver", value.asInstanceOf[js.Any])
      
      inline def setKeyObserver(value: KeyObserver): Self = StObject.set(x, "KeyObserver", value.asInstanceOf[js.Any])
      
      inline def setMouseObserver(value: MouseObserver): Self = StObject.set(x, "MouseObserver", value.asInstanceOf[js.Any])
      
      inline def setMutationObserver(value: MutationObserver): Self = StObject.set(x, "MutationObserver", value.asInstanceOf[js.Any])
      
      inline def setSelectionObserver(value: SelectionObserver): Self = StObject.set(x, "SelectionObserver", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable * / any */ @js.native
  trait View extends StObject {
    
    def addObserver[T /* <: typings.ckeditorCkeditor5Engine.srcViewObserverObserverMod.default[View] */](key: Instantiable1[/* view */ View, T]): T = js.native
    
    def attachDomRoot(domRoot: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def attachDomRoot(domRoot: typings.ckeditorCkeditor5Engine.srcViewElementMod.default, name: String): Unit = js.native
    
    def change(
      callback: js.Function1[
          /* writer */ typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          Unit
        ]
    ): View = js.native
    
    def createPositionAfter(item: Item): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createPositionAt(itemOrPosition: Item): Unit = js.native
    def createPositionAt(itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def createPositionAt(itemOrPosition: Item, offset: Double): Unit = js.native
    def createPositionAt(itemOrPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): Unit = js.native
    
    def createPositionBefore(item: Item): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createRange(start: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def createRange(
      start: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      end: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def createRangeIn(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def createRangeOn(item: Item): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def createSelection(): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: before | end | after | on | in): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: before | end | after | on | in, options: Fake): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Double): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Double, options: Fake): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Unit, options: Fake): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Fake): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double, options: Fake): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Unit, options: Fake): typings.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    
    def destroy(): Unit = js.native
    
    def detachDomRoot(name: String): Unit = js.native
    
    def disableObservers(): Unit = js.native
    
    val document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default = js.native
    
    val domConverter: typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default = js.native
    
    val domRoots: Map[String, HTMLElement] = js.native
    
    def enableObservers(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def forceRender(): Unit = js.native
    
    def getDomRoot(): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def getDomRoot(name: String): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    
    def getObserver[T /* <: typings.ckeditorCkeditor5Engine.srcViewObserverObserverMod.default[View] */](key: Instantiable1[/* view */ View, T]): T = js.native
    
    val hasDomSelection: Boolean = js.native
    
    val isRenderingInProgress: Boolean = js.native
    
    def scrollToTheSelection(): Unit = js.native
  }
}
