package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourcesInput extends StObject {
  
  /**
    * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var ResourceARNList: typings.awsSdk.resourcegroupstaggingapiMod.ResourceARNList = js.native
  
  /**
    * The tags that you want to add to the specified resources. A tag consists of a key and a value that you define.
    */
  var Tags: TagMap = js.native
}
object TagResourcesInput {
  
  @scala.inline
  def apply(ResourceARNList: ResourceARNList, Tags: TagMap): TagResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceARNList = ResourceARNList.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourcesInput]
  }
  
  @scala.inline
  implicit class TagResourcesInputMutableBuilder[Self <: TagResourcesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARNList(value: ResourceARNList): Self = StObject.set(x, "ResourceARNList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceARNList", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
