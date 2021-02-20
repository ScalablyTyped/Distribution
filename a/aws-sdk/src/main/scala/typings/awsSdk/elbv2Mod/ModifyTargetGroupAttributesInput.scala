package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTargetGroupAttributesInput extends StObject {
  
  /**
    * The attributes.
    */
  var Attributes: TargetGroupAttributes = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.elbv2Mod.TargetGroupArn = js.native
}
object ModifyTargetGroupAttributesInput {
  
  @scala.inline
  def apply(Attributes: TargetGroupAttributes, TargetGroupArn: TargetGroupArn): ModifyTargetGroupAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTargetGroupAttributesInput]
  }
  
  @scala.inline
  implicit class ModifyTargetGroupAttributesInputMutableBuilder[Self <: ModifyTargetGroupAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: TargetGroupAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: TargetGroupAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
  }
}
