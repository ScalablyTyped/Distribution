package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSqlInjectionMatchSetResponse extends StObject {
  
  /**
    * Information about the SqlInjectionMatchSet that you specified in the GetSqlInjectionMatchSet request. For more information, see the following topics:    SqlInjectionMatchSet: Contains Name, SqlInjectionMatchSetId, and an array of SqlInjectionMatchTuple objects    SqlInjectionMatchTuple: Each SqlInjectionMatchTuple object contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var SqlInjectionMatchSet: js.UndefOr[typings.awsSdk.wafregionalMod.SqlInjectionMatchSet] = js.native
}
object GetSqlInjectionMatchSetResponse {
  
  @scala.inline
  def apply(): GetSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSqlInjectionMatchSetResponse]
  }
  
  @scala.inline
  implicit class GetSqlInjectionMatchSetResponseMutableBuilder[Self <: GetSqlInjectionMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSqlInjectionMatchSet(value: SqlInjectionMatchSet): Self = StObject.set(x, "SqlInjectionMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlInjectionMatchSetUndefined: Self = StObject.set(x, "SqlInjectionMatchSet", js.undefined)
  }
}
