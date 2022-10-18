package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.srcModelNodeMod._NodeSet
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelNodelistMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/nodelist", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NodeList
       with _NodeSet {
    def this(nodes: js.Iterable[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default]) = this()
  }
  
  @js.native
  trait NodeList
    extends StObject
       with Iterable[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default] {
    
    def getNode(index: Double): typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = js.native
    
    def getNodeIndex(node: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default): Double | Null = js.native
    
    def getNodeStartOffset(node: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default): Double | Null = js.native
    
    def indexToOffset(index: Double): Double = js.native
    
    val length: Double = js.native
    
    val maxOffset: Double = js.native
    
    def offsetToIndex(offset: Double): Double = js.native
    
    def toJSON(): js.Array[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default] = js.native
  }
}
