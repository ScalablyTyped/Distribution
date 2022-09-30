package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DTMFSpecification extends StObject {
  
  /**
    * The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
    */
  var deletionCharacter: DTMFCharacter
  
  /**
    * The DTMF character that immediately ends input. If the user does not press this character, the input ends after the end timeout.
    */
  var endCharacter: DTMFCharacter
  
  /**
    * How long the bot should wait after the last DTMF character input before assuming that the input has concluded.
    */
  var endTimeoutMs: TimeInMilliSeconds
  
  /**
    * The maximum number of DTMF digits allowed in an utterance.
    */
  var maxLength: MaxUtteranceDigits
}
object DTMFSpecification {
  
  inline def apply(
    deletionCharacter: DTMFCharacter,
    endCharacter: DTMFCharacter,
    endTimeoutMs: TimeInMilliSeconds,
    maxLength: MaxUtteranceDigits
  ): DTMFSpecification = {
    val __obj = js.Dynamic.literal(deletionCharacter = deletionCharacter.asInstanceOf[js.Any], endCharacter = endCharacter.asInstanceOf[js.Any], endTimeoutMs = endTimeoutMs.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[DTMFSpecification]
  }
  
  extension [Self <: DTMFSpecification](x: Self) {
    
    inline def setDeletionCharacter(value: DTMFCharacter): Self = StObject.set(x, "deletionCharacter", value.asInstanceOf[js.Any])
    
    inline def setEndCharacter(value: DTMFCharacter): Self = StObject.set(x, "endCharacter", value.asInstanceOf[js.Any])
    
    inline def setEndTimeoutMs(value: TimeInMilliSeconds): Self = StObject.set(x, "endTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: MaxUtteranceDigits): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
  }
}
