package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.ParentFirst
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewTextproxyMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/textproxy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TextProxy
       with Item {
    def this(
      textNode: typings.ckeditorCkeditor5Engine.viewTextMod.default,
      offsetInText: Double,
      length: Double
    ) = this()
  }
  
  @js.native
  trait TextProxy extends StObject {
    
    val data: String = js.native
    
    val document: typings.ckeditorCkeditor5Engine.viewDocumentMod.default | Null = js.native
    
    def getAncestors(): js.Array[
        typings.ckeditorCkeditor5Engine.viewElementMod.default | typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default
      ] = js.native
    def getAncestors(options: ParentFirst): js.Array[
        typings.ckeditorCkeditor5Engine.viewElementMod.default | typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default
      ] = js.native
    
    def is(
      `type`: $text | $textProxy | attributeElement | containerElement | documentFragment | documentSelection | editableElement | element | emptyElement | node | position | range | rawElement | rootEditableElement | selection | text | textProxy | uiElement | viewColon$text | viewColon$textProxy | viewColonattributeElement | viewColoncontainerElement | viewColondocumentFragment | viewColondocumentSelection | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonnode | viewColonposition | viewColonrange | viewColonrawElement | viewColonrootEditableElement | viewColonselection | viewColontext | viewColontextProxy | viewColonuiElement
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](
      `type`: attributeElement | containerElement | editableElement | element | emptyElement | rawElement | rootEditableElement | uiElement | viewColonattributeElement | viewColoncontainerElement | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonrawElement | viewColonrootEditableElement | viewColonuiElement,
      name: K
    ): Boolean = js.native
    
    val isPartial: Boolean = js.native
    
    val offsetInText: Double = js.native
    
    val offsetSize: Double = js.native
    
    val parent: typings.ckeditorCkeditor5Engine.viewElementMod.default | typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default | Null = js.native
    
    val root: typings.ckeditorCkeditor5Engine.viewNodeMod.default | typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default = js.native
    
    val textNode: typings.ckeditorCkeditor5Engine.viewTextMod.default = js.native
  }
}
