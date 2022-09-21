package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlabelParameterVersionRequest extends StObject {
  
  /**
    * One or more labels to delete from the specified parameter version.
    */
  var Labels: ParameterLabelList
  
  /**
    * The name of the parameter from which you want to delete one or more labels.
    */
  var Name: PSParameterName
  
  /**
    * The specific version of the parameter which you want to delete one or more labels from. If it isn't present, the call will fail.
    */
  var ParameterVersion: PSParameterVersion
}
object UnlabelParameterVersionRequest {
  
  inline def apply(Labels: ParameterLabelList, Name: PSParameterName, ParameterVersion: PSParameterVersion): UnlabelParameterVersionRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParameterVersion = ParameterVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlabelParameterVersionRequest]
  }
  
  extension [Self <: UnlabelParameterVersionRequest](x: Self) {
    
    inline def setLabels(value: ParameterLabelList): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: ParameterLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setName(value: PSParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameterVersion(value: PSParameterVersion): Self = StObject.set(x, "ParameterVersion", value.asInstanceOf[js.Any])
  }
}
