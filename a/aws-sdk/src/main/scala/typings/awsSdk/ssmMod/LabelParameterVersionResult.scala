package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelParameterVersionResult extends StObject {
  
  /**
    * The label does not meet the requirements. For information about parameter label requirements, see Labeling parameters in the AWS Systems Manager User Guide.
    */
  var InvalidLabels: js.UndefOr[ParameterLabelList] = js.native
  
  /**
    * The version of the parameter that has been labeled.
    */
  var ParameterVersion: js.UndefOr[PSParameterVersion] = js.native
}
object LabelParameterVersionResult {
  
  @scala.inline
  def apply(): LabelParameterVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelParameterVersionResult]
  }
  
  @scala.inline
  implicit class LabelParameterVersionResultMutableBuilder[Self <: LabelParameterVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidLabels(value: ParameterLabelList): Self = StObject.set(x, "InvalidLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidLabelsUndefined: Self = StObject.set(x, "InvalidLabels", js.undefined)
    
    @scala.inline
    def setInvalidLabelsVarargs(value: ParameterLabel*): Self = StObject.set(x, "InvalidLabels", js.Array(value :_*))
    
    @scala.inline
    def setParameterVersion(value: PSParameterVersion): Self = StObject.set(x, "ParameterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterVersionUndefined: Self = StObject.set(x, "ParameterVersion", js.undefined)
  }
}
