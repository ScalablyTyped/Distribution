package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceResult extends StObject {
  
  /**
    * The component id of the resource.
    */
  var ComponentId: js.UndefOr[string] = js.undefined
  
  /**
    * The time (UTC) that the resource was last checked for readiness, in ISO-8601 format.
    */
  var LastCheckedTimestamp: js.Date
  
  /**
    * The readiness of a resource.
    */
  var Readiness: typings.awsSdk.route53recoveryreadinessMod.Readiness
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[string] = js.undefined
}
object ResourceResult {
  
  inline def apply(LastCheckedTimestamp: js.Date, Readiness: Readiness): ResourceResult = {
    val __obj = js.Dynamic.literal(LastCheckedTimestamp = LastCheckedTimestamp.asInstanceOf[js.Any], Readiness = Readiness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceResult]
  }
  
  extension [Self <: ResourceResult](x: Self) {
    
    inline def setComponentId(value: string): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
    
    inline def setLastCheckedTimestamp(value: js.Date): Self = StObject.set(x, "LastCheckedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setReadiness(value: Readiness): Self = StObject.set(x, "Readiness", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
