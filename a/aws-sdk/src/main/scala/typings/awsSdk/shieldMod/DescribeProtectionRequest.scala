package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProtectionRequest extends StObject {
  
  /**
    * The unique identifier (ID) for the Protection object that is described. When submitting the DescribeProtection request you must provide either the ResourceArn or the ProtectionID, but not both.
    */
  var ProtectionId: js.UndefOr[typings.awsSdk.shieldMod.ProtectionId] = js.native
  
  /**
    * The ARN (Amazon Resource Name) of the AWS resource for the Protection object that is described. When submitting the DescribeProtection request you must provide either the ResourceArn or the ProtectionID, but not both.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.shieldMod.ResourceArn] = js.native
}
object DescribeProtectionRequest {
  
  @scala.inline
  def apply(): DescribeProtectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectionRequest]
  }
  
  @scala.inline
  implicit class DescribeProtectionRequestMutableBuilder[Self <: DescribeProtectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectionId(value: ProtectionId): Self = StObject.set(x, "ProtectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionIdUndefined: Self = StObject.set(x, "ProtectionId", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
