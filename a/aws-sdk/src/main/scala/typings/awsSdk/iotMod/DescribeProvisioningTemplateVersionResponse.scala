package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisioningTemplateVersionResponse extends StObject {
  
  /**
    * The date when the fleet provisioning template version was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * True if the fleet provisioning template version is the default version.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined
  
  /**
    * The JSON formatted contents of the fleet provisioning template version.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.undefined
  
  /**
    * The fleet provisioning template version ID.
    */
  var versionId: js.UndefOr[TemplateVersionId] = js.undefined
}
object DescribeProvisioningTemplateVersionResponse {
  
  inline def apply(): DescribeProvisioningTemplateVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningTemplateVersionResponse]
  }
  
  extension [Self <: DescribeProvisioningTemplateVersionResponse](x: Self) {
    
    inline def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setIsDefaultVersion(value: IsDefaultVersion): Self = StObject.set(x, "isDefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultVersionUndefined: Self = StObject.set(x, "isDefaultVersion", js.undefined)
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
    
    inline def setVersionId(value: TemplateVersionId): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
