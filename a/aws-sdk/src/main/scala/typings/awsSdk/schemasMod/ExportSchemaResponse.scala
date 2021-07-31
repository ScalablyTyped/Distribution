package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSchemaResponse extends StObject {
  
  var Content: js.UndefOr[string] = js.undefined
  
  var SchemaArn: js.UndefOr[string] = js.undefined
  
  var SchemaName: js.UndefOr[string] = js.undefined
  
  var SchemaVersion: js.UndefOr[string] = js.undefined
  
  var Type: js.UndefOr[string] = js.undefined
}
object ExportSchemaResponse {
  
  @scala.inline
  def apply(): ExportSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSchemaResponse]
  }
  
  @scala.inline
  implicit class ExportSchemaResponseMutableBuilder[Self <: ExportSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: string): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: string): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
