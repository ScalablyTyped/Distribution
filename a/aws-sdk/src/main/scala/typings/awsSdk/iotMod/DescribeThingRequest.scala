package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThingRequest extends StObject {
  
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}
object DescribeThingRequest {
  
  @scala.inline
  def apply(thingName: ThingName): DescribeThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingRequest]
  }
  
  @scala.inline
  implicit class DescribeThingRequestMutableBuilder[Self <: DescribeThingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
