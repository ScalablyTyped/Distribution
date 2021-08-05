package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity extends StObject {
  
  /**
    * A unique identifier for the entity that made the call. For Time To Live, the principalId is "dynamodb.amazonaws.com".
    */
  var PrincipalId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the identity. For Time To Live, the type is "Service".
    */
  var Type: js.UndefOr[String] = js.undefined
}
object Identity {
  
  inline def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  extension [Self <: Identity](x: Self) {
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
