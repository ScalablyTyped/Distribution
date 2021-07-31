package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetHealthInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.elbv2Mod.TargetGroupArn
  
  /**
    * The targets.
    */
  var Targets: js.UndefOr[TargetDescriptions] = js.undefined
}
object DescribeTargetHealthInput {
  
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn): DescribeTargetHealthInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetHealthInput]
  }
  
  @scala.inline
  implicit class DescribeTargetHealthInputMutableBuilder[Self <: DescribeTargetHealthInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargets(value: TargetDescriptions): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: TargetDescription*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
