package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectivityInfo extends StObject {
  
  /**
    * 
    Public access control for brokers.
    
    */
  var PublicAccess: js.UndefOr[typings.awsSdk.kafkaMod.PublicAccess] = js.undefined
}
object ConnectivityInfo {
  
  inline def apply(): ConnectivityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectivityInfo]
  }
  
  extension [Self <: ConnectivityInfo](x: Self) {
    
    inline def setPublicAccess(value: PublicAccess): Self = StObject.set(x, "PublicAccess", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessUndefined: Self = StObject.set(x, "PublicAccess", js.undefined)
  }
}
