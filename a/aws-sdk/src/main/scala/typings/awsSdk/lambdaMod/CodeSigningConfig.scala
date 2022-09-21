package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSigningConfig extends StObject {
  
  /**
    * List of allowed publishers.
    */
  var AllowedPublishers: typings.awsSdk.lambdaMod.AllowedPublishers
  
  /**
    * The Amazon Resource Name (ARN) of the Code signing configuration.
    */
  var CodeSigningConfigArn: typings.awsSdk.lambdaMod.CodeSigningConfigArn
  
  /**
    * Unique identifer for the Code signing configuration.
    */
  var CodeSigningConfigId: typings.awsSdk.lambdaMod.CodeSigningConfigId
  
  /**
    * The code signing policy controls the validation failure action for signature mismatch or expiry.
    */
  var CodeSigningPolicies: typings.awsSdk.lambdaMod.CodeSigningPolicies
  
  /**
    * Code signing configuration description.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.undefined
  
  /**
    * The date and time that the Code signing configuration was last modified, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD). 
    */
  var LastModified: Timestamp
}
object CodeSigningConfig {
  
  inline def apply(
    AllowedPublishers: AllowedPublishers,
    CodeSigningConfigArn: CodeSigningConfigArn,
    CodeSigningConfigId: CodeSigningConfigId,
    CodeSigningPolicies: CodeSigningPolicies,
    LastModified: Timestamp
  ): CodeSigningConfig = {
    val __obj = js.Dynamic.literal(AllowedPublishers = AllowedPublishers.asInstanceOf[js.Any], CodeSigningConfigArn = CodeSigningConfigArn.asInstanceOf[js.Any], CodeSigningConfigId = CodeSigningConfigId.asInstanceOf[js.Any], CodeSigningPolicies = CodeSigningPolicies.asInstanceOf[js.Any], LastModified = LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSigningConfig]
  }
  
  extension [Self <: CodeSigningConfig](x: Self) {
    
    inline def setAllowedPublishers(value: AllowedPublishers): Self = StObject.set(x, "AllowedPublishers", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningConfigArn(value: CodeSigningConfigArn): Self = StObject.set(x, "CodeSigningConfigArn", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningConfigId(value: CodeSigningConfigId): Self = StObject.set(x, "CodeSigningConfigId", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningPolicies(value: CodeSigningPolicies): Self = StObject.set(x, "CodeSigningPolicies", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModified(value: Timestamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
  }
}
