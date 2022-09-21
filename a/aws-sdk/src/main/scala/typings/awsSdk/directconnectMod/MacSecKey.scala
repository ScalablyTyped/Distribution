package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacSecKey extends StObject {
  
  /**
    * The Connection Key Name (CKN) for the MAC Security secret key.
    */
  var ckn: js.UndefOr[Ckn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
    */
  var secretARN: js.UndefOr[SecretARN] = js.undefined
  
  /**
    * The date that the MAC Security (MACsec) secret key takes effect. The value is displayed in UTC format.
    */
  var startOn: js.UndefOr[StartOnDate] = js.undefined
  
  /**
    * The state of the MAC Security (MACsec) secret key. The possible values are:    associating: The MAC Security (MACsec) secret key is being validated and not yet associated with the connection or LAG.    associated: The MAC Security (MACsec) secret key is validated and associated with the connection or LAG.    disassociating: The MAC Security (MACsec) secret key is being disassociated from the connection or LAG    disassociated: The MAC Security (MACsec) secret key is no longer associated with the connection or LAG.  
    */
  var state: js.UndefOr[State] = js.undefined
}
object MacSecKey {
  
  inline def apply(): MacSecKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacSecKey]
  }
  
  extension [Self <: MacSecKey](x: Self) {
    
    inline def setCkn(value: Ckn): Self = StObject.set(x, "ckn", value.asInstanceOf[js.Any])
    
    inline def setCknUndefined: Self = StObject.set(x, "ckn", js.undefined)
    
    inline def setSecretARN(value: SecretARN): Self = StObject.set(x, "secretARN", value.asInstanceOf[js.Any])
    
    inline def setSecretARNUndefined: Self = StObject.set(x, "secretARN", js.undefined)
    
    inline def setStartOn(value: StartOnDate): Self = StObject.set(x, "startOn", value.asInstanceOf[js.Any])
    
    inline def setStartOnUndefined: Self = StObject.set(x, "startOn", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
