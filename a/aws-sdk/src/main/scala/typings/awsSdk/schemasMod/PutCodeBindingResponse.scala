package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutCodeBindingResponse extends StObject {
  
  /**
    * The time and date that the code binding was created.
    */
  var CreationDate: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The date and time that code bindings were modified.
    */
  var LastModified: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var SchemaVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of code binding generation.
    */
  var Status: js.UndefOr[CodeGenerationStatus] = js.undefined
}
object PutCodeBindingResponse {
  
  @scala.inline
  def apply(): PutCodeBindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutCodeBindingResponse]
  }
  
  @scala.inline
  implicit class PutCodeBindingResponseMutableBuilder[Self <: PutCodeBindingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: timestampIso8601): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setLastModified(value: timestampIso8601): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    @scala.inline
    def setStatus(value: CodeGenerationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
