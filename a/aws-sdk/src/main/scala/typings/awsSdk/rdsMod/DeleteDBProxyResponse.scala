package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBProxyResponse extends StObject {
  
  /**
    * The data structure representing the details of the DB proxy that you delete.
    */
  var DBProxy: js.UndefOr[typings.awsSdk.rdsMod.DBProxy] = js.undefined
}
object DeleteDBProxyResponse {
  
  inline def apply(): DeleteDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBProxyResponse]
  }
  
  extension [Self <: DeleteDBProxyResponse](x: Self) {
    
    inline def setDBProxy(value: DBProxy): Self = StObject.set(x, "DBProxy", value.asInstanceOf[js.Any])
    
    inline def setDBProxyUndefined: Self = StObject.set(x, "DBProxy", js.undefined)
  }
}
