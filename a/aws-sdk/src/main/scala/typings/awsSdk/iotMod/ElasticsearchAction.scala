package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchAction extends js.Object {
  
  /**
    * The endpoint of your Elasticsearch domain.
    */
  var endpoint: ElasticsearchEndpoint = js.native
  
  /**
    * The unique identifier for the document you are storing.
    */
  var id: ElasticsearchId = js.native
  
  /**
    * The Elasticsearch index where you want to store your data.
    */
  var index: ElasticsearchIndex = js.native
  
  /**
    * The IAM role ARN that has access to Elasticsearch.
    */
  var roleArn: AwsArn = js.native
  
  /**
    * The type of document you are storing.
    */
  var `type`: ElasticsearchType = js.native
}
object ElasticsearchAction {
  
  @scala.inline
  def apply(
    endpoint: ElasticsearchEndpoint,
    id: ElasticsearchId,
    index: ElasticsearchIndex,
    roleArn: AwsArn,
    `type`: ElasticsearchType
  ): ElasticsearchAction = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchAction]
  }
  
  @scala.inline
  implicit class ElasticsearchActionOps[Self <: ElasticsearchAction] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: ElasticsearchEndpoint): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ElasticsearchId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: ElasticsearchIndex): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ElasticsearchType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
