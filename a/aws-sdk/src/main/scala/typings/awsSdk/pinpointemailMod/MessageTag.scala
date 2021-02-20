package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageTag extends StObject {
  
  /**
    * The name of the message tag. The message tag name has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var Name: MessageTagName = js.native
  
  /**
    * The value of the message tag. The message tag value has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var Value: MessageTagValue = js.native
}
object MessageTag {
  
  @scala.inline
  def apply(Name: MessageTagName, Value: MessageTagValue): MessageTag = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTag]
  }
  
  @scala.inline
  implicit class MessageTagMutableBuilder[Self <: MessageTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MessageTagName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: MessageTagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
