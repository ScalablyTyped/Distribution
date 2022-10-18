package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Fake
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typings.ckeditorCkeditor5Engine.srcViewItemMod.Item
import typings.ckeditorCkeditor5Engine.srcViewSelectionMod.Selectable
import typings.std.Range
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewUpcastwriterMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/upcastwriter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with UpcastWriter {
    def this(document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default) = this()
  }
  
  @js.native
  trait UpcastWriter extends StObject {
    
    def addClass(className: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def addClass(className: js.Array[String], element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def appendChild(items: js.Iterable[Item], element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Double = js.native
    def appendChild(items: Item, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Double = js.native
    
    def clone(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def clone(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default, deep: Boolean): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    
    def createDocumentFragment(): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def createDocumentFragment(children: js.Iterable[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default]): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def createDocumentFragment(children: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    def createElement(name: String): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(name: String, attrs: js.Array[js.Tuple2[String, String]]): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: js.Array[js.Tuple2[String, String]],
      children: js.Iterable[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    ): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: js.Array[js.Tuple2[String, String]],
      children: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: Unit,
      children: js.Iterable[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    ): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(name: String, attrs: Unit, children: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(name: String, attrs: Record[String, String]): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: Record[String, String],
      children: js.Iterable[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    ): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: Record[String, String],
      children: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    
    def createPositionAfter(item: Item): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createPositionAt(itemOrPosition: Item): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: end | before | after): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: Double): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createPositionBefore(item: Item): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createRange(start: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): Range = js.native
    def createRange(
      start: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      end: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ): Range = js.native
    
    def createRangeIn(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Range = js.native
    
    def createRangeOn(item: Item): Range = js.native
    
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
    
    def createText(data: String): typings.ckeditorCkeditor5Engine.srcViewTextMod.default = js.native
    
    val document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default = js.native
    
    def insertChild(
      index: Double,
      items: js.Iterable[Item],
      element: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
    ): Double = js.native
    def insertChild(
      index: Double,
      items: js.Iterable[Item],
      element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Double = js.native
    def insertChild(
      index: Double,
      items: Item,
      element: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
    ): Double = js.native
    def insertChild(index: Double, items: Item, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Double = js.native
    
    def remove(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): js.Array[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    def removeAttribute(key: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def removeChildren(index: Double, howMany: Double, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): js.Array[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    def removeClass(className: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def removeClass(className: js.Array[String], element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def removeCustomProperty(key: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Boolean = js.native
    
    def removeStyle(property: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def removeStyle(property: js.Array[String], element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def rename(newName: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): typings.ckeditorCkeditor5Engine.srcViewElementMod.default | Null = js.native
    
    def replace(
      oldElement: typings.ckeditorCkeditor5Engine.srcViewElementMod.default,
      newElement: typings.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Boolean = js.native
    
    def setAttribute(key: String, value: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def setCustomProperty(key: String, value: Any, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def setStyle(
      property: String,
      value: String,
      element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    def setStyle(
      property: Record[String, String],
      element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def unwrapElement(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
  }
}
