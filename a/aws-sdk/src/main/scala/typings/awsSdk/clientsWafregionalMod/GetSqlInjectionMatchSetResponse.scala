package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSqlInjectionMatchSetResponse extends StObject {
  
  /**
    * Information about the SqlInjectionMatchSet that you specified in the GetSqlInjectionMatchSet request. For more information, see the following topics:    SqlInjectionMatchSet: Contains Name, SqlInjectionMatchSetId, and an array of SqlInjectionMatchTuple objects    SqlInjectionMatchTuple: Each SqlInjectionMatchTuple object contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var SqlInjectionMatchSet: js.UndefOr[typings.awsSdk.clientsWafregionalMod.SqlInjectionMatchSet] = js.undefined
}
object GetSqlInjectionMatchSetResponse {
  
  inline def apply(): GetSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSqlInjectionMatchSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSqlInjectionMatchSetResponse] (val x: Self) extends AnyVal {
    
    inline def setSqlInjectionMatchSet(value: SqlInjectionMatchSet): Self = StObject.set(x, "SqlInjectionMatchSet", value.asInstanceOf[js.Any])
    
    inline def setSqlInjectionMatchSetUndefined: Self = StObject.set(x, "SqlInjectionMatchSet", js.undefined)
  }
}
