package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventTopicsRequest extends StObject {
  
  /**
    * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all Directory IDs are returned.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the specified Directory ID are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var TopicNames: js.UndefOr[typings.awsSdk.directoryserviceMod.TopicNames] = js.undefined
}
object DescribeEventTopicsRequest {
  
  @scala.inline
  def apply(): DescribeEventTopicsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTopicsRequest]
  }
  
  @scala.inline
  implicit class DescribeEventTopicsRequestMutableBuilder[Self <: DescribeEventTopicsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setTopicNames(value: TopicNames): Self = StObject.set(x, "TopicNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNamesUndefined: Self = StObject.set(x, "TopicNames", js.undefined)
    
    @scala.inline
    def setTopicNamesVarargs(value: TopicName*): Self = StObject.set(x, "TopicNames", js.Array(value :_*))
  }
}
