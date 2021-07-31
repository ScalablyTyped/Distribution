package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Protection extends StObject {
  
  /**
    * The unique identifier (ID) for the Route 53 health check that's associated with the protection. 
    */
  var HealthCheckIds: js.UndefOr[typings.awsSdk.shieldMod.HealthCheckIds] = js.undefined
  
  /**
    * The unique identifier (ID) of the protection.
    */
  var Id: js.UndefOr[ProtectionId] = js.undefined
  
  /**
    * The name of the protection. For example, My CloudFront distributions.
    */
  var Name: js.UndefOr[ProtectionName] = js.undefined
  
  /**
    * The ARN (Amazon Resource Name) of the AWS resource that is protected.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.shieldMod.ResourceArn] = js.undefined
}
object Protection {
  
  @scala.inline
  def apply(): Protection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Protection]
  }
  
  @scala.inline
  implicit class ProtectionMutableBuilder[Self <: Protection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckIds(value: HealthCheckIds): Self = StObject.set(x, "HealthCheckIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckIdsUndefined: Self = StObject.set(x, "HealthCheckIds", js.undefined)
    
    @scala.inline
    def setHealthCheckIdsVarargs(value: HealthCheckId*): Self = StObject.set(x, "HealthCheckIds", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ProtectionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ProtectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
