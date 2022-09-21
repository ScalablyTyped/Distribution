package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallHierarchyOutgoingCall extends StObject {
  
  var fromSpans: Array[TextSpan]
  
  var to: CallHierarchyItem
}
object CallHierarchyOutgoingCall {
  
  inline def apply(fromSpans: Array[TextSpan], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
    val __obj = js.Dynamic.literal(fromSpans = fromSpans.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCall]
  }
  
  extension [Self <: CallHierarchyOutgoingCall](x: Self) {
    
    inline def setFromSpans(value: Array[TextSpan]): Self = StObject.set(x, "fromSpans", value.asInstanceOf[js.Any])
    
    inline def setTo(value: CallHierarchyItem): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
