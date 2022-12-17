package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Fake
import typings.ckeditorCkeditor5Engine.anon.IsAllowedInsideAttributeElement
import typings.ckeditorCkeditor5Engine.anon.IsAllowedInsideAttributeElementRenderUnsafeAttributes
import typings.ckeditorCkeditor5Engine.anon.RenderUnsafeAttributes
import typings.ckeditorCkeditor5Engine.anon.`13`
import typings.ckeditorCkeditor5Engine.anon.`14`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typings.ckeditorCkeditor5Engine.srcViewItemMod.Item
import typings.ckeditorCkeditor5Engine.srcViewSelectionMod.Selectable
import typings.ckeditorCkeditor5Engine.srcViewViewMod.View
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewDowncastwriterMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/downcastwriter", JSImport.Default)
  @js.native
  open class default[D /* <: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default */] protected ()
    extends StObject
       with DowncastWriter[D] {
    def this(document: D) = this()
  }
  
  @js.native
  trait DowncastWriter[D /* <: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default */] extends StObject {
    
    def addClass(className: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def addClass(className: js.Array[String], element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def breakAttributes(positionOrRange: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default | typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def breakAttributes(positionOrRange: typings.ckeditorCkeditor5Engine.srcViewRangeMod.default): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default | typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def breakContainer(position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def clear(
      range: typings.ckeditorCkeditor5Engine.srcViewRangeMod.default,
      element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def clearClonedElementsGroup(groupName: String): Unit = js.native
    
    def createAttributeElement(name: String): typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default = js.native
    def createAttributeElement(name: String, attributes: Unit, options: RenderUnsafeAttributes): typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default = js.native
    def createAttributeElement(name: String, attributes: Record[String, String]): typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default = js.native
    def createAttributeElement(name: String, attributes: Record[String, String], options: RenderUnsafeAttributes): typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default = js.native
    
    def createContainerElement(name: String): typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    def createContainerElement(name: String, attributes: Unit, options: IsAllowedInsideAttributeElement): typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    def createContainerElement(name: String, attributes: Record[String, String]): typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    def createContainerElement(name: String, attributes: Record[String, String], options: IsAllowedInsideAttributeElement): typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    
    def createDocumentFragment(children: js.Iterable[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default]): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def createDocumentFragment(children: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    def createEditableElement(name: String): typings.ckeditorCkeditor5Engine.srcViewEditableelementMod.default = js.native
    def createEditableElement(name: String, attributes: Unit, options: `13`): typings.ckeditorCkeditor5Engine.srcViewEditableelementMod.default = js.native
    def createEditableElement(name: String, attributes: Record[String, String]): typings.ckeditorCkeditor5Engine.srcViewEditableelementMod.default = js.native
    def createEditableElement(name: String, attributes: Record[String, String], options: `13`): typings.ckeditorCkeditor5Engine.srcViewEditableelementMod.default = js.native
    
    def createEmptyElement(name: String): typings.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default = js.native
    def createEmptyElement(name: String, attributes: Unit, options: IsAllowedInsideAttributeElement): typings.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default = js.native
    def createEmptyElement(name: String, attributes: Record[String, String]): typings.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default = js.native
    def createEmptyElement(name: String, attributes: Record[String, String], options: IsAllowedInsideAttributeElement): typings.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default = js.native
    
    def createPositionAfter(item: Item): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createPositionAt(itemOrPosition: Item): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: end | before | after): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: Double): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createPositionBefore(item: Item): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createRange(start: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def createRange(
      start: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      end: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def createRangeIn(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def createRangeOn(item: Item): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    /**
      * Creates a new {@link module:engine/view/rawelement~RawElement}.
      *
      *    writer.createRawElement( 'span', { id: 'foo-1234' }, function( domElement ) {
      *      domElement.innerHTML = '<b>This is the raw content of the raw element.</b>';
      *    } );
      *
      * Raw elements work as data containers ("wrappers", "sandboxes") but their children are not managed or
      * even recognized by the editor. This encapsulation allows integrations to maintain custom DOM structures
      * in the editor content without, for instance, worrying about compatibility with other editor features.
      * Raw elements are a perfect tool for integration with external frameworks and data sources.
      *
      * Unlike {@link #createUIElement UI elements}, raw elements act like "real" editor content (similar to
      * {@link module:engine/view/containerelement~ContainerElement} or {@link module:engine/view/emptyelement~EmptyElement}),
      * and they are considered by the editor selection.
      *
      * You should not use raw elements to render the UI in the editor content. Check out {@link #createUIElement `#createUIElement()`}
      * instead.
      */
    def createRawElement(name: String): typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Unit,
      renderFunction: js.ThisFunction2[
          /* this */ DowncastWriter[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ]
    ): typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Unit,
      renderFunction: js.ThisFunction2[
          /* this */ DowncastWriter[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ],
      options: IsAllowedInsideAttributeElementRenderUnsafeAttributes
    ): typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Unit,
      renderFunction: Unit,
      options: IsAllowedInsideAttributeElementRenderUnsafeAttributes
    ): typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(name: String, attributes: Record[String, String]): typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: js.ThisFunction2[
          /* this */ DowncastWriter[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ]
    ): typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: js.ThisFunction2[
          /* this */ DowncastWriter[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ],
      options: IsAllowedInsideAttributeElementRenderUnsafeAttributes
    ): typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: Unit,
      options: IsAllowedInsideAttributeElementRenderUnsafeAttributes
    ): typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    
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
    
    def createUIElement(name: String): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Null,
      renderFunction: js.ThisFunction1[
          /* this */ typings.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ]
    ): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Null,
      renderFunction: js.ThisFunction1[
          /* this */ typings.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ],
      options: `14`
    ): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(name: String, attributes: Null, renderFunction: Unit, options: `14`): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Unit,
      renderFunction: js.ThisFunction1[
          /* this */ typings.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ]
    ): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Unit,
      renderFunction: js.ThisFunction1[
          /* this */ typings.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ],
      options: `14`
    ): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(name: String, attributes: Unit, renderFunction: Unit, options: `14`): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(name: String, attributes: Record[String, String]): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: js.ThisFunction1[
          /* this */ typings.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ]
    ): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: js.ThisFunction1[
          /* this */ typings.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ],
      options: `14`
    ): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(name: String, attributes: Record[String, String], renderFunction: Unit, options: `14`): typings.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    
    val document: D = js.native
    
    def insert(
      position: Null,
      nodes: js.Iterable[
          typings.ckeditorCkeditor5Engine.srcViewTextMod.default | typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default | typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default | typings.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default | typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default | typings.ckeditorCkeditor5Engine.srcViewUielementMod.default
        ]
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typings.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typings.ckeditorCkeditor5Engine.srcViewTextMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typings.ckeditorCkeditor5Engine.srcViewUielementMod.default): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: js.Iterable[
          typings.ckeditorCkeditor5Engine.srcViewTextMod.default | typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default | typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default | typings.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default | typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default | typings.ckeditorCkeditor5Engine.srcViewUielementMod.default
        ]
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typings.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typings.ckeditorCkeditor5Engine.srcViewRawelementMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typings.ckeditorCkeditor5Engine.srcViewTextMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typings.ckeditorCkeditor5Engine.srcViewUielementMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def mergeAttributes(position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def mergeContainers(position: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): typings.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def move(
      sourceRange: typings.ckeditorCkeditor5Engine.srcViewRangeMod.default,
      targetPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def remove(rangeOrItem: Item): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def remove(rangeOrItem: typings.ckeditorCkeditor5Engine.srcViewRangeMod.default): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    def removeAttribute(key: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def removeClass(className: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def removeCustomProperty(key: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Boolean = js.native
    
    def removeStyle(property: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def rename(newName: String, viewElement: typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default): typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    
    def setAttribute(key: String, value: String, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def setCustomProperty(key: String, value: Any, element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def setSelection(selectable: Selectable): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Fake): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Double): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Double, options: Fake): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Unit, options: Fake): Unit = js.native
    
    def setSelectionFocus(itemOrPosition: Item): Unit = js.native
    def setSelectionFocus(itemOrPosition: typings.ckeditorCkeditor5Engine.srcViewPositionMod.default): Unit = js.native
    def setSelectionFocus(itemOrPosition: View): Unit = js.native
    def setSelectionFocus(itemOrPosition: View, offset: end | before | after): Unit = js.native
    def setSelectionFocus(itemOrPosition: View, offset: Double): Unit = js.native
    
    def setStyle(
      property: String,
      value: String,
      element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    def setStyle(
      property: Record[String, String],
      element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def unwrap(
      range: typings.ckeditorCkeditor5Engine.srcViewRangeMod.default,
      attribute: typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default
    ): Unit = js.native
    
    def wrap(
      range: typings.ckeditorCkeditor5Engine.srcViewRangeMod.default,
      attribute: typings.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default
    ): typings.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
  }
}
