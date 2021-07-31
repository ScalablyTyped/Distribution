package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersionSummary extends StObject {
  
  /**
    * The ARN of the schema version.
    */
  var SchemaArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var SchemaVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The type of schema.
    */
  var Type: js.UndefOr[typings.awsSdk.schemasMod.Type] = js.undefined
}
object SchemaVersionSummary {
  
  @scala.inline
  def apply(): SchemaVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionSummary]
  }
  
  @scala.inline
  implicit class SchemaVersionSummaryMutableBuilder[Self <: SchemaVersionSummary] (val x: Self) extends AnyVal {
    
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
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
