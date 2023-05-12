package typings.csstoolsCascadeLayerNameParser

import typings.csstoolsCascadeLayerNameParser.anon.Name
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesLayerNameMod {
  
  @JSImport("@csstools/cascade-layer-name-parser/dist/nodes/layer-name", "LayerName")
  @js.native
  open class LayerName protected () extends StObject {
    def this(parts: js.Array[CSSToken]) = this()
    
    def concat(other: LayerName): LayerName = js.native
    
    def equal(other: LayerName): Boolean = js.native
    
    def name(): String = js.native
    
    var parts: js.Array[CSSToken] = js.native
    
    def segments(): js.Array[String] = js.native
    
    def slice(start: Double, end: Double): LayerName = js.native
    
    def toJSON(): Name = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
  }
}
