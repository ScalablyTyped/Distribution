package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluencePageConfiguration extends StObject {
  
  /**
    * Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must first create an index field with a matching type using the console or the UpdateIndex operation. If you specify the PageFieldMappings parameter, you must specify at least one field mapping.
    */
  var PageFieldMappings: js.UndefOr[ConfluencePageFieldMappingsList] = js.undefined
}
object ConfluencePageConfiguration {
  
  inline def apply(): ConfluencePageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluencePageConfiguration]
  }
  
  extension [Self <: ConfluencePageConfiguration](x: Self) {
    
    inline def setPageFieldMappings(value: ConfluencePageFieldMappingsList): Self = StObject.set(x, "PageFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setPageFieldMappingsUndefined: Self = StObject.set(x, "PageFieldMappings", js.undefined)
    
    inline def setPageFieldMappingsVarargs(value: ConfluencePageToIndexFieldMapping*): Self = StObject.set(x, "PageFieldMappings", js.Array(value :_*))
  }
}
