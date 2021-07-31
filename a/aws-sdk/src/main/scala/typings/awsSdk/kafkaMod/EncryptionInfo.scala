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
  
  @scala.inline
  def apply(): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInfo]
  }
  
  @scala.inline
  implicit class EncryptionInfoMutableBuilder[Self <: EncryptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionAtRest(value: EncryptionAtRest): Self = StObject.set(x, "EncryptionAtRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAtRestUndefined: Self = StObject.set(x, "EncryptionAtRest", js.undefined)
    
    @scala.inline
    def setEncryptionInTransit(value: EncryptionInTransit): Self = StObject.set(x, "EncryptionInTransit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionInTransitUndefined: Self = StObject.set(x, "EncryptionInTransit", js.undefined)
  }
}
