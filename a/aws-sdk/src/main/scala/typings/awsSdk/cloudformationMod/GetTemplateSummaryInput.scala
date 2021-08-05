package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateSummaryInput extends StObject {
  
  /**
    * The name or the stack ID that is associated with the stack, which are not always interchangeable. For running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you must specify the unique stack ID. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.undefined
  
  /**
    * The name or unique ID of the stack set from which the stack was created. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var StackSetName: js.UndefOr[StackSetNameOrId] = js.undefined
  
  /**
    * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information about templates, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateBody] = js.undefined
  
  /**
    * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket. For more information about templates, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var TemplateURL: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateURL] = js.undefined
}
object GetTemplateSummaryInput {
  
  inline def apply(): GetTemplateSummaryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateSummaryInput]
  }
  
  extension [Self <: GetTemplateSummaryInput](x: Self) {
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
    
    inline def setStackSetName(value: StackSetNameOrId): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
    
    inline def setStackSetNameUndefined: Self = StObject.set(x, "StackSetName", js.undefined)
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
    
    inline def setTemplateURL(value: TemplateURL): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
    
    inline def setTemplateURLUndefined: Self = StObject.set(x, "TemplateURL", js.undefined)
  }
}
