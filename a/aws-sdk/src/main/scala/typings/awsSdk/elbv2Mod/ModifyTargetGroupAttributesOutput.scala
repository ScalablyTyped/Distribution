package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTargetGroupAttributesOutput extends StObject {
  
  /**
    * Information about the attributes.
    */
  var Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined
}
object ModifyTargetGroupAttributesOutput {
  
  @scala.inline
  def apply(): ModifyTargetGroupAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTargetGroupAttributesOutput]
  }
  
  @scala.inline
  implicit class ModifyTargetGroupAttributesOutputMutableBuilder[Self <: ModifyTargetGroupAttributesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: TargetGroupAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: TargetGroupAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}
