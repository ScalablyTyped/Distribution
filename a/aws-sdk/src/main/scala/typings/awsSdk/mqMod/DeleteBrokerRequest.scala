package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBrokerRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: string
}
object DeleteBrokerRequest {
  
  @scala.inline
  def apply(BrokerId: string): DeleteBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBrokerRequest]
  }
  
  @scala.inline
  implicit class DeleteBrokerRequestMutableBuilder[Self <: DeleteBrokerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
  }
}
