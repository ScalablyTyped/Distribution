package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLPartialFailureReason extends StObject {
  
  /**
    * The message containing the reason for a partial failure of an AutoML job.
    */
  var PartialFailureMessage: js.UndefOr[AutoMLFailureReason] = js.undefined
}
object AutoMLPartialFailureReason {
  
  inline def apply(): AutoMLPartialFailureReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLPartialFailureReason]
  }
  
  extension [Self <: AutoMLPartialFailureReason](x: Self) {
    
    inline def setPartialFailureMessage(value: AutoMLFailureReason): Self = StObject.set(x, "PartialFailureMessage", value.asInstanceOf[js.Any])
    
    inline def setPartialFailureMessageUndefined: Self = StObject.set(x, "PartialFailureMessage", js.undefined)
  }
}
