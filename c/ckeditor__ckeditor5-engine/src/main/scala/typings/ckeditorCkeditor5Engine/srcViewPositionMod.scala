package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.BoundariesIgnoreElementEnd
import typings.ckeditorCkeditor5Engine.anon.SingleCharacters
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
import typings.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable
import typings.ckeditorCkeditor5Engine.srcViewTreewalkerMod.TreeWalkerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewPositionMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/position", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Position
       with _Selectable {
    def this(
      parent: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default,
      offset: js.Array[Double]
    ) = this()
    def this(parent: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default, offset: Double) = this()
    def this(parent: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default, offset: js.Array[Double]) = this()
    def this(parent: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default, offset: Double) = this()
  }
  
  @js.native
  trait Position extends StObject {
    
    def compareWith(otherPosition: Position): PositionRelation = js.native
    
    var editableElement: typings.ckeditorCkeditor5Engine.srcViewEditableelementMod.default | Null = js.native
    
    def getAncestors(): js.Array[
        typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
      ] = js.native
    
    def getCommonAncestor(position: Position): typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default | Null = js.native
    
    def getLastMatchingPosition(skip: js.Function1[/* value */ TreeWalkerValue, Boolean]): Position = js.native
    def getLastMatchingPosition(skip: js.Function1[/* value */ TreeWalkerValue, Boolean], options: SingleCharacters): Position = js.native
    
    def getShiftedBy(shift: Double): Position = js.native
    
    def getWalker(): typings.ckeditorCkeditor5Engine.srcViewTreewalkerMod.default = js.native
    def getWalker(options: BoundariesIgnoreElementEnd): typings.ckeditorCkeditor5Engine.srcViewTreewalkerMod.default = js.native
    
    def is(
      `type`: $text | $textProxy | attributeElement | containerElement | documentFragment | documentSelection | editableElement | element | emptyElement | node | position | range | rawElement | rootEditableElement | selection | text | textProxy | uiElement | viewColon$text | viewColon$textProxy | viewColonattributeElement | viewColoncontainerElement | viewColondocumentFragment | viewColondocumentSelection | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonnode | viewColonposition | viewColonrange | viewColonrawElement | viewColonrootEditableElement | viewColonselection | viewColontext | viewColontextProxy | viewColonuiElement
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](
      `type`: attributeElement | containerElement | editableElement | element | emptyElement | rawElement | rootEditableElement | uiElement | viewColonattributeElement | viewColoncontainerElement | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonrawElement | viewColonrootEditableElement | viewColonuiElement,
      name: K
    ): Boolean = js.native
    
    def isAfter(otherPosition: Position): Boolean = js.native
    
    val isAtEnd: Boolean = js.native
    
    val isAtStart: Boolean = js.native
    
    def isBefore(otherPosition: Position): Boolean = js.native
    
    def isEqual(otherPosition: Position): Boolean = js.native
    
    val nodeAfter: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null = js.native
    
    val nodeBefore: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null = js.native
    
    val offset: Double = js.native
    
    val parent: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    val root: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.same
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.different
  */
  trait PositionRelation extends StObject
  object PositionRelation {
    
    inline def after: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after = "after".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after]
    
    inline def before: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before = "before".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before]
    
    inline def different: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.different = "different".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.different]
    
    inline def same: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.same = "same".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.same]
  }
}
