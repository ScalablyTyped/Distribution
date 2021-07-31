package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBrokerResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.undefined
}
object CreateBrokerResponse {
  
  @scala.inline
  def apply(): CreateBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBrokerResponse]
  }
  
  @scala.inline
  implicit class CreateBrokerResponseMutableBuilder[Self <: CreateBrokerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerArn(value: string): Self = StObject.set(x, "BrokerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerArnUndefined: Self = StObject.set(x, "BrokerArn", js.undefined)
    
    @scala.inline
    def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
  }
}
