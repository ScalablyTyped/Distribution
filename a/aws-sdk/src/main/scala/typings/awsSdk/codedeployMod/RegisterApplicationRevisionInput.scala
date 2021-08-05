package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterApplicationRevisionInput extends StObject {
  
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName
  
  /**
    * A comment about the revision.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Information about the application revision to register, including type and location.
    */
  var revision: RevisionLocation
}
object RegisterApplicationRevisionInput {
  
  inline def apply(applicationName: ApplicationName, revision: RevisionLocation): RegisterApplicationRevisionInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterApplicationRevisionInput]
  }
  
  extension [Self <: RegisterApplicationRevisionInput](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRevision(value: RevisionLocation): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
