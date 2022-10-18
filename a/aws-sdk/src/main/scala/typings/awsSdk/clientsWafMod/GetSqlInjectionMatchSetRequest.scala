package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSqlInjectionMatchSetRequest extends StObject {
  
  /**
    * The SqlInjectionMatchSetId of the SqlInjectionMatchSet that you want to get. SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId
}
object GetSqlInjectionMatchSetRequest {
  
  inline def apply(SqlInjectionMatchSetId: ResourceId): GetSqlInjectionMatchSetRequest = {
    val __obj = js.Dynamic.literal(SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSqlInjectionMatchSetRequest]
  }
  
  extension [Self <: GetSqlInjectionMatchSetRequest](x: Self) {
    
    inline def setSqlInjectionMatchSetId(value: ResourceId): Self = StObject.set(x, "SqlInjectionMatchSetId", value.asInstanceOf[js.Any])
  }
}
