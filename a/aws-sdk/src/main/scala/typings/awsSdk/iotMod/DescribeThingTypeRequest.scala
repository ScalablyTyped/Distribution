package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThingTypeRequest extends StObject {
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName
}
object DescribeThingTypeRequest {
  
  @scala.inline
  def apply(thingTypeName: ThingTypeName): DescribeThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingTypeRequest]
  }
  
  @scala.inline
  implicit class DescribeThingTypeRequestMutableBuilder[Self <: DescribeThingTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
  }
}
