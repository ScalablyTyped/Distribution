package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelParameterVersionRequest extends StObject {
  
  /**
    * One or more labels to attach to the specified parameter version.
    */
  var Labels: ParameterLabelList = js.native
  
  /**
    * The parameter name on which you want to attach one or more labels.
    */
  var Name: PSParameterName = js.native
  
  /**
    * The specific version of the parameter on which you want to attach one or more labels. If no version is specified, the system attaches the label to the latest version.
    */
  var ParameterVersion: js.UndefOr[PSParameterVersion] = js.native
}
object LabelParameterVersionRequest {
  
  @scala.inline
  def apply(Labels: ParameterLabelList, Name: PSParameterName): LabelParameterVersionRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelParameterVersionRequest]
  }
  
  @scala.inline
  implicit class LabelParameterVersionRequestMutableBuilder[Self <: LabelParameterVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: ParameterLabelList): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: ParameterLabel*): Self = StObject.set(x, "Labels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: PSParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterVersion(value: PSParameterVersion): Self = StObject.set(x, "ParameterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterVersionUndefined: Self = StObject.set(x, "ParameterVersion", js.undefined)
  }
}
