package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaAsJsonResponse extends StObject {
  
  /**
    * The JSON representation of the schema document.
    */
  var Document: js.UndefOr[SchemaJsonDocument] = js.undefined
  
  /**
    * The name of the retrieved schema.
    */
  var Name: js.UndefOr[SchemaName] = js.undefined
}
object GetSchemaAsJsonResponse {
  
  @scala.inline
  def apply(): GetSchemaAsJsonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaAsJsonResponse]
  }
  
  @scala.inline
  implicit class GetSchemaAsJsonResponseMutableBuilder[Self <: GetSchemaAsJsonResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: SchemaJsonDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
    
    @scala.inline
    def setName(value: SchemaName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
