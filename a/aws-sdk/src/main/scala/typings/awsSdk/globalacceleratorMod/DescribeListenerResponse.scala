package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeListenerResponse extends StObject {
  
  /**
    * The description of a listener.
    */
  var Listener: js.UndefOr[typings.awsSdk.globalacceleratorMod.Listener] = js.undefined
}
object DescribeListenerResponse {
  
  inline def apply(): DescribeListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeListenerResponse]
  }
  
  extension [Self <: DescribeListenerResponse](x: Self) {
    
    inline def setListener(value: Listener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
  }
}
