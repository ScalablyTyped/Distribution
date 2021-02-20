package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSchemaVersionSummary extends StObject {
  
  /**
    * The date the schema version was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[string] = js.native
  
  /**
    * The type of schema.
    */
  var Type: js.UndefOr[typings.awsSdk.schemasMod.Type] = js.native
}
object SearchSchemaVersionSummary {
  
  @scala.inline
  def apply(): SearchSchemaVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemaVersionSummary]
  }
  
  @scala.inline
  implicit class SearchSchemaVersionSummaryMutableBuilder[Self <: SearchSchemaVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: timestampIso8601): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
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
