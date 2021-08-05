package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkCardInfo extends StObject {
  
  /**
    * The maximum number of network interfaces for the network card.
    */
  var MaximumNetworkInterfaces: js.UndefOr[MaxNetworkInterfaces] = js.undefined
  
  /**
    * The index of the network card.
    */
  var NetworkCardIndex: js.UndefOr[typings.awsSdk.ec2Mod.NetworkCardIndex] = js.undefined
  
  /**
    * The network performance of the network card.
    */
  var NetworkPerformance: js.UndefOr[typings.awsSdk.ec2Mod.NetworkPerformance] = js.undefined
}
object NetworkCardInfo {
  
  inline def apply(): NetworkCardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkCardInfo]
  }
  
  extension [Self <: NetworkCardInfo](x: Self) {
    
    inline def setMaximumNetworkInterfaces(value: MaxNetworkInterfaces): Self = StObject.set(x, "MaximumNetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setMaximumNetworkInterfacesUndefined: Self = StObject.set(x, "MaximumNetworkInterfaces", js.undefined)
    
    inline def setNetworkCardIndex(value: NetworkCardIndex): Self = StObject.set(x, "NetworkCardIndex", value.asInstanceOf[js.Any])
    
    inline def setNetworkCardIndexUndefined: Self = StObject.set(x, "NetworkCardIndex", js.undefined)
    
    inline def setNetworkPerformance(value: NetworkPerformance): Self = StObject.set(x, "NetworkPerformance", value.asInstanceOf[js.Any])
    
    inline def setNetworkPerformanceUndefined: Self = StObject.set(x, "NetworkPerformance", js.undefined)
  }
}
