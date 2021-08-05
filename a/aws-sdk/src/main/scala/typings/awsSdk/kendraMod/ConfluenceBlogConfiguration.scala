package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluenceBlogConfiguration extends StObject {
  
  /**
    * Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must first create an index field with a matching type using the console or the UpdateIndex operation. If you specify the BlogFieldMappings parameter, you must specify at least one field mapping.
    */
  var BlogFieldMappings: js.UndefOr[ConfluenceBlogFieldMappingsList] = js.undefined
}
object ConfluenceBlogConfiguration {
  
  inline def apply(): ConfluenceBlogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceBlogConfiguration]
  }
  
  extension [Self <: ConfluenceBlogConfiguration](x: Self) {
    
    inline def setBlogFieldMappings(value: ConfluenceBlogFieldMappingsList): Self = StObject.set(x, "BlogFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setBlogFieldMappingsUndefined: Self = StObject.set(x, "BlogFieldMappings", js.undefined)
    
    inline def setBlogFieldMappingsVarargs(value: ConfluenceBlogToIndexFieldMapping*): Self = StObject.set(x, "BlogFieldMappings", js.Array(value :_*))
  }
}
