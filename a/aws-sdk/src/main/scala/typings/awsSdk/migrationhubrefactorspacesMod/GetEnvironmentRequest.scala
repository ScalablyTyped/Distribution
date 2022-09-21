package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentRequest extends StObject {
  
  /**
    * The ID of the environment.
    */
  var EnvironmentIdentifier: EnvironmentId
}
object GetEnvironmentRequest {
  
  inline def apply(EnvironmentIdentifier: EnvironmentId): GetEnvironmentRequest = {
    val __obj = js.Dynamic.literal(EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentRequest]
  }
  
  extension [Self <: GetEnvironmentRequest](x: Self) {
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
  }
}
