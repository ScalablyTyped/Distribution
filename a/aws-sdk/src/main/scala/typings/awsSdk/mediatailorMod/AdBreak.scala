package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdBreak extends StObject {
  
  /**
    * The SCTE-35 ad insertion type. Accepted value: SPLICE_INSERT.
    */
  var MessageType: js.UndefOr[typings.awsSdk.mediatailorMod.MessageType] = js.undefined
  
  /**
    * How long (in milliseconds) after the beginning of the program that an ad starts. This value must fall within 100ms of a segment boundary, otherwise the ad break will be skipped.
    */
  var OffsetMillis: js.UndefOr[long] = js.undefined
  
  /**
    * Ad break slate configuration.
    */
  var Slate: js.UndefOr[SlateSource] = js.undefined
  
  /**
    * This defines the SCTE-35 splice_insert() message inserted around the ad. For information about using splice_insert(), see the SCTE-35 specficiaiton, section 9.7.3.1.
    */
  var SpliceInsertMessage: js.UndefOr[typings.awsSdk.mediatailorMod.SpliceInsertMessage] = js.undefined
}
object AdBreak {
  
  inline def apply(): AdBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdBreak]
  }
  
  extension [Self <: AdBreak](x: Self) {
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setOffsetMillis(value: long): Self = StObject.set(x, "OffsetMillis", value.asInstanceOf[js.Any])
    
    inline def setOffsetMillisUndefined: Self = StObject.set(x, "OffsetMillis", js.undefined)
    
    inline def setSlate(value: SlateSource): Self = StObject.set(x, "Slate", value.asInstanceOf[js.Any])
    
    inline def setSlateUndefined: Self = StObject.set(x, "Slate", js.undefined)
    
    inline def setSpliceInsertMessage(value: SpliceInsertMessage): Self = StObject.set(x, "SpliceInsertMessage", value.asInstanceOf[js.Any])
    
    inline def setSpliceInsertMessageUndefined: Self = StObject.set(x, "SpliceInsertMessage", js.undefined)
  }
}
