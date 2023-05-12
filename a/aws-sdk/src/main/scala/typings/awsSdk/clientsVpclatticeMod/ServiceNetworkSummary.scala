package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNetworkSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service network.
    */
  var arn: js.UndefOr[ServiceNetworkArn] = js.undefined
  
  /**
    * The date and time that the service network was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the service network.
    */
  var id: js.UndefOr[ServiceNetworkId] = js.undefined
  
  /**
    * The date and time that the service network was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the service network.
    */
  var name: js.UndefOr[ServiceNetworkName] = js.undefined
  
  /**
    * The number of services associated with the service network.
    */
  var numberOfAssociatedServices: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of VPCs associated with the service network.
    */
  var numberOfAssociatedVPCs: js.UndefOr[Long] = js.undefined
}
object ServiceNetworkSummary {
  
  inline def apply(): ServiceNetworkSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceNetworkSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceNetworkSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceNetworkArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: ServiceNetworkId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: ServiceNetworkName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumberOfAssociatedServices(value: Long): Self = StObject.set(x, "numberOfAssociatedServices", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAssociatedServicesUndefined: Self = StObject.set(x, "numberOfAssociatedServices", js.undefined)
    
    inline def setNumberOfAssociatedVPCs(value: Long): Self = StObject.set(x, "numberOfAssociatedVPCs", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAssociatedVPCsUndefined: Self = StObject.set(x, "numberOfAssociatedVPCs", js.undefined)
  }
}
