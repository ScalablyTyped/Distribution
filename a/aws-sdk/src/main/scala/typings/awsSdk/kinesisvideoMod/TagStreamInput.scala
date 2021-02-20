package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagStreamInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  
  /**
    * The name of the stream that you want to add the tag or tags to.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.native
  
  /**
    * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
    */
  var Tags: ResourceTags = js.native
}
object TagStreamInput {
  
  @scala.inline
  def apply(Tags: ResourceTags): TagStreamInput = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagStreamInput]
  }
  
  @scala.inline
  implicit class TagStreamInputMutableBuilder[Self <: TagStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    @scala.inline
    def setTags(value: ResourceTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
