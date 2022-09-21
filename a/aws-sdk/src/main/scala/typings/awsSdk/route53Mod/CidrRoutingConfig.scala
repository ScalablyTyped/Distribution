package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidrRoutingConfig extends StObject {
  
  /**
    * The CIDR collection ID.
    */
  var CollectionId: UUID
  
  /**
    * The CIDR collection location name.
    */
  var LocationName: CidrLocationNameDefaultAllowed
}
object CidrRoutingConfig {
  
  inline def apply(CollectionId: UUID, LocationName: CidrLocationNameDefaultAllowed): CidrRoutingConfig = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], LocationName = LocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidrRoutingConfig]
  }
  
  extension [Self <: CidrRoutingConfig](x: Self) {
    
    inline def setCollectionId(value: UUID): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    inline def setLocationName(value: CidrLocationNameDefaultAllowed): Self = StObject.set(x, "LocationName", value.asInstanceOf[js.Any])
  }
}
