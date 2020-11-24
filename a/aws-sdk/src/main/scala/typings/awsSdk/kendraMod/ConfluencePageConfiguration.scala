package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfluencePageConfiguration extends js.Object {
  
  /**
    * Defines how page metadata fields should be mapped to index fields. Before you can map a field, you must first create an index field with a matching type using the console or the UpdateIndex operation. If you specify the PageFieldMappings parameter, you must specify at least one field mapping.
    */
  var PageFieldMappings: js.UndefOr[ConfluencePageFieldMappingsList] = js.native
}
object ConfluencePageConfiguration {
  
  @scala.inline
  def apply(): ConfluencePageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluencePageConfiguration]
  }
  
  @scala.inline
  implicit class ConfluencePageConfigurationOps[Self <: ConfluencePageConfiguration] (val x: Self) extends AnyVal {
    
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
    def setPageFieldMappingsVarargs(value: ConfluencePageToIndexFieldMapping*): Self = this.set("PageFieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setPageFieldMappings(value: ConfluencePageFieldMappingsList): Self = this.set("PageFieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageFieldMappings: Self = this.set("PageFieldMappings", js.undefined)
  }
}
