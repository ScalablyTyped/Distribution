package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SalesforceCustomKnowledgeArticleTypeConfiguration extends js.Object {
  /**
    * The name of the field in the custom knowledge article that contains the document data to index.
    */
  var DocumentDataFieldName: DataSourceFieldName = js.native
  /**
    * The name of the field in the custom knowledge article that contains the document title.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  /**
    * One or more objects that map fields in the custom knowledge article to fields in the Amazon Kendra index.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  /**
    * The name of the configuration.
    */
  var Name: SalesforceCustomKnowledgeArticleTypeName = js.native
}

object SalesforceCustomKnowledgeArticleTypeConfiguration {
  @scala.inline
  def apply(DocumentDataFieldName: DataSourceFieldName, Name: SalesforceCustomKnowledgeArticleTypeName): SalesforceCustomKnowledgeArticleTypeConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceCustomKnowledgeArticleTypeConfiguration]
  }
  @scala.inline
  implicit class SalesforceCustomKnowledgeArticleTypeConfigurationOps[Self <: SalesforceCustomKnowledgeArticleTypeConfiguration] (val x: Self) extends AnyVal {
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
    def setName(value: SalesforceCustomKnowledgeArticleTypeName): Self = this.set("Name", value.asInstanceOf[js.Any])
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

