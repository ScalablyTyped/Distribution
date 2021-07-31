package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSqlInjectionMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.undefined
  
  /**
    * A SqlInjectionMatchSet.
    */
  var SqlInjectionMatchSet: js.UndefOr[typings.awsSdk.wafMod.SqlInjectionMatchSet] = js.undefined
}
object CreateSqlInjectionMatchSetResponse {
  
  @scala.inline
  def apply(): CreateSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSqlInjectionMatchSetResponse]
  }
  
  @scala.inline
  implicit class CreateSqlInjectionMatchSetResponseMutableBuilder[Self <: CreateSqlInjectionMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setSqlInjectionMatchSet(value: SqlInjectionMatchSet): Self = StObject.set(x, "SqlInjectionMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlInjectionMatchSetUndefined: Self = StObject.set(x, "SqlInjectionMatchSet", js.undefined)
  }
}
