package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resouce for which a tag list is requested. Must be the ARN of an Elastic Beanstalk resource.
    */
  var ResourceArn: typings.awsSdk.elasticbeanstalkMod.ResourceArn = js.native
}
object ListTagsForResourceMessage {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn): ListTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceMessage]
  }
  
  @scala.inline
  implicit class ListTagsForResourceMessageMutableBuilder[Self <: ListTagsForResourceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
