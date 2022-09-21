package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imdsbadresponseMod {
  
  trait IMDSBadResponse extends StObject {
    
    var error: String
    
    var `newest-versions`: js.Array[String]
  }
  object IMDSBadResponse {
    
    inline def apply(error: String, `newest-versions`: js.Array[String]): IMDSBadResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("newest-versions")(`newest-versions`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMDSBadResponse]
    }
    
    extension [Self <: IMDSBadResponse](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def `setNewest-versions`(value: js.Array[String]): Self = StObject.set(x, "newest-versions", value.asInstanceOf[js.Any])
      
      inline def `setNewest-versionsVarargs`(value: String*): Self = StObject.set(x, "newest-versions", js.Array(value*))
    }
  }
}
