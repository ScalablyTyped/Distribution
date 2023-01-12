package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.PickDocumentFragmentchild
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentSelection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.livePosition
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.liveRange
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marker
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColon$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColon$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColondocumentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColondocumentSelection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonelement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonlivePosition
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonliveRange
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonmarker
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonnode
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonposition
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonrange
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonrootElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonselection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColontext
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColontextProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.node
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.position
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.range
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rootElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typings.ckeditorCkeditor5Engine.srcModelNodeMod._NodeSet
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelDocumentfragmentMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/documentfragment", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DocumentFragment
       with _NodeSet
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/documentfragment", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: js.Array[FromJSONArg]): DocumentFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[DocumentFragment]
  }
  
  @js.native
  trait DocumentFragment
    extends StObject
       with Iterable[
          typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelTextMod.default
        ] {
    
    val childCount: Double = js.native
    
    def getChild(index: Double): typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = js.native
    
    def getChildIndex(node: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default): Double | Null = js.native
    
    def getChildStartOffset(node: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default): Double | Null = js.native
    
    def getChildren(): IterableIterator[
        typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelTextMod.default
      ] = js.native
    
    def getNodeByPath(relativePath: js.Array[Double]): typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | DocumentFragment = js.native
    
    def getPath(): js.Array[Any] = js.native
    
    def is(
      `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
    
    val isEmpty: Boolean = js.native
    
    val markers: Map[String, typings.ckeditorCkeditor5Engine.srcModelRangeMod.default] = js.native
    
    val maxOffset: Double = js.native
    
    def offsetToIndex(offset: Double): Double = js.native
    
    val parent: Null = js.native
    
    val root: DocumentFragment = js.native
    
    def toJSON(): PickDocumentFragmentchild = js.native
  }
  
  trait FromJSONArg extends StObject {
    
    var attributes: js.UndefOr[(Record[String, String]) | (js.Array[js.Tuple2[String, String]])] = js.undefined
    
    var children: js.UndefOr[js.Array[FromJSONArg]] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object FromJSONArg {
    
    inline def apply(): FromJSONArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromJSONArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromJSONArg] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: (Record[String, String]) | (js.Array[js.Tuple2[String, String]])): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setChildren(value: js.Array[FromJSONArg]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: FromJSONArg*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
