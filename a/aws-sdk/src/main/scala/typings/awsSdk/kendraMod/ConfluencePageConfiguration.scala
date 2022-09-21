package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluencePageConfiguration extends StObject {
  
  /**
    * Maps attributes or field names of Confluence pages to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Confluence fields. For more information, see Mapping data source fields. The Confluence data source field names must exist in your Confluence custom metadata. If you specify the PageFieldMappings parameter, you must specify at least one field mapping.
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
    
    inline def setPageFieldMappingsVarargs(value: ConfluencePageToIndexFieldMapping*): Self = StObject.set(x, "PageFieldMappings", js.Array(value*))
  }
}
