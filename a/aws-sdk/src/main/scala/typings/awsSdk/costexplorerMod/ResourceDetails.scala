package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * Details on the Amazon EC2 resource.
    */
  var EC2ResourceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.EC2ResourceDetails] = js.undefined
}
object ResourceDetails {
  
  @scala.inline
  def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  @scala.inline
  implicit class ResourceDetailsMutableBuilder[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEC2ResourceDetails(value: EC2ResourceDetails): Self = StObject.set(x, "EC2ResourceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2ResourceDetailsUndefined: Self = StObject.set(x, "EC2ResourceDetails", js.undefined)
  }
}
