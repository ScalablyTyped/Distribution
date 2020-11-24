package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySchemaVersionMetadataInput extends js.Object {
  
  /**
    * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
    */
  var MaxResults: js.UndefOr[QuerySchemaVersionMetadataMaxResults] = js.native
  
  /**
    * Search key-value pairs for metadata, if they are not provided all the metadata information will be fetched.
    */
  var MetadataList: js.UndefOr[typings.awsSdk.glueMod.MetadataList] = js.native
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.native
  
  /**
    * A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
    */
  var SchemaId: js.UndefOr[typings.awsSdk.glueMod.SchemaId] = js.native
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.native
  
  /**
    * The version number of the schema.
    */
  var SchemaVersionNumber: js.UndefOr[typings.awsSdk.glueMod.SchemaVersionNumber] = js.native
}
object QuerySchemaVersionMetadataInput {
  
  @scala.inline
  def apply(): QuerySchemaVersionMetadataInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySchemaVersionMetadataInput]
  }
  
  @scala.inline
  implicit class QuerySchemaVersionMetadataInputOps[Self <: QuerySchemaVersionMetadataInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxResults(value: QuerySchemaVersionMetadataMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setMetadataListVarargs(value: MetadataKeyValuePair*): Self = this.set("MetadataList", js.Array(value :_*))
    
    @scala.inline
    def setMetadataList(value: MetadataList): Self = this.set("MetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataList: Self = this.set("MetadataList", js.undefined)
    
    @scala.inline
    def setNextToken(value: SchemaRegistryTokenString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = this.set("SchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaId: Self = this.set("SchemaId", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = this.set("SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionId: Self = this.set("SchemaVersionId", js.undefined)
    
    @scala.inline
    def setSchemaVersionNumber(value: SchemaVersionNumber): Self = this.set("SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionNumber: Self = this.set("SchemaVersionNumber", js.undefined)
  }
}
