package typings.azureKustoData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mgmt extends StObject {
    
    var mgmt: String
    
    var query: String
  }
  object Mgmt {
    
    inline def apply(mgmt: String, query: String): Mgmt = {
      val __obj = js.Dynamic.literal(mgmt = mgmt.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mgmt]
    }
    
    extension [Self <: Mgmt](x: Self) {
      
      inline def setMgmt(value: String): Self = StObject.set(x, "mgmt", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
