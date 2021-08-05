package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionInfo extends StObject {
  
  /**
    * 
    The data-volume encryption details.
    
    */
  var EncryptionAtRest: js.UndefOr[typings.awsSdk.kafkaMod.EncryptionAtRest] = js.undefined
  
  /**
    * 
    The details for encryption in transit.
    
    */
  var EncryptionInTransit: js.UndefOr[typings.awsSdk.kafkaMod.EncryptionInTransit] = js.undefined
}
object EncryptionInfo {
  
  inline def apply(): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInfo]
  }
  
  extension [Self <: EncryptionInfo](x: Self) {
    
    inline def setEncryptionAtRest(value: EncryptionAtRest): Self = StObject.set(x, "EncryptionAtRest", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestUndefined: Self = StObject.set(x, "EncryptionAtRest", js.undefined)
    
    inline def setEncryptionInTransit(value: EncryptionInTransit): Self = StObject.set(x, "EncryptionInTransit", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInTransitUndefined: Self = StObject.set(x, "EncryptionInTransit", js.undefined)
  }
}
