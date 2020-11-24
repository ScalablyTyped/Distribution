package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableLocalSecondaryIndex extends js.Object {
  
  /**
    * The ARN of the index.
    */
  var IndexArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the index.
    */
  var IndexName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The complete key schema for the index.
    */
  var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.native
  
  /**
    * Attributes that are copied from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var Projection: js.UndefOr[AwsDynamoDbTableProjection] = js.native
}
object AwsDynamoDbTableLocalSecondaryIndex {
  
  @scala.inline
  def apply(): AwsDynamoDbTableLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableLocalSecondaryIndex]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableLocalSecondaryIndexOps[Self <: AwsDynamoDbTableLocalSecondaryIndex] (val x: Self) extends AnyVal {
    
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
    def setIndexArn(value: NonEmptyString): Self = this.set("IndexArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexArn: Self = this.set("IndexArn", js.undefined)
    
    @scala.inline
    def setIndexName(value: NonEmptyString): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    
    @scala.inline
    def setKeySchemaVarargs(value: AwsDynamoDbTableKeySchema*): Self = this.set("KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setKeySchema(value: AwsDynamoDbTableKeySchemaList): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySchema: Self = this.set("KeySchema", js.undefined)
    
    @scala.inline
    def setProjection(value: AwsDynamoDbTableProjection): Self = this.set("Projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("Projection", js.undefined)
  }
}
