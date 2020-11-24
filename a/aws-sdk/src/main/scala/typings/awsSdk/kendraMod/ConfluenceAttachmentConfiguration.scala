package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfluenceAttachmentConfiguration extends js.Object {
  
  /**
    * Defines how attachment metadata fields should be mapped to index fields. Before you can map a field, you must first create an index field with a matching type using the console or the UpdateIndex operation. If you specify the AttachentFieldMappings parameter, you must specify at least one field mapping.
    */
  var AttachmentFieldMappings: js.UndefOr[ConfluenceAttachmentFieldMappingsList] = js.native
  
  /**
    * Indicates whether Amazon Kendra indexes attachments to the pages and blogs in the Confluence data source. 
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.native
}
object ConfluenceAttachmentConfiguration {
  
  @scala.inline
  def apply(): ConfluenceAttachmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceAttachmentConfiguration]
  }
  
  @scala.inline
  implicit class ConfluenceAttachmentConfigurationOps[Self <: ConfluenceAttachmentConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAttachmentFieldMappingsVarargs(value: ConfluenceAttachmentToIndexFieldMapping*): Self = this.set("AttachmentFieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentFieldMappings(value: ConfluenceAttachmentFieldMappingsList): Self = this.set("AttachmentFieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentFieldMappings: Self = this.set("AttachmentFieldMappings", js.undefined)
    
    @scala.inline
    def setCrawlAttachments(value: Boolean): Self = this.set("CrawlAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlAttachments: Self = this.set("CrawlAttachments", js.undefined)
  }
}
