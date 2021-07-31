package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRealtimeLogConfigRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the real-time log configuration to get.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the real-time log configuration to get.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object GetRealtimeLogConfigRequest {
  
  @scala.inline
  def apply(): GetRealtimeLogConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRealtimeLogConfigRequest]
  }
  
  @scala.inline
  implicit class GetRealtimeLogConfigRequestMutableBuilder[Self <: GetRealtimeLogConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
