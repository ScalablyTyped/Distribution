package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelParameterVersionRequest extends StObject {
  
  /**
    * One or more labels to attach to the specified parameter version.
    */
  var Labels: ParameterLabelList
  
  /**
    * The parameter name on which you want to attach one or more labels.
    */
  var Name: PSParameterName
  
  /**
    * The specific version of the parameter on which you want to attach one or more labels. If no version is specified, the system attaches the label to the latest version.
    */
  var ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined
}
object LabelParameterVersionRequest {
  
  inline def apply(Labels: ParameterLabelList, Name: PSParameterName): LabelParameterVersionRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelParameterVersionRequest]
  }
  
  extension [Self <: LabelParameterVersionRequest](x: Self) {
    
    inline def setLabels(value: ParameterLabelList): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: ParameterLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setName(value: PSParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameterVersion(value: PSParameterVersion): Self = StObject.set(x, "ParameterVersion", value.asInstanceOf[js.Any])
    
    inline def setParameterVersionUndefined: Self = StObject.set(x, "ParameterVersion", js.undefined)
  }
}
