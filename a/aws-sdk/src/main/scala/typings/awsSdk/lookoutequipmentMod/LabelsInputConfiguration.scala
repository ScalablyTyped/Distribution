package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelsInputConfiguration extends StObject {
  
  /**
    *  The name of the label group to be used for label data. 
    */
  var LabelGroupName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.LabelGroupName] = js.undefined
  
  /**
    * Contains location information for the S3 location being used for label data. 
    */
  var S3InputConfiguration: js.UndefOr[LabelsS3InputConfiguration] = js.undefined
}
object LabelsInputConfiguration {
  
  inline def apply(): LabelsInputConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelsInputConfiguration]
  }
  
  extension [Self <: LabelsInputConfiguration](x: Self) {
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupNameUndefined: Self = StObject.set(x, "LabelGroupName", js.undefined)
    
    inline def setS3InputConfiguration(value: LabelsS3InputConfiguration): Self = StObject.set(x, "S3InputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3InputConfigurationUndefined: Self = StObject.set(x, "S3InputConfiguration", js.undefined)
  }
}
