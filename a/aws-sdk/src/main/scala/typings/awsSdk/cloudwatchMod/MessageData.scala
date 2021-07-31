package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageData extends StObject {
  
  /**
    * The error code or status code associated with the message.
    */
  var Code: js.UndefOr[MessageDataCode] = js.undefined
  
  /**
    * The message text.
    */
  var Value: js.UndefOr[MessageDataValue] = js.undefined
}
object MessageData {
  
  @scala.inline
  def apply(): MessageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageData]
  }
  
  @scala.inline
  implicit class MessageDataMutableBuilder[Self <: MessageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: MessageDataCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setValue(value: MessageDataValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
