package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBProxyRequest extends StObject {
  
  /**
    * The name of the DB proxy to delete.
    */
  var DBProxyName: String
}
object DeleteDBProxyRequest {
  
  inline def apply(DBProxyName: String): DeleteDBProxyRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBProxyRequest]
  }
  
  extension [Self <: DeleteDBProxyRequest](x: Self) {
    
    inline def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
  }
}
