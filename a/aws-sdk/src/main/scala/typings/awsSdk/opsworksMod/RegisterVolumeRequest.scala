package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterVolumeRequest extends StObject {
  
  /**
    * The Amazon EBS volume ID.
    */
  var Ec2VolumeId: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object RegisterVolumeRequest {
  
  @scala.inline
  def apply(StackId: String): RegisterVolumeRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterVolumeRequest]
  }
  
  @scala.inline
  implicit class RegisterVolumeRequestMutableBuilder[Self <: RegisterVolumeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEc2VolumeId(value: String): Self = StObject.set(x, "Ec2VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2VolumeIdUndefined: Self = StObject.set(x, "Ec2VolumeId", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
