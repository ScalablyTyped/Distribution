package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTagsMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example, arn:aws:redshift:us-east-2:123456789:cluster:t1. 
    */
  var ResourceName: String
  
  /**
    * One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the parameter Key and the corresponding value is passed in with the parameter Value. The Key and Value parameters are separated by a comma (,). Separate multiple tags with a space. For example, --tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0". 
    */
  var Tags: TagList
}
object CreateTagsMessage {
  
  @scala.inline
  def apply(ResourceName: String, Tags: TagList): CreateTagsMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsMessage]
  }
  
  @scala.inline
  implicit class CreateTagsMessageMutableBuilder[Self <: CreateTagsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
