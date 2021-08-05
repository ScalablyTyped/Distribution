package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedNode extends StObject {
  
  var html: String
  
  var target: js.Array[String]
}
object RelatedNode {
  
  inline def apply(html: String, target: js.Array[String]): RelatedNode = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedNode]
  }
  
  extension [Self <: RelatedNode](x: Self) {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
