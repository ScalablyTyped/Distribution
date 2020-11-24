package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceStandardObjectConfiguration extends js.Object {
  
  /**
    * The name of the field in the standard object table that contains the document contents.
    */
  var DocumentDataFieldName: DataSourceFieldName = js.native
  
  /**
    * The name of the field in the standard object table that contains the document titleB.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  
  /**
    * One or more objects that map fields in the standard object to Amazon Kendra index fields. The index field must exist before you can map a Salesforce field to it.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  
  /**
    * The name of the standard object.
    */
  var Name: SalesforceStandardObjectName = js.native
}
object SalesforceStandardObjectConfiguration {
  
  @scala.inline
  def apply(DocumentDataFieldName: DataSourceFieldName, Name: SalesforceStandardObjectName): SalesforceStandardObjectConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceStandardObjectConfiguration]
  }
  
  @scala.inline
  implicit class SalesforceStandardObjectConfigurationOps[Self <: SalesforceStandardObjectConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDocumentDataFieldName(value: DataSourceFieldName): Self = this.set("DocumentDataFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: SalesforceStandardObjectName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleFieldName(value: DataSourceFieldName): Self = this.set("DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentTitleFieldName: Self = this.set("DocumentTitleFieldName", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = this.set("FieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = this.set("FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMappings: Self = this.set("FieldMappings", js.undefined)
  }
}
