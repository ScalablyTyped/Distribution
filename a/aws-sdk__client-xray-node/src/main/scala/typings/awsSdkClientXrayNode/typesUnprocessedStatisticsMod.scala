package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnprocessedStatisticsMod {
  
  type UnmarshalledUnprocessedStatistics = UnprocessedStatistics
  
  trait UnprocessedStatistics extends StObject {
    
    /**
      * <p>The error code.</p>
      */
    var ErrorCode: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The error message.</p>
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the sampling rule.</p>
      */
    var RuleName: js.UndefOr[String] = js.undefined
  }
  object UnprocessedStatistics {
    
    inline def apply(): UnprocessedStatistics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnprocessedStatistics]
    }
    
    extension [Self <: UnprocessedStatistics](x: Self) {
      
      inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      inline def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
    }
  }
}
