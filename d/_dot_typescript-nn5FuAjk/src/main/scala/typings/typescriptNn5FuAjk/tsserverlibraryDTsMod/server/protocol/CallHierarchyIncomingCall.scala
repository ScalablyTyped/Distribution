package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallHierarchyIncomingCall extends StObject {
  
  var from: CallHierarchyItem
  
  var fromSpans: Array[TextSpan]
}
object CallHierarchyIncomingCall {
  
  inline def apply(from: CallHierarchyItem, fromSpans: Array[TextSpan]): CallHierarchyIncomingCall = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromSpans = fromSpans.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyIncomingCall]
  }
  
  extension [Self <: CallHierarchyIncomingCall](x: Self) {
    
    inline def setFrom(value: CallHierarchyItem): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromSpans(value: Array[TextSpan]): Self = StObject.set(x, "fromSpans", value.asInstanceOf[js.Any])
  }
}
