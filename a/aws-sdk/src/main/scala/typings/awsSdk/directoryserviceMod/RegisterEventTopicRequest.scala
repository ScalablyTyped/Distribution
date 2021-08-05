package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterEventTopicRequest extends StObject {
  
  /**
    * The Directory ID that will publish status messages to the SNS topic.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The SNS topic name to which the directory will publish status messages. This SNS topic must be in the same region as the specified Directory ID.
    */
  var TopicName: typings.awsSdk.directoryserviceMod.TopicName
}
object RegisterEventTopicRequest {
  
  inline def apply(DirectoryId: DirectoryId, TopicName: TopicName): RegisterEventTopicRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterEventTopicRequest]
  }
  
  extension [Self <: RegisterEventTopicRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
  }
}
