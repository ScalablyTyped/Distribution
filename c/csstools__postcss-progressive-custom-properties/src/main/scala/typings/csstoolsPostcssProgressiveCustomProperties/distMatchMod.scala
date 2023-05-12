package typings.csstoolsPostcssProgressiveCustomProperties

import typings.csstoolsPostcssProgressiveCustomProperties.anon.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatchMod {
  
  @JSImport("@csstools/postcss-progressive-custom-properties/dist/match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matches(a: MatcherNode, b: MatcherNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait MatcherNode extends StObject {
    
    var dimension: js.UndefOr[Unit] = js.undefined
    
    var isVariable: js.UndefOr[Boolean] = js.undefined
    
    var nodes: js.UndefOr[js.Array[MatcherNode]] = js.undefined
    
    var `type`: String
    
    var value: js.UndefOr[String] = js.undefined
  }
  object MatcherNode {
    
    inline def apply(`type`: String): MatcherNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatcherNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatcherNode] (val x: Self) extends AnyVal {
      
      inline def setDimension(value: Unit): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      inline def setIsVariable(value: Boolean): Self = StObject.set(x, "isVariable", value.asInstanceOf[js.Any])
      
      inline def setIsVariableUndefined: Self = StObject.set(x, "isVariable", js.undefined)
      
      inline def setNodes(value: js.Array[MatcherNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: MatcherNode*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
