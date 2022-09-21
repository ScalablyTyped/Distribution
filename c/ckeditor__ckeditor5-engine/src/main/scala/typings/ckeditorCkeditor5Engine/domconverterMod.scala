package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Bind
import typings.ckeditorCkeditor5Engine.anon.KeepOriginalCase
import typings.ckeditorCkeditor5Engine.anon.Offset
import typings.ckeditorCkeditor5Engine.anon.WithChildren
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.`object`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.audio
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.button
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.canvas
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.data
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.editing
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.embed
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.iframe
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.img
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.input
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.option
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.pre
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.select
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textarea
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.video
import typings.ckeditorCkeditor5Engine.matcherMod.MatcherPattern
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Generator
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Range
import typings.std.Selection
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domconverterMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/domconverter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DomConverter {
    def this(document: typings.ckeditorCkeditor5Engine.viewDocumentMod.default) = this()
    def this(
      document: typings.ckeditorCkeditor5Engine.viewDocumentMod.default,
      options: typings.ckeditorCkeditor5Engine.anon.BlockFillerMode
    ) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.br
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.nbsp
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.markedNbsp
  */
  trait BlockFillerMode extends StObject
  object BlockFillerMode {
    
    inline def br: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.br = "br".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.br]
    
    inline def markedNbsp: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.markedNbsp = "markedNbsp".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.markedNbsp]
    
    inline def nbsp: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.nbsp = "nbsp".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.nbsp]
  }
  
  @js.native
  trait DomConverter extends StObject {
    
    def bindDocumentFragments(
      domFragment: DocumentFragment,
      viewFragment: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default
    ): Unit = js.native
    
    def bindElements(domElement: HTMLElement, viewElement: typings.ckeditorCkeditor5Engine.viewElementMod.default): Unit = js.native
    
    def bindFakeSelection(
      domElement: HTMLElement,
      viewDocumentSelection: typings.ckeditorCkeditor5Engine.viewDocumentselectionMod.default
    ): Unit = js.native
    
    val blockElements: js.Array[Any] = js.native
    
    var blockFillerMode: BlockFillerMode = js.native
    
    val document: typings.ckeditorCkeditor5Engine.viewDocumentMod.default = js.native
    
    def domChildrenToView(domElement: HTMLElement): Generator[Node, Any, Any] = js.native
    def domChildrenToView(domElement: HTMLElement, options: Bind): Generator[Node, Any, Any] = js.native
    
    def domPositionToView(domParent: Node): typings.ckeditorCkeditor5Engine.viewPositionMod.default = js.native
    def domPositionToView(domParent: Node, domOffset: Double): typings.ckeditorCkeditor5Engine.viewPositionMod.default = js.native
    
    def domRangeToView(domRange: Range): typings.ckeditorCkeditor5Engine.viewRangeMod.default | Null = js.native
    
    def domSelectionToView(domSelection: Selection): typings.ckeditorCkeditor5Engine.viewSelectionMod.default = js.native
    
    def domToView(domNode: DocumentFragment): typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default = js.native
    def domToView(domNode: DocumentFragment, options: KeepOriginalCase): typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default = js.native
    def domToView(domNode: Node): typings.ckeditorCkeditor5Engine.viewNodeMod.default | Null = js.native
    def domToView(domNode: Node, options: KeepOriginalCase): typings.ckeditorCkeditor5Engine.viewNodeMod.default | Null = js.native
    
    def fakeSelectionToView(domElement: HTMLElement): js.UndefOr[typings.ckeditorCkeditor5Engine.viewSelectionMod.default] = js.native
    
    def findCorrespondingDomText(viewText: typings.ckeditorCkeditor5Engine.viewTextMod.default): Text | Null = js.native
    
    def findCorrespondingViewText(domText: Text): typings.ckeditorCkeditor5Engine.viewTextMod.default | Null = js.native
    
    def focus(viewEditable: typings.ckeditorCkeditor5Engine.editableelementMod.default): Unit = js.native
    
    def getHostViewElement(domNode: Node): typings.ckeditorCkeditor5Engine.uielementMod.default | typings.ckeditorCkeditor5Engine.rawelementMod.default | Null = js.native
    
    val inlineObjectElements: js.Tuple12[`object`, iframe, input, button, textarea, select, option, video, embed, audio, img, canvas] = js.native
    
    def isBlockFiller(domNode: Node): Boolean = js.native
    
    def isDocumentFragment(node: Node): Boolean = js.native
    
    def isDomSelectionBackward(DOM: Selection): Boolean = js.native
    
    def isDomSelectionCorrect(domSelection: Selection): Boolean = js.native
    
    def isElement(node: Node): Boolean = js.native
    
    def mapDomToView(domElementOrDocumentFragment: typings.ckeditorCkeditor5Engine.elementMod.default): js.UndefOr[
        typings.ckeditorCkeditor5Engine.viewElementMod.default | typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default
      ] = js.native
    def mapDomToView(domElementOrDocumentFragment: DocumentFragment): js.UndefOr[
        typings.ckeditorCkeditor5Engine.viewElementMod.default | typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default
      ] = js.native
    
    def mapViewToDom(viewNode: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default): js.UndefOr[Node | DocumentFragment] = js.native
    def mapViewToDom(viewNode: typings.ckeditorCkeditor5Engine.viewElementMod.default): js.UndefOr[Node | DocumentFragment] = js.native
    
    val preElements: js.Array[pre] = js.native
    
    def registerRawContentMatcher(pattern: MatcherPattern): Unit = js.native
    
    /**
      * Removes an attribute from a DOM element.
      *
      * **Note**: To set the attribute, use {@link #setDomElementAttribute}.
      */
    def removeDomElementAttribute(domElement: HTMLElement, key: String): Unit = js.native
    
    val renderingMode: data | editing = js.native
    
    /**
      * Set `domElement`'s content using provided `html` argument. Apply necessary filtering for the editing pipeline.
      */
    def setContentOf(domElement: HTMLElement, html: String): Unit = js.native
    
    /**
      * Sets the attribute on a DOM element.
      *
      * **Note**: To remove the attribute, use {@link #removeDomElementAttribute}.
      */
    def setDomElementAttribute(domElement: HTMLElement, key: String, value: String): Unit = js.native
    def setDomElementAttribute(
      domElement: HTMLElement,
      key: String,
      value: String,
      relatedViewElement: typings.ckeditorCkeditor5Engine.viewElementMod.default
    ): Unit = js.native
    
    /**
      * Decides whether given pair of attribute key and value should be passed further down the pipeline.
      */
    def shouldRenderAttribute(attributeKey: String, attributeValue: String, elementName: String): Boolean = js.native
    
    def unbindDomElement(domElement: HTMLElement): Unit = js.native
    
    def viewChildrenToDom(
      viewElement: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default,
      domDocument: Document
    ): Generator[Node, Any, Any] = js.native
    def viewChildrenToDom(
      viewElement: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default,
      domDocument: Document,
      options: WithChildren
    ): Generator[Node, Any, Any] = js.native
    def viewChildrenToDom(viewElement: typings.ckeditorCkeditor5Engine.viewElementMod.default, domDocument: Document): Generator[Node, Any, Any] = js.native
    def viewChildrenToDom(
      viewElement: typings.ckeditorCkeditor5Engine.viewElementMod.default,
      domDocument: Document,
      options: WithChildren
    ): Generator[Node, Any, Any] = js.native
    
    def viewPositionToDom(viewPosition: typings.ckeditorCkeditor5Engine.viewPositionMod.default): Offset | Null = js.native
    
    def viewRangeToDom(viewRange: typings.ckeditorCkeditor5Engine.viewRangeMod.default): Range = js.native
    
    /**
      * Converts the view to the DOM. For all text nodes, not bound elements and document fragments new items will
      * be created. For bound elements and document fragments the method will return corresponding items.
      */
    def viewToDom(viewNode: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default, domDocument: Document): DocumentFragment = js.native
    def viewToDom(
      viewNode: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default,
      domDocument: Document,
      options: WithChildren
    ): DocumentFragment = js.native
    /**
      * Converts the view to the DOM. For all text nodes, not bound elements and document fragments new items will
      * be created. For bound elements and document fragments the method will return corresponding items.
      */
    def viewToDom(viewNode: typings.ckeditorCkeditor5Engine.viewNodeMod.default, domDocument: Document): Node = js.native
    def viewToDom(
      viewNode: typings.ckeditorCkeditor5Engine.viewNodeMod.default,
      domDocument: Document,
      options: WithChildren
    ): Node = js.native
  }
}
