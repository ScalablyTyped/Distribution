package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAvailabilityOptionsResponse extends StObject {
  
  /**
    * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain. 
    */
  var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
}
object DescribeAvailabilityOptionsResponse {
  
  @scala.inline
  def apply(): DescribeAvailabilityOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailabilityOptionsResponse]
  }
  
  @scala.inline
  implicit class DescribeAvailabilityOptionsResponseMutableBuilder[Self <: DescribeAvailabilityOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityOptions(value: AvailabilityOptionsStatus): Self = StObject.set(x, "AvailabilityOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityOptionsUndefined: Self = StObject.set(x, "AvailabilityOptions", js.undefined)
  }
}
