package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceStandardObjectAttachmentConfiguration extends StObject {
  
  /**
    * The name of the field used for the document title.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  
  /**
    * One or more objects that map fields in attachments to Amazon Kendra index fields.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
}
object SalesforceStandardObjectAttachmentConfiguration {
  
  @scala.inline
  def apply(): SalesforceStandardObjectAttachmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceStandardObjectAttachmentConfiguration]
  }
  
  @scala.inline
  implicit class SalesforceStandardObjectAttachmentConfigurationMutableBuilder[Self <: SalesforceStandardObjectAttachmentConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentTitleFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleFieldNameUndefined: Self = StObject.set(x, "DocumentTitleFieldName", js.undefined)
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value :_*))
  }
}
