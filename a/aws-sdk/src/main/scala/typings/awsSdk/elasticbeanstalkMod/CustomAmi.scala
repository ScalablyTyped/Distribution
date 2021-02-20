package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAmi extends StObject {
  
  /**
    * THe ID of the image used to create the custom AMI.
    */
  var ImageId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ImageId] = js.native
  
  /**
    * The type of virtualization used to create the custom AMI.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VirtualizationType] = js.native
}
object CustomAmi {
  
  @scala.inline
  def apply(): CustomAmi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAmi]
  }
  
  @scala.inline
  implicit class CustomAmiMutableBuilder[Self <: CustomAmi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setVirtualizationType(value: VirtualizationType): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
  }
}
