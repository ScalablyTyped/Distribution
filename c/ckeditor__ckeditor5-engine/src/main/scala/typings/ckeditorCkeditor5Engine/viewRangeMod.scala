package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.IgnoreElementEndShallow
import typings.ckeditorCkeditor5Engine.anon.StartPosition
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.attributeElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.containerElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentSelection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.editableElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.emptyElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.node
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.position
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.range
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rawElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rootEditableElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.uiElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColon$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColon$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonattributeElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColoncontainerElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColondocumentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColondocumentSelection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColoneditableElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonelement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonemptyElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonnode
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonposition
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonrange
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonrawElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonrootEditableElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonselection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColontext
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColontextProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonuiElement
import typings.ckeditorCkeditor5Engine.viewItemMod.Item
import typings.ckeditorCkeditor5Engine.viewSelectionMod._Selectable
import typings.ckeditorCkeditor5Engine.viewTreewalkerMod.TreeWalkerValue
import typings.std.Iterable
import typings.std.TreeWalker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewRangeMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/range", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Range
       with _Selectable {
    def this(start: typings.ckeditorCkeditor5Engine.viewPositionMod.default) = this()
    def this(
      start: typings.ckeditorCkeditor5Engine.viewPositionMod.default,
      end: typings.ckeditorCkeditor5Engine.viewPositionMod.default
    ) = this()
  }
  
  @js.native
  trait Range
    extends StObject
       with Iterable[TreeWalkerValue] {
    
    def containsPosition(position: typings.ckeditorCkeditor5Engine.viewPositionMod.default): Boolean = js.native
    
    def containsRange(otherRange: Range): Boolean = js.native
    def containsRange(otherRange: Range, loose: Boolean): Boolean = js.native
    
    val end: typings.ckeditorCkeditor5Engine.viewPositionMod.default = js.native
    
    def getCommonAncestor(): typings.ckeditorCkeditor5Engine.viewNodeMod.default | typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default | Null = js.native
    
    def getContainedElement(): typings.ckeditorCkeditor5Engine.viewElementMod.default | Null = js.native
    
    def getDifference(otherRange: Range): (js.Array[Any | Range]) | (js.Tuple2[Range, Range]) = js.native
    
    def getEnlarged(): Range = js.native
    
    def getIntersection(otherRange: Range): Range | Null = js.native
    
    def getItems(): js.Iterable[Item] = js.native
    def getItems(options: StartPosition): js.Iterable[Item] = js.native
    
    def getPositions(): js.Iterable[typings.ckeditorCkeditor5Engine.viewPositionMod.default] = js.native
    def getPositions(options: StartPosition): js.Iterable[typings.ckeditorCkeditor5Engine.viewPositionMod.default] = js.native
    
    def getTrimmed(): Range = js.native
    
    def getWalker(): TreeWalker = js.native
    def getWalker(options: IgnoreElementEndShallow): TreeWalker = js.native
    
    def is(
      `type`: $text | $textProxy | attributeElement | containerElement | documentFragment | documentSelection | editableElement | element | emptyElement | node | position | range | rawElement | rootEditableElement | selection | text | textProxy | uiElement | viewColon$text | viewColon$textProxy | viewColonattributeElement | viewColoncontainerElement | viewColondocumentFragment | viewColondocumentSelection | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonnode | viewColonposition | viewColonrange | viewColonrawElement | viewColonrootEditableElement | viewColonselection | viewColontext | viewColontextProxy | viewColonuiElement
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](
      `type`: attributeElement | containerElement | editableElement | element | emptyElement | rawElement | rootEditableElement | uiElement | viewColonattributeElement | viewColoncontainerElement | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonrawElement | viewColonrootEditableElement | viewColonuiElement,
      name: K
    ): Boolean = js.native
    
    var isCollapsed: Boolean = js.native
    
    def isEqual(otherRange: Range): Boolean = js.native
    
    var isFlat: Boolean = js.native
    
    def isIntersecting(otherRange: Range): Boolean = js.native
    
    var root: typings.ckeditorCkeditor5Engine.viewElementMod.default | typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default = js.native
    
    val start: typings.ckeditorCkeditor5Engine.viewPositionMod.default = js.native
  }
}
