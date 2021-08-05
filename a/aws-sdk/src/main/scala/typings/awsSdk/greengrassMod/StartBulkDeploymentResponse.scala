package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBulkDeploymentResponse extends StObject {
  
  /**
    * The ARN of the bulk deployment.
    */
  var BulkDeploymentArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: js.UndefOr[string] = js.undefined
}
object StartBulkDeploymentResponse {
  
  inline def apply(): StartBulkDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBulkDeploymentResponse]
  }
  
  extension [Self <: StartBulkDeploymentResponse](x: Self) {
    
    inline def setBulkDeploymentArn(value: string): Self = StObject.set(x, "BulkDeploymentArn", value.asInstanceOf[js.Any])
    
    inline def setBulkDeploymentArnUndefined: Self = StObject.set(x, "BulkDeploymentArn", js.undefined)
    
    inline def setBulkDeploymentId(value: string): Self = StObject.set(x, "BulkDeploymentId", value.asInstanceOf[js.Any])
    
    inline def setBulkDeploymentIdUndefined: Self = StObject.set(x, "BulkDeploymentId", js.undefined)
  }
}
