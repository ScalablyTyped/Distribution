package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkDeployment extends StObject {
  
  /**
    * The ARN of the bulk deployment.
    */
  var BulkDeploymentArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: js.UndefOr[string] = js.undefined
  
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.undefined
}
object BulkDeployment {
  
  inline def apply(): BulkDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkDeployment]
  }
  
  extension [Self <: BulkDeployment](x: Self) {
    
    inline def setBulkDeploymentArn(value: string): Self = StObject.set(x, "BulkDeploymentArn", value.asInstanceOf[js.Any])
    
    inline def setBulkDeploymentArnUndefined: Self = StObject.set(x, "BulkDeploymentArn", js.undefined)
    
    inline def setBulkDeploymentId(value: string): Self = StObject.set(x, "BulkDeploymentId", value.asInstanceOf[js.Any])
    
    inline def setBulkDeploymentIdUndefined: Self = StObject.set(x, "BulkDeploymentId", js.undefined)
    
    inline def setCreatedAt(value: string): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
  }
}
