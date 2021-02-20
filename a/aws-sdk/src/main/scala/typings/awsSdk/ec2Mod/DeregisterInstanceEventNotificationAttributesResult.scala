package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterInstanceEventNotificationAttributesResult extends StObject {
  
  /**
    * The resulting set of tag keys.
    */
  var InstanceTagAttribute: js.UndefOr[InstanceTagNotificationAttribute] = js.native
}
object DeregisterInstanceEventNotificationAttributesResult {
  
  @scala.inline
  def apply(): DeregisterInstanceEventNotificationAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterInstanceEventNotificationAttributesResult]
  }
  
  @scala.inline
  implicit class DeregisterInstanceEventNotificationAttributesResultMutableBuilder[Self <: DeregisterInstanceEventNotificationAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTagAttribute(value: InstanceTagNotificationAttribute): Self = StObject.set(x, "InstanceTagAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTagAttributeUndefined: Self = StObject.set(x, "InstanceTagAttribute", js.undefined)
  }
}
