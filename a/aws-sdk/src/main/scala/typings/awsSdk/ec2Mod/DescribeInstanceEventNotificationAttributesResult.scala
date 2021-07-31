package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceEventNotificationAttributesResult extends StObject {
  
  /**
    * Information about the registered tag keys.
    */
  var InstanceTagAttribute: js.UndefOr[InstanceTagNotificationAttribute] = js.undefined
}
object DescribeInstanceEventNotificationAttributesResult {
  
  @scala.inline
  def apply(): DescribeInstanceEventNotificationAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceEventNotificationAttributesResult]
  }
  
  @scala.inline
  implicit class DescribeInstanceEventNotificationAttributesResultMutableBuilder[Self <: DescribeInstanceEventNotificationAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTagAttribute(value: InstanceTagNotificationAttribute): Self = StObject.set(x, "InstanceTagAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTagAttributeUndefined: Self = StObject.set(x, "InstanceTagAttribute", js.undefined)
  }
}
