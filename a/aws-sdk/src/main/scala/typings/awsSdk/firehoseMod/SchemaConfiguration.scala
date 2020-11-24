package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaConfiguration extends js.Object {
  
  /**
    * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  
  /**
    * Specifies the name of the AWS Glue database that contains the schema for the output data.
    */
  var DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  
  /**
    * If you don't specify an AWS Region, the default is the current Region.
    */
  var Region: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  
  /**
    * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
    */
  var TableName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
  
  /**
    * Specifies the table version for the output data schema. If you don't specify this version ID, or if you set it to LATEST, Kinesis Data Firehose uses the most recent version. This means that any updates to the table are automatically picked up.
    */
  var VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.native
}
object SchemaConfiguration {
  
  @scala.inline
  def apply(): SchemaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfiguration]
  }
  
  @scala.inline
  implicit class SchemaConfigurationOps[Self <: SchemaConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCatalogId(value: NonEmptyStringWithoutWhitespace): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NonEmptyStringWithoutWhitespace): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setRegion(value: NonEmptyStringWithoutWhitespace): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setRoleARN(value: NonEmptyStringWithoutWhitespace): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    
    @scala.inline
    def setTableName(value: NonEmptyStringWithoutWhitespace): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    
    @scala.inline
    def setVersionId(value: NonEmptyStringWithoutWhitespace): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}
