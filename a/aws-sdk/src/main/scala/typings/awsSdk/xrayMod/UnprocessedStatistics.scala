package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedStatistics extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.undefined
}
object UnprocessedStatistics {
  
  @scala.inline
  def apply(): UnprocessedStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedStatistics]
  }
  
  @scala.inline
  implicit class UnprocessedStatisticsMutableBuilder[Self <: UnprocessedStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
  }
}
