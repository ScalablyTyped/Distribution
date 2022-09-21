package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.AffectsDataRange
import typings.ckeditorCkeditor5Engine.anon.Backward
import typings.ckeditorCkeditor5Engine.anon.Position
import typings.ckeditorCkeditor5Engine.anon.UsingOperation
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typings.ckeditorCkeditor5Engine.itemMod.Item
import typings.ckeditorCkeditor5Engine.markercollectionMod.Marker
import typings.ckeditorCkeditor5Engine.modelMod.Model
import typings.ckeditorCkeditor5Engine.positionMod.PositionStickiness
import typings.ckeditorCkeditor5Engine.selectionMod.Selectable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/writer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Writer
  
  @js.native
  trait Writer extends StObject {
    
    def addMarker(name: String): Marker = js.native
    def addMarker(name: String, options: UsingOperation): Marker = js.native
    
    def append(
      item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      parent: typings.ckeditorCkeditor5Engine.documentfragmentMod.default
    ): Unit = js.native
    def append(
      item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      parent: typings.ckeditorCkeditor5Engine.elementMod.default
    ): Unit = js.native
    def append(item: Item, parent: typings.ckeditorCkeditor5Engine.documentfragmentMod.default): Unit = js.native
    def append(item: Item, parent: typings.ckeditorCkeditor5Engine.elementMod.default): Unit = js.native
    
    def appendElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      parent: typings.ckeditorCkeditor5Engine.documentfragmentMod.default
    ): Unit = js.native
    def appendElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      parent: typings.ckeditorCkeditor5Engine.elementMod.default
    ): Unit = js.native
    def appendElement(name: String, parent: typings.ckeditorCkeditor5Engine.documentfragmentMod.default): Unit = js.native
    def appendElement(name: String, parent: typings.ckeditorCkeditor5Engine.elementMod.default): Unit = js.native
    
    def appendText(
      text: String,
      attributes: Record[String, String | Double | Boolean],
      parent: typings.ckeditorCkeditor5Engine.documentfragmentMod.default
    ): Unit = js.native
    def appendText(
      text: String,
      attributes: Record[String, String | Double | Boolean],
      parent: typings.ckeditorCkeditor5Engine.elementMod.default
    ): Unit = js.native
    def appendText(text: String, parent: typings.ckeditorCkeditor5Engine.documentfragmentMod.default): Unit = js.native
    def appendText(text: String, parent: typings.ckeditorCkeditor5Engine.elementMod.default): Unit = js.native
    
    val batch: typings.ckeditorCkeditor5Engine.batchMod.default = js.native
    
    def clearAttributes(itemOrRange: Item): Unit = js.native
    def clearAttributes(itemOrRange: typings.ckeditorCkeditor5Engine.rangeMod.default): Unit = js.native
    
    def cloneElement(element: typings.ckeditorCkeditor5Engine.elementMod.default): typings.ckeditorCkeditor5Engine.elementMod.default = js.native
    def cloneElement(element: typings.ckeditorCkeditor5Engine.elementMod.default, deep: Boolean): typings.ckeditorCkeditor5Engine.elementMod.default = js.native
    
    def createDocumentFragment(): typings.ckeditorCkeditor5Engine.documentfragmentMod.default = js.native
    
    def createElement(name: String): typings.ckeditorCkeditor5Engine.elementMod.default = js.native
    def createElement(name: String, attributes: Record[String, String | Double | Boolean]): typings.ckeditorCkeditor5Engine.elementMod.default = js.native
    
    def createPositionAfter(item: Item): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
    def createPositionAt(itemOrPosition: typings.ckeditorCkeditor5Engine.documentfragmentMod.default): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    def createPositionAt(
      itemOrPosition: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      offset: end | before | after
    ): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    def createPositionAt(itemOrPosition: typings.ckeditorCkeditor5Engine.documentfragmentMod.default, offset: Double): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    def createPositionAt(itemOrPosition: Item): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: end | before | after): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: Double): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    def createPositionAt(itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
    def createPositionBefore(item: Item): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
    def createPositionFromPath(root: typings.ckeditorCkeditor5Engine.documentfragmentMod.default, path: js.Array[Double]): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    def createPositionFromPath(
      root: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    def createPositionFromPath(root: typings.ckeditorCkeditor5Engine.elementMod.default, path: js.Array[Double]): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    def createPositionFromPath(
      root: typings.ckeditorCkeditor5Engine.elementMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ): typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
    def createRange(start: typings.ckeditorCkeditor5Engine.positionMod.default): typings.ckeditorCkeditor5Engine.rangeMod.default = js.native
    def createRange(
      start: typings.ckeditorCkeditor5Engine.positionMod.default,
      end: typings.ckeditorCkeditor5Engine.positionMod.default
    ): typings.ckeditorCkeditor5Engine.rangeMod.default = js.native
    
    def createRangeIn(element: typings.ckeditorCkeditor5Engine.elementMod.default): typings.ckeditorCkeditor5Engine.rangeMod.default = js.native
    
    def createRangeOn(element: typings.ckeditorCkeditor5Engine.elementMod.default): typings.ckeditorCkeditor5Engine.rangeMod.default = js.native
    
    def createSelection(selectable: Selectable): typings.ckeditorCkeditor5Engine.selectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): typings.ckeditorCkeditor5Engine.selectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward): typings.ckeditorCkeditor5Engine.selectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double): typings.ckeditorCkeditor5Engine.selectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double, options: Backward): typings.ckeditorCkeditor5Engine.selectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Unit, options: Backward): typings.ckeditorCkeditor5Engine.selectionMod.default = js.native
    
    def createText(data: String): typings.ckeditorCkeditor5Engine.textMod.default = js.native
    def createText(data: String, attributes: Record[String, String | Double | Boolean]): typings.ckeditorCkeditor5Engine.textMod.default = js.native
    
    def insert(item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default): Unit = js.native
    def insert(
      item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      itemOrPosition: Null,
      offset: end | before | after
    ): Unit = js.native
    def insert(
      item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      itemOrPosition: Null,
      offset: Double
    ): Unit = js.native
    def insert(item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default, itemOrPosition: Item): Unit = js.native
    def insert(
      item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      itemOrPosition: Item,
      offset: end | before | after
    ): Unit = js.native
    def insert(
      item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      itemOrPosition: Item,
      offset: Double
    ): Unit = js.native
    def insert(
      item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    ): Unit = js.native
    def insert(
      item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insert(
      item: typings.ckeditorCkeditor5Engine.documentfragmentMod.default,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: Double
    ): Unit = js.native
    def insert(item: Item): Unit = js.native
    def insert(item: Item, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insert(item: Item, itemOrPosition: Null, offset: Double): Unit = js.native
    def insert(item: Item, itemOrPosition: Item): Unit = js.native
    def insert(item: Item, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insert(item: Item, itemOrPosition: Item, offset: Double): Unit = js.native
    def insert(item: Item, itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default): Unit = js.native
    def insert(
      item: Item,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insert(item: Item, itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default, offset: Double): Unit = js.native
    
    def insertElement(name: String): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Null, offset: Double): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Unit, offset: end | before | after): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Unit, offset: Double): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Item): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Item, offset: Double): Unit = js.native
    def insertElement(
      name: String,
      attributes: Unit,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Unit,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Unit,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: Double
    ): Unit = js.native
    def insertElement(name: String, attributes: Record[String, String | Double | Boolean]): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Null,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Null,
      offset: Double
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Unit,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Unit,
      offset: Double
    ): Unit = js.native
    def insertElement(name: String, attributes: Record[String, String | Double | Boolean], itemOrPosition: Item): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Item,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Item,
      offset: Double
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: Double
    ): Unit = js.native
    def insertElement(name: String, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insertElement(name: String, itemOrPosition: Null, offset: Double): Unit = js.native
    def insertElement(name: String, itemOrPosition: Item): Unit = js.native
    def insertElement(name: String, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insertElement(name: String, itemOrPosition: Item, offset: Double): Unit = js.native
    def insertElement(name: String, itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default): Unit = js.native
    def insertElement(
      name: String,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(name: String, itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default, offset: Double): Unit = js.native
    
    def insertText(data: String): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Null, offset: Double): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Unit, offset: end | before | after): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Unit, offset: Double): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Item): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Item, offset: Double): Unit = js.native
    def insertText(
      data: String,
      attributes: Unit,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Unit,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Unit,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: Double
    ): Unit = js.native
    def insertText(data: String, attributes: Record[String, String | Double | Boolean]): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Null,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Null,
      offset: Double
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Unit,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Unit,
      offset: Double
    ): Unit = js.native
    def insertText(data: String, attributes: Record[String, String | Double | Boolean], itemOrPosition: Item): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Item,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Item,
      offset: Double
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: Double
    ): Unit = js.native
    def insertText(data: String, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insertText(data: String, itemOrPosition: Null, offset: Double): Unit = js.native
    def insertText(data: String, itemOrPosition: Unit, offset: end | before | after): Unit = js.native
    def insertText(data: String, itemOrPosition: Unit, offset: Double): Unit = js.native
    def insertText(data: String, itemOrPosition: Item): Unit = js.native
    def insertText(data: String, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insertText(data: String, itemOrPosition: Item, offset: Double): Unit = js.native
    def insertText(data: String, itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default): Unit = js.native
    def insertText(
      data: String,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertText(data: String, itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default, offset: Double): Unit = js.native
    
    def merge(position: typings.ckeditorCkeditor5Engine.positionMod.default): Unit = js.native
    
    val model: Model = js.native
    
    def move(range: typings.ckeditorCkeditor5Engine.rangeMod.default, itemOrPosition: Item): Unit = js.native
    def move(
      range: typings.ckeditorCkeditor5Engine.rangeMod.default,
      itemOrPosition: Item,
      offset: end | before | after
    ): Unit = js.native
    def move(range: typings.ckeditorCkeditor5Engine.rangeMod.default, itemOrPosition: Item, offset: Double): Unit = js.native
    def move(
      range: typings.ckeditorCkeditor5Engine.rangeMod.default,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    ): Unit = js.native
    def move(
      range: typings.ckeditorCkeditor5Engine.rangeMod.default,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def move(
      range: typings.ckeditorCkeditor5Engine.rangeMod.default,
      itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      offset: Double
    ): Unit = js.native
    
    def overrideSelectionGravity(): String = js.native
    
    def remove(itemOrRange: Item): Unit = js.native
    def remove(itemOrRange: typings.ckeditorCkeditor5Engine.rangeMod.default): Unit = js.native
    
    def removeAttribute(key: String, itemOrRange: Item): Unit = js.native
    def removeAttribute(key: String, itemOrRange: typings.ckeditorCkeditor5Engine.rangeMod.default): Unit = js.native
    
    def removeMarker(markerOrName: String): Unit = js.native
    def removeMarker(markerOrName: Marker): Unit = js.native
    
    def removeSelectionAttribute(keyOrIterableOfKeys: String): Unit = js.native
    def removeSelectionAttribute(keyOrIterableOfKeys: js.Array[String]): Unit = js.native
    
    def rename(element: typings.ckeditorCkeditor5Engine.elementMod.default, newName: String): Unit = js.native
    
    def restoreSelectionGravity(uid: String): Unit = js.native
    
    def setAttribute(key: String, value: String, itemOrRange: Item): Unit = js.native
    def setAttribute(key: String, value: String, itemOrRange: typings.ckeditorCkeditor5Engine.rangeMod.default): Unit = js.native
    def setAttribute(key: String, value: Boolean, itemOrRange: Item): Unit = js.native
    def setAttribute(key: String, value: Boolean, itemOrRange: typings.ckeditorCkeditor5Engine.rangeMod.default): Unit = js.native
    def setAttribute(key: String, value: Double, itemOrRange: Item): Unit = js.native
    def setAttribute(key: String, value: Double, itemOrRange: typings.ckeditorCkeditor5Engine.rangeMod.default): Unit = js.native
    def setAttribute(key: String, value: Record[String, String | Double | Boolean], itemOrRange: Item): Unit = js.native
    def setAttribute(
      key: String,
      value: Record[String, String | Double | Boolean],
      itemOrRange: typings.ckeditorCkeditor5Engine.rangeMod.default
    ): Unit = js.native
    
    def setAttributes(
      attributes: Record[String, String | Double | Boolean | (Record[String, String | Double | Boolean])],
      itemOrRange: Item
    ): Unit = js.native
    def setAttributes(
      attributes: Record[String, String | Double | Boolean | (Record[String, String | Double | Boolean])],
      itemOrRange: typings.ckeditorCkeditor5Engine.rangeMod.default
    ): Unit = js.native
    
    def setSelection(selectable: Selectable): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Double): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Double, options: Backward): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Unit, options: Backward): Unit = js.native
    
    def setSelectionAttribute(keyOrObjectOrIterable: String, value: String): Unit = js.native
    def setSelectionAttribute(keyOrObjectOrIterable: String, value: Boolean): Unit = js.native
    def setSelectionAttribute(keyOrObjectOrIterable: String, value: Double): Unit = js.native
    def setSelectionAttribute(keyOrObjectOrIterable: js.Array[js.Tuple2[String, String | Double | Boolean]]): Unit = js.native
    def setSelectionAttribute(keyOrObjectOrIterable: Record[String, String | Double | Boolean]): Unit = js.native
    
    def setSelectionFocus(itemOrPosition: Item): Unit = js.native
    def setSelectionFocus(itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def setSelectionFocus(itemOrPosition: Item, offset: Double): Unit = js.native
    def setSelectionFocus(itemOrPosition: typings.ckeditorCkeditor5Engine.positionMod.default): Unit = js.native
    
    def split(position: typings.ckeditorCkeditor5Engine.positionMod.default): Position = js.native
    def split(
      position: typings.ckeditorCkeditor5Engine.positionMod.default,
      limitElement: typings.ckeditorCkeditor5Engine.nodeMod.default
    ): Position = js.native
    
    def unwrap(element: typings.ckeditorCkeditor5Engine.elementMod.default): Unit = js.native
    
    def updateMarker(markerOrName: String): Unit = js.native
    def updateMarker(markerOrName: String, options: AffectsDataRange): Unit = js.native
    def updateMarker(markerOrName: Marker): Unit = js.native
    def updateMarker(markerOrName: Marker, options: AffectsDataRange): Unit = js.native
    
    def wrap(range: typings.ckeditorCkeditor5Engine.rangeMod.default, elementOrString: String): Unit = js.native
    def wrap(
      range: typings.ckeditorCkeditor5Engine.rangeMod.default,
      elementOrString: typings.ckeditorCkeditor5Engine.elementMod.default
    ): Unit = js.native
  }
}
