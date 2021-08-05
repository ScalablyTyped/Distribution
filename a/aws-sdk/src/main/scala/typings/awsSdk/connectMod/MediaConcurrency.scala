package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConcurrency extends StObject {
  
  /**
    * The channels that agents can handle in the Contact Control Panel (CCP).
    */
  var Channel: typings.awsSdk.connectMod.Channel
  
  /**
    * The number of contacts an agent can have on a channel simultaneously.
    */
  var Concurrency: typings.awsSdk.connectMod.Concurrency
}
object MediaConcurrency {
  
  inline def apply(Channel: Channel, Concurrency: Concurrency): MediaConcurrency = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], Concurrency = Concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConcurrency]
  }
  
  extension [Self <: MediaConcurrency](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setConcurrency(value: Concurrency): Self = StObject.set(x, "Concurrency", value.asInstanceOf[js.Any])
  }
}
