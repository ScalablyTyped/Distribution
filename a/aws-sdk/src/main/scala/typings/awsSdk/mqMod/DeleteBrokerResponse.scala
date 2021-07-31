package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBrokerResponse extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.undefined
}
object DeleteBrokerResponse {
  
  @scala.inline
  def apply(): DeleteBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBrokerResponse]
  }
  
  @scala.inline
  implicit class DeleteBrokerResponseMutableBuilder[Self <: DeleteBrokerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
  }
}
