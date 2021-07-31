package typings.awsSdk.wafregionalMod

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
  
  @scala.inline
  def apply(SqlInjectionMatchSetId: ResourceId): GetSqlInjectionMatchSetRequest = {
    val __obj = js.Dynamic.literal(SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSqlInjectionMatchSetRequest]
  }
  
  @scala.inline
  implicit class GetSqlInjectionMatchSetRequestMutableBuilder[Self <: GetSqlInjectionMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSqlInjectionMatchSetId(value: ResourceId): Self = StObject.set(x, "SqlInjectionMatchSetId", value.asInstanceOf[js.Any])
  }
}
