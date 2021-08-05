package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddLayerVersionPermissionResponse extends StObject {
  
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The permission statement.
    */
  var Statement: js.UndefOr[String] = js.undefined
}
object AddLayerVersionPermissionResponse {
  
  inline def apply(): AddLayerVersionPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddLayerVersionPermissionResponse]
  }
  
  extension [Self <: AddLayerVersionPermissionResponse](x: Self) {
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
  }
}
