package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTagsDescriptionMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource for which a tag list was requested.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ResourceArn] = js.native
  
  /**
    * A list of tag key-value pairs.
    */
  var ResourceTags: js.UndefOr[TagList] = js.native
}
object ResourceTagsDescriptionMessage {
  
  @scala.inline
  def apply(): ResourceTagsDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTagsDescriptionMessage]
  }
  
  @scala.inline
  implicit class ResourceTagsDescriptionMessageMutableBuilder[Self <: ResourceTagsDescriptionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceTags(value: TagList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    @scala.inline
    def setResourceTagsVarargs(value: Tag*): Self = StObject.set(x, "ResourceTags", js.Array(value :_*))
  }
}
