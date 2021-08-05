package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReusableDelegationSetRequest extends StObject {
  
  /**
    * The ID of the reusable delegation set that you want to get a list of name servers for.
    */
  var Id: ResourceId
}
object GetReusableDelegationSetRequest {
  
  inline def apply(Id: ResourceId): GetReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReusableDelegationSetRequest]
  }
  
  extension [Self <: GetReusableDelegationSetRequest](x: Self) {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
