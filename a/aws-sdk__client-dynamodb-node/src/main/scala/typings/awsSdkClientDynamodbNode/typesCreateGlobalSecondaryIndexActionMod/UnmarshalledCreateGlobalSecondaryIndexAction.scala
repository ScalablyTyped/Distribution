package typings.awsSdkClientDynamodbNode.typesCreateGlobalSecondaryIndexActionMod

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProjectionMod.UnmarshalledProjection
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledCreateGlobalSecondaryIndexAction extends CreateGlobalSecondaryIndexAction {
  
  /**
    * <p>The key schema for the global secondary index.</p>
    */
  @JSName("KeySchema")
  var KeySchema_UnmarshalledCreateGlobalSecondaryIndexAction: js.Array[UnmarshalledKeySchemaElement] = js.native
  
  /**
    * <p>Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.</p>
    */
  @JSName("Projection")
  var Projection_UnmarshalledCreateGlobalSecondaryIndexAction: UnmarshalledProjection = js.native
  
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ProvisionedThroughput")
  var ProvisionedThroughput_UnmarshalledCreateGlobalSecondaryIndexAction: UnmarshalledProvisionedThroughput = js.native
}
object UnmarshalledCreateGlobalSecondaryIndexAction {
  
  @scala.inline
  def apply(
    IndexName: String,
    KeySchema: js.Array[UnmarshalledKeySchemaElement],
    Projection: UnmarshalledProjection,
    ProvisionedThroughput: UnmarshalledProvisionedThroughput
  ): UnmarshalledCreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCreateGlobalSecondaryIndexAction]
  }
  
  @scala.inline
  implicit class UnmarshalledCreateGlobalSecondaryIndexActionOps[Self <: UnmarshalledCreateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
    
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
    def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = this.set("KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjection(value: UnmarshalledProjection): Self = this.set("Projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
  }
}
