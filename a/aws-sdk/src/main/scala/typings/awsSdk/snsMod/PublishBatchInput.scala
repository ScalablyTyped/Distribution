package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishBatchInput extends StObject {
  
  /**
    * A list of PublishBatch request entries to be sent to the SNS topic.
    */
  var PublishBatchRequestEntries: PublishBatchRequestEntryList
  
  /**
    * The Amazon resource name (ARN) of the topic you want to batch publish to.
    */
  var TopicArn: topicARN
}
object PublishBatchInput {
  
  inline def apply(PublishBatchRequestEntries: PublishBatchRequestEntryList, TopicArn: topicARN): PublishBatchInput = {
    val __obj = js.Dynamic.literal(PublishBatchRequestEntries = PublishBatchRequestEntries.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishBatchInput]
  }
  
  extension [Self <: PublishBatchInput](x: Self) {
    
    inline def setPublishBatchRequestEntries(value: PublishBatchRequestEntryList): Self = StObject.set(x, "PublishBatchRequestEntries", value.asInstanceOf[js.Any])
    
    inline def setPublishBatchRequestEntriesVarargs(value: PublishBatchRequestEntry*): Self = StObject.set(x, "PublishBatchRequestEntries", js.Array(value*))
    
    inline def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
