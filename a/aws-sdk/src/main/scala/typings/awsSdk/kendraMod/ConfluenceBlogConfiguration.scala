package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfluenceBlogConfiguration extends StObject {
  
  /**
    * Defines how blog metadata fields should be mapped to index fields. Before you can map a field, you must first create an index field with a matching type using the console or the UpdateIndex operation. If you specify the BlogFieldMappings parameter, you must specify at least one field mapping.
    */
  var BlogFieldMappings: js.UndefOr[ConfluenceBlogFieldMappingsList] = js.native
}
object ConfluenceBlogConfiguration {
  
  @scala.inline
  def apply(): ConfluenceBlogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceBlogConfiguration]
  }
  
  @scala.inline
  implicit class ConfluenceBlogConfigurationMutableBuilder[Self <: ConfluenceBlogConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlogFieldMappings(value: ConfluenceBlogFieldMappingsList): Self = StObject.set(x, "BlogFieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogFieldMappingsUndefined: Self = StObject.set(x, "BlogFieldMappings", js.undefined)
    
    @scala.inline
    def setBlogFieldMappingsVarargs(value: ConfluenceBlogToIndexFieldMapping*): Self = StObject.set(x, "BlogFieldMappings", js.Array(value :_*))
  }
}
