package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.FnCall
import typings.ckeditorCkeditor5Engine.anon.IncludeSelf
import typings.std.IterableIterator
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelElementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.srcModelSchemaMod._SchemaContextDefinition because Already inherited
  - typings.ckeditorCkeditor5Engine.srcModelSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.srcModelItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/model/element", JSImport.Default)
  @js.native
  open class default protected () extends Element {
    def this(name: String) = this()
    def this(name: String, attrs: js.Tuple2[String, String]) = this()
    def this(name: String, attrs: Record[String, String]) = this()
    def this(
      name: String,
      attrs: js.Tuple2[String, String],
      children: js.Iterable[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default]
    ) = this()
    def this(
      name: String,
      attrs: js.Tuple2[String, String],
      children: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default
    ) = this()
    def this(
      name: String,
      attrs: Unit,
      children: js.Iterable[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default]
    ) = this()
    def this(name: String, attrs: Unit, children: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default) = this()
    def this(
      name: String,
      attrs: Record[String, String],
      children: js.Iterable[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default]
    ) = this()
    def this(
      name: String,
      attrs: Record[String, String],
      children: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/element", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ReturnType[FnCall]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  @js.native
  trait Element
    extends typings.ckeditorCkeditor5Engine.srcModelNodeMod.default {
    
    val childCount: Double = js.native
    
    def findAncestor(parentName: String): Element | Null = js.native
    def findAncestor(parentName: String, options: IncludeSelf): Element | Null = js.native
    
    def getChild(index: Double): Element | typings.ckeditorCkeditor5Engine.srcModelTextMod.default = js.native
    
    def getChildIndex(node: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default): Double = js.native
    
    def getChildStartOffset(node: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default): Double = js.native
    
    def getChildren(): IterableIterator[Element | typings.ckeditorCkeditor5Engine.srcModelTextMod.default] = js.native
    
    def getNodeByPath(relativePath: js.Array[Double]): Element | typings.ckeditorCkeditor5Engine.srcModelTextMod.default = js.native
    
    val isEmpty: Boolean = js.native
    
    val maxOffset: Double = js.native
    
    val name: String = js.native
    
    def offsetToIndex(offset: Double): Double = js.native
  }
}
