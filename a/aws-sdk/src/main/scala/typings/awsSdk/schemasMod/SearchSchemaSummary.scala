package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSchemaSummary extends StObject {
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  
  /**
    * An array of schema version summaries.
    */
  var SchemaVersions: js.UndefOr[listOfSearchSchemaVersionSummary] = js.native
}
object SearchSchemaSummary {
  
  @scala.inline
  def apply(): SearchSchemaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemaSummary]
  }
  
  @scala.inline
  implicit class SearchSchemaSummaryMutableBuilder[Self <: SearchSchemaSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: string): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaVersions(value: listOfSearchSchemaVersionSummary): Self = StObject.set(x, "SchemaVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionsUndefined: Self = StObject.set(x, "SchemaVersions", js.undefined)
    
    @scala.inline
    def setSchemaVersionsVarargs(value: SearchSchemaVersionSummary*): Self = StObject.set(x, "SchemaVersions", js.Array(value :_*))
  }
}
