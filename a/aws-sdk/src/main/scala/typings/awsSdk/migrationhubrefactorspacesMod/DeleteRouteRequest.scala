package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRouteRequest extends StObject {
  
  /**
    * The ID of the application to delete the route from.
    */
  var ApplicationIdentifier: ApplicationId
  
  /**
    * The ID of the environment to delete the route from.
    */
  var EnvironmentIdentifier: EnvironmentId
  
  /**
    * The ID of the route to delete.
    */
  var RouteIdentifier: RouteId
}
object DeleteRouteRequest {
  
  inline def apply(
    ApplicationIdentifier: ApplicationId,
    EnvironmentIdentifier: EnvironmentId,
    RouteIdentifier: RouteId
  ): DeleteRouteRequest = {
    val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any], RouteIdentifier = RouteIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteRequest]
  }
  
  extension [Self <: DeleteRouteRequest](x: Self) {
    
    inline def setApplicationIdentifier(value: ApplicationId): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRouteIdentifier(value: RouteId): Self = StObject.set(x, "RouteIdentifier", value.asInstanceOf[js.Any])
  }
}
