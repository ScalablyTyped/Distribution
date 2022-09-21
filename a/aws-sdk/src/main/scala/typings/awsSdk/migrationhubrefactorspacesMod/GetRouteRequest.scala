package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRouteRequest extends StObject {
  
  /**
    * The ID of the application. 
    */
  var ApplicationIdentifier: ApplicationId
  
  /**
    * The ID of the environment.
    */
  var EnvironmentIdentifier: EnvironmentId
  
  /**
    * The ID of the route.
    */
  var RouteIdentifier: RouteId
}
object GetRouteRequest {
  
  inline def apply(
    ApplicationIdentifier: ApplicationId,
    EnvironmentIdentifier: EnvironmentId,
    RouteIdentifier: RouteId
  ): GetRouteRequest = {
    val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any], RouteIdentifier = RouteIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteRequest]
  }
  
  extension [Self <: GetRouteRequest](x: Self) {
    
    inline def setApplicationIdentifier(value: ApplicationId): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRouteIdentifier(value: RouteId): Self = StObject.set(x, "RouteIdentifier", value.asInstanceOf[js.Any])
  }
}
