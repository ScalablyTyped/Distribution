package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingProfileSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the routing profile.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the routing profile.
    */
  var Id: js.UndefOr[RoutingProfileId] = js.undefined
  
  /**
    * The name of the routing profile.
    */
  var Name: js.UndefOr[RoutingProfileName] = js.undefined
}
object RoutingProfileSummary {
  
  inline def apply(): RoutingProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingProfileSummary]
  }
  
  extension [Self <: RoutingProfileSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: RoutingProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: RoutingProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
