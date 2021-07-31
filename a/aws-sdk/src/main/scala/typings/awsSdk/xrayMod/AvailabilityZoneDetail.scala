package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityZoneDetail extends StObject {
  
  /**
    * The name of a corresponding Availability Zone.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object AvailabilityZoneDetail {
  
  @scala.inline
  def apply(): AvailabilityZoneDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZoneDetail]
  }
  
  @scala.inline
  implicit class AvailabilityZoneDetailMutableBuilder[Self <: AvailabilityZoneDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
