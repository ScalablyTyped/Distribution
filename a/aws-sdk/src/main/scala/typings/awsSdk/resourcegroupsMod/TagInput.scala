package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagInput extends StObject {
  
  /**
    * The ARN of the resource group to which to add tags.
    */
  var Arn: GroupArn = js.native
  
  /**
    * The tags to add to the specified resource group. A tag is a string-to-string map of key-value pairs.
    */
  var Tags: typings.awsSdk.resourcegroupsMod.Tags = js.native
}
object TagInput {
  
  @scala.inline
  def apply(Arn: GroupArn, Tags: Tags): TagInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagInput]
  }
  
  @scala.inline
  implicit class TagInputMutableBuilder[Self <: TagInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
