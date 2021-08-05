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
  
  inline def apply(StackId: String): RegisterVolumeRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterVolumeRequest]
  }
  
  extension [Self <: RegisterVolumeRequest](x: Self) {
    
    inline def setEc2VolumeId(value: String): Self = StObject.set(x, "Ec2VolumeId", value.asInstanceOf[js.Any])
    
    inline def setEc2VolumeIdUndefined: Self = StObject.set(x, "Ec2VolumeId", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
