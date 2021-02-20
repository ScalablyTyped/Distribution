package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardValidationMessage extends StObject {
  
  /**
    * The data path related to the message.
    */
  var DataPath: js.UndefOr[typings.awsSdk.cloudwatchMod.DataPath] = js.native
  
  /**
    * A message describing the error or warning.
    */
  var Message: js.UndefOr[typings.awsSdk.cloudwatchMod.Message] = js.native
}
object DashboardValidationMessage {
  
  @scala.inline
  def apply(): DashboardValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardValidationMessage]
  }
  
  @scala.inline
  implicit class DashboardValidationMessageMutableBuilder[Self <: DashboardValidationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataPath(value: DataPath): Self = StObject.set(x, "DataPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPathUndefined: Self = StObject.set(x, "DataPath", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
