package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchAction extends StObject {
  
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
  implicit class ElasticsearchActionMutableBuilder[Self <: ElasticsearchAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: ElasticsearchEndpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ElasticsearchId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: ElasticsearchIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ElasticsearchType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
