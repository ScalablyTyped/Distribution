package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalSecondaryIndexAction extends js.Object {
  /**
    * The name of the global secondary index to be created.
    */
  var IndexName: typings.awsSdk.dynamodbMod.IndexName = js.native
  /**
    * The key schema for the global secondary index.
    */
  var KeySchema: typings.awsSdk.dynamodbMod.KeySchema = js.native
  /**
    * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var Projection: typings.awsSdk.dynamodbMod.Projection = js.native
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.dynamodbMod.ProvisionedThroughput] = js.native
}

object CreateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): CreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
  }
  @scala.inline
  implicit class CreateGlobalSecondaryIndexActionOps[Self <: CreateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
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
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    @scala.inline
    def setKeySchema(value: KeySchema): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: Projection): Self = this.set("Projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedThroughput: Self = this.set("ProvisionedThroughput", js.undefined)
  }
  
}

