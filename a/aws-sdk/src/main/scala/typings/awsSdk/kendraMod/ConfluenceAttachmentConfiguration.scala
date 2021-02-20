package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfluenceAttachmentConfiguration extends StObject {
  
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
  implicit class ConfluenceAttachmentConfigurationMutableBuilder[Self <: ConfluenceAttachmentConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentFieldMappings(value: ConfluenceAttachmentFieldMappingsList): Self = StObject.set(x, "AttachmentFieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentFieldMappingsUndefined: Self = StObject.set(x, "AttachmentFieldMappings", js.undefined)
    
    @scala.inline
    def setAttachmentFieldMappingsVarargs(value: ConfluenceAttachmentToIndexFieldMapping*): Self = StObject.set(x, "AttachmentFieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setCrawlAttachments(value: Boolean): Self = StObject.set(x, "CrawlAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlAttachmentsUndefined: Self = StObject.set(x, "CrawlAttachments", js.undefined)
  }
}
