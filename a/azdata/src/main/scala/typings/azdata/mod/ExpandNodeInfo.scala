package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandNodeInfo extends StObject {
  
  var nodePath: String
  
  var sessionId: String
}
object ExpandNodeInfo {
  
  @scala.inline
  def apply(nodePath: String, sessionId: String): ExpandNodeInfo = {
    val __obj = js.Dynamic.literal(nodePath = nodePath.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandNodeInfo]
  }
  
  @scala.inline
  implicit class ExpandNodeInfoMutableBuilder[Self <: ExpandNodeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
