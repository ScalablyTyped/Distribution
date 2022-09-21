package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkUpdateAccount extends StObject {
  
  /**
    * The new Sidewalk application server private key.
    */
  var AppServerPrivateKey: js.UndefOr[typings.awsSdk.iotwirelessMod.AppServerPrivateKey] = js.undefined
}
object SidewalkUpdateAccount {
  
  inline def apply(): SidewalkUpdateAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkUpdateAccount]
  }
  
  extension [Self <: SidewalkUpdateAccount](x: Self) {
    
    inline def setAppServerPrivateKey(value: AppServerPrivateKey): Self = StObject.set(x, "AppServerPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setAppServerPrivateKeyUndefined: Self = StObject.set(x, "AppServerPrivateKey", js.undefined)
  }
}
