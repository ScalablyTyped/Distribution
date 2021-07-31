package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetGroupAttributesInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.elbv2Mod.TargetGroupArn
}
object DescribeTargetGroupAttributesInput {
  
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn): DescribeTargetGroupAttributesInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetGroupAttributesInput]
  }
  
  @scala.inline
  implicit class DescribeTargetGroupAttributesInputMutableBuilder[Self <: DescribeTargetGroupAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
  }
}
