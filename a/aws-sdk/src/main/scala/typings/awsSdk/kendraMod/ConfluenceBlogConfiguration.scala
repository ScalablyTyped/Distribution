package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfluenceBlogConfiguration extends js.Object {
  
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
  implicit class ConfluenceBlogConfigurationOps[Self <: ConfluenceBlogConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlogFieldMappingsVarargs(value: ConfluenceBlogToIndexFieldMapping*): Self = this.set("BlogFieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlogFieldMappings(value: ConfluenceBlogFieldMappingsList): Self = this.set("BlogFieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlogFieldMappings: Self = this.set("BlogFieldMappings", js.undefined)
  }
}
