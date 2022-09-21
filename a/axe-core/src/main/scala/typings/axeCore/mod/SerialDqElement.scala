package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialDqElement extends StObject {
  
  var ancestry: CrossFrameSelector
  
  var nodeIndexes: js.Array[Double]
  
  var selector: CrossFrameSelector
  
  var source: String
  
  var xpath: js.Array[String]
}
object SerialDqElement {
  
  inline def apply(
    ancestry: CrossFrameSelector,
    nodeIndexes: js.Array[Double],
    selector: CrossFrameSelector,
    source: String,
    xpath: js.Array[String]
  ): SerialDqElement = {
    val __obj = js.Dynamic.literal(ancestry = ancestry.asInstanceOf[js.Any], nodeIndexes = nodeIndexes.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], xpath = xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialDqElement]
  }
  
  extension [Self <: SerialDqElement](x: Self) {
    
    inline def setAncestry(value: CrossFrameSelector): Self = StObject.set(x, "ancestry", value.asInstanceOf[js.Any])
    
    inline def setAncestryVarargs(value: CrossTreeSelector*): Self = StObject.set(x, "ancestry", js.Array(value*))
    
    inline def setNodeIndexes(value: js.Array[Double]): Self = StObject.set(x, "nodeIndexes", value.asInstanceOf[js.Any])
    
    inline def setNodeIndexesVarargs(value: Double*): Self = StObject.set(x, "nodeIndexes", js.Array(value*))
    
    inline def setSelector(value: CrossFrameSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorVarargs(value: CrossTreeSelector*): Self = StObject.set(x, "selector", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setXpath(value: js.Array[String]): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    inline def setXpathVarargs(value: String*): Self = StObject.set(x, "xpath", js.Array(value*))
  }
}
