package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImportRequest extends StObject {
  
  /**
    * The password used to encrypt the zip archive that contains the resource definition. You should always encrypt the zip archive to protect it during transit between your site and Amazon Lex.
    */
  var filePassword: js.UndefOr[ImportExportFilePassword] = js.undefined
  
  /**
    * The unique identifier for the import. It is included in the response from the CreateUploadUrl operation.
    */
  var importId: Id
  
  /**
    * The strategy to use when there is a name conflict between the imported resource and an existing resource. When the merge strategy is FailOnConflict existing resources are not overwritten and the import fails.
    */
  var mergeStrategy: MergeStrategy
  
  /**
    * Parameters for creating the bot, bot locale or custom vocabulary.
    */
  var resourceSpecification: ImportResourceSpecification
}
object StartImportRequest {
  
  inline def apply(importId: Id, mergeStrategy: MergeStrategy, resourceSpecification: ImportResourceSpecification): StartImportRequest = {
    val __obj = js.Dynamic.literal(importId = importId.asInstanceOf[js.Any], mergeStrategy = mergeStrategy.asInstanceOf[js.Any], resourceSpecification = resourceSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportRequest]
  }
  
  extension [Self <: StartImportRequest](x: Self) {
    
    inline def setFilePassword(value: ImportExportFilePassword): Self = StObject.set(x, "filePassword", value.asInstanceOf[js.Any])
    
    inline def setFilePasswordUndefined: Self = StObject.set(x, "filePassword", js.undefined)
    
    inline def setImportId(value: Id): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecification(value: ImportResourceSpecification): Self = StObject.set(x, "resourceSpecification", value.asInstanceOf[js.Any])
  }
}
