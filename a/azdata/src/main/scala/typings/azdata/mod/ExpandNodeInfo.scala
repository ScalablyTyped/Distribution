package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandNodeInfo extends StObject {
  
  var nodePath: js.UndefOr[String] = js.undefined
  
  var sessionId: String
}
object ExpandNodeInfo {
  
  inline def apply(sessionId: String): ExpandNodeInfo = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandNodeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandNodeInfo] (val x: Self) extends AnyVal {
    
    inline def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
    
    inline def setNodePathUndefined: Self = StObject.set(x, "nodePath", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
