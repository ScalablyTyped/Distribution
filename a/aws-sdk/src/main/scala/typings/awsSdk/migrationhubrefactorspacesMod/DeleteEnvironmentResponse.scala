package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The unique identifier of the environment.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.migrationhubrefactorspacesMod.EnvironmentId] = js.undefined
  
  /**
    * A timestamp that indicates when the environment was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the environment.
    */
  var Name: js.UndefOr[EnvironmentName] = js.undefined
  
  /**
    * The current state of the environment. 
    */
  var State: js.UndefOr[EnvironmentState] = js.undefined
}
object DeleteEnvironmentResponse {
  
  inline def apply(): DeleteEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEnvironmentResponse]
  }
  
  extension [Self <: DeleteEnvironmentResponse](x: Self) {
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: EnvironmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
