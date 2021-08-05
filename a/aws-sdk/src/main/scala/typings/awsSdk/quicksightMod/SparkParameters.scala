package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkParameters extends StObject {
  
  /**
    * Host.
    */
  var Host: typings.awsSdk.quicksightMod.Host
  
  /**
    * Port.
    */
  var Port: typings.awsSdk.quicksightMod.Port
}
object SparkParameters {
  
  inline def apply(Host: Host, Port: Port): SparkParameters = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkParameters]
  }
  
  extension [Self <: SparkParameters](x: Self) {
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
