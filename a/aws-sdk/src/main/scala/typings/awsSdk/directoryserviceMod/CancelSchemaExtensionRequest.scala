package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSchemaExtensionRequest extends StObject {
  
  /**
    * The identifier of the directory whose schema extension will be canceled.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The identifier of the schema extension that will be canceled.
    */
  var SchemaExtensionId: typings.awsSdk.directoryserviceMod.SchemaExtensionId
}
object CancelSchemaExtensionRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, SchemaExtensionId: SchemaExtensionId): CancelSchemaExtensionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], SchemaExtensionId = SchemaExtensionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSchemaExtensionRequest]
  }
  
  @scala.inline
  implicit class CancelSchemaExtensionRequestMutableBuilder[Self <: CancelSchemaExtensionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaExtensionId(value: SchemaExtensionId): Self = StObject.set(x, "SchemaExtensionId", value.asInstanceOf[js.Any])
  }
}
