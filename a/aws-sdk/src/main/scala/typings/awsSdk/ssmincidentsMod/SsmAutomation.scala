package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmAutomation extends StObject {
  
  /**
    * The automation document's name.
    */
  var documentName: SsmAutomationDocumentNameString
  
  /**
    * The automation document's version to use when running.
    */
  var documentVersion: js.UndefOr[SsmAutomationDocumentVersionString] = js.undefined
  
  /**
    * The key-value pair to resolve dynamic parameter values when processing a Systems Manager Automation runbook.
    */
  var dynamicParameters: js.UndefOr[DynamicSsmParameters] = js.undefined
  
  /**
    * The key-value pair parameters to use when running the automation document.
    */
  var parameters: js.UndefOr[SsmParameters] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role that the automation document will assume when running commands.
    */
  var roleArn: RoleArn
  
  /**
    * The account that the automation document will be run in. This can be in either the management account or an application account.
    */
  var targetAccount: js.UndefOr[SsmTargetAccount] = js.undefined
}
object SsmAutomation {
  
  inline def apply(documentName: SsmAutomationDocumentNameString, roleArn: RoleArn): SsmAutomation = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsmAutomation]
  }
  
  extension [Self <: SsmAutomation](x: Self) {
    
    inline def setDocumentName(value: SsmAutomationDocumentNameString): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersion(value: SsmAutomationDocumentVersionString): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
    
    inline def setDynamicParameters(value: DynamicSsmParameters): Self = StObject.set(x, "dynamicParameters", value.asInstanceOf[js.Any])
    
    inline def setDynamicParametersUndefined: Self = StObject.set(x, "dynamicParameters", js.undefined)
    
    inline def setParameters(value: SsmParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTargetAccount(value: SsmTargetAccount): Self = StObject.set(x, "targetAccount", value.asInstanceOf[js.Any])
    
    inline def setTargetAccountUndefined: Self = StObject.set(x, "targetAccount", js.undefined)
  }
}
