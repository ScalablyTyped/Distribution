package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.ClassesName
import typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.ViewItem
import typings.std.Generator
import typings.std.IterableIterator
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewElementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.srcViewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/element", JSImport.Default)
  @js.native
  open class default protected ()
    extends Element
       with ViewItem {
    def this(document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default, name: String) = this()
    def this(
      document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      name: String,
      attrs: js.Tuple2[String, String]
    ) = this()
    def this(
      document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      name: String,
      attrs: Record[String, String]
    ) = this()
    def this(
      document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      name: String,
      attrs: js.Tuple2[String, String],
      children: js.Iterable[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    ) = this()
    def this(
      document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      name: String,
      attrs: js.Tuple2[String, String],
      children: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default
    ) = this()
    def this(
      document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      name: String,
      attrs: Unit,
      children: js.Iterable[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    ) = this()
    def this(
      document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      name: String,
      attrs: Unit,
      children: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default
    ) = this()
    def this(
      document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      name: String,
      attrs: Record[String, String],
      children: js.Iterable[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    ) = this()
    def this(
      document: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      name: String,
      attrs: Record[String, String],
      children: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default
    ) = this()
  }
  
  @js.native
  trait Element
    extends typings.ckeditorCkeditor5Engine.srcViewNodeMod.default {
    
    val childCount: Double = js.native
    
    def findAncestor(patterns: String): Element | Null = js.native
    def findAncestor(patterns: js.Function1[/* element */ this.type, Boolean]): Element | Null = js.native
    def findAncestor(patterns: js.RegExp): Element | Null = js.native
    def findAncestor(patterns: ClassesName): Element | Null = js.native
    
    def getAttribute(key: String): js.UndefOr[String] = js.native
    
    def getAttributeKeys(): Generator[String, Any, Any] = js.native
    
    def getAttributes(): Generator[js.Tuple2[String, Any], Any, Any] = js.native
    
    def getChild(index: Double): typings.ckeditorCkeditor5Engine.srcViewNodeMod.default = js.native
    
    def getChildIndex(node: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default): Double = js.native
    
    def getChildren(): IterableIterator[typings.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    def getClassNames(): IterableIterator[String] = js.native
    
    def getCustomProperties(): Generator[js.Tuple2[String, Any], Any, Any] = js.native
    
    def getCustomProperty(key: String): Any = js.native
    def getCustomProperty(key: js.Symbol): Any = js.native
    
    def getFillerOffset(): Double | Null = js.native
    
    def getIdentity(): String = js.native
    
    def getNormalizedStyle(property: String): js.UndefOr[(Record[String, String]) | String] = js.native
    
    def getStyle(property: String): js.UndefOr[String] = js.native
    
    def getStyleNames(): ReturnType[js.Function1[/* expand */ js.UndefOr[Boolean], js.Array[String]]] = js.native
    def getStyleNames(expand: Boolean): ReturnType[js.Function1[/* expand */ js.UndefOr[Boolean], js.Array[String]]] = js.native
    
    def hasAttribute(key: String): Boolean = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def hasStyle(property: String): Boolean = js.native
    
    val isAllowedInsideAttributeElement: Boolean = js.native
    
    val isEmpty: Boolean = js.native
    
    def isSimilar(otherElement: Element): Boolean = js.native
    
    val name: String = js.native
    
    /**
      * Decides whether an unsafe attribute is whitelisted and should be rendered in the editing pipeline even though filtering mechanisms
      * like {@link module:engine/view/domconverter~DomConverter#shouldRenderAttribute} say it should not.
      *
      * Unsafe attribute names can be specified when creating an element via {@link module:engine/view/downcastwriter~DowncastWriter}.
      */
    def shouldRenderUnsafeAttribute(attributeName: String): Boolean = js.native
  }
}
