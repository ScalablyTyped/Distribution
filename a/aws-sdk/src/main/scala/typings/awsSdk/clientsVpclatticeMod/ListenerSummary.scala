package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var arn: js.UndefOr[ListenerArn] = js.undefined
  
  /**
    * The date and time that the listener was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the listener.
    */
  var id: js.UndefOr[ListenerId] = js.undefined
  
  /**
    * The date and time that the listener was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the listener.
    */
  var name: js.UndefOr[ListenerName] = js.undefined
  
  /**
    * The listener port.
    */
  var port: js.UndefOr[Port] = js.undefined
  
  /**
    * The listener protocol.
    */
  var protocol: js.UndefOr[ListenerProtocol] = js.undefined
}
object ListenerSummary {
  
  inline def apply(): ListenerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListenerSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ListenerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: ListenerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: ListenerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: ListenerProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
