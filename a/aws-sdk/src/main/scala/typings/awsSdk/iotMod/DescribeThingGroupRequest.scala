package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThingGroupRequest extends StObject {
  
  /**
    * The name of the thing group.
    */
  var thingGroupName: ThingGroupName = js.native
}
object DescribeThingGroupRequest {
  
  @scala.inline
  def apply(thingGroupName: ThingGroupName): DescribeThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingGroupRequest]
  }
  
  @scala.inline
  implicit class DescribeThingGroupRequestMutableBuilder[Self <: DescribeThingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
  }
}
