package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortEnvironmentUpdateMessage extends StObject {
  
  /**
    * This specifies the ID of the environment with the in-progress update that you want to cancel.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.undefined
  
  /**
    * This specifies the name of the environment with the in-progress update that you want to cancel.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.undefined
}
object AbortEnvironmentUpdateMessage {
  
  inline def apply(): AbortEnvironmentUpdateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortEnvironmentUpdateMessage]
  }
  
  extension [Self <: AbortEnvironmentUpdateMessage](x: Self) {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
  }
}
