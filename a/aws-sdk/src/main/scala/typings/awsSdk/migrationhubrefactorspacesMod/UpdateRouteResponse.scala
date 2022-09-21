package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRouteResponse extends StObject {
  
  /**
    *  The ID of the application in which the route is being updated. 
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.migrationhubrefactorspacesMod.ApplicationId] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the route. The format for this ARN is arn:aws:refactor-spaces:region:account-id:resource-type/resource-id . For more information about ARNs, see  Amazon Resource Names (ARNs) in the Amazon Web Services General Reference. 
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    *  A timestamp that indicates when the route was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The unique identifier of the route. 
    */
  var RouteId: js.UndefOr[typings.awsSdk.migrationhubrefactorspacesMod.RouteId] = js.undefined
  
  /**
    *  The ID of service in which the route was created. Traffic that matches this route is forwarded to this service. 
    */
  var ServiceId: js.UndefOr[typings.awsSdk.migrationhubrefactorspacesMod.ServiceId] = js.undefined
  
  /**
    *  The current state of the route. 
    */
  var State: js.UndefOr[RouteState] = js.undefined
}
object UpdateRouteResponse {
  
  inline def apply(): UpdateRouteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRouteResponse]
  }
  
  extension [Self <: UpdateRouteResponse](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setRouteId(value: RouteId): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
    
    inline def setRouteIdUndefined: Self = StObject.set(x, "RouteId", js.undefined)
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setState(value: RouteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
