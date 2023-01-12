package typings.awsSdk.clientsXrayMod

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
  
  inline def apply(): AvailabilityZoneDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZoneDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailabilityZoneDetail] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
