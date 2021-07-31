package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTopic extends StObject {
  
  /**
    * The date and time of when you associated your directory with the SNS topic.
    */
  var CreatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.CreatedDateTime] = js.undefined
  
  /**
    * The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The topic registration status.
    */
  var Status: js.UndefOr[TopicStatus] = js.undefined
  
  /**
    * The SNS topic ARN (Amazon Resource Name).
    */
  var TopicArn: js.UndefOr[typings.awsSdk.directoryserviceMod.TopicArn] = js.undefined
  
  /**
    * The name of an AWS SNS topic the receives status messages from the directory.
    */
  var TopicName: js.UndefOr[typings.awsSdk.directoryserviceMod.TopicName] = js.undefined
}
object EventTopic {
  
  @scala.inline
  def apply(): EventTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTopic]
  }
  
  @scala.inline
  implicit class EventTopicMutableBuilder[Self <: EventTopic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDateTime(value: CreatedDateTime): Self = StObject.set(x, "CreatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "CreatedDateTime", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setStatus(value: TopicStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTopicArn(value: TopicArn): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
    
    @scala.inline
    def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "TopicName", js.undefined)
  }
}
