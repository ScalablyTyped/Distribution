package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlInjectionMatchSetSummary extends StObject {
  
  /**
    * The name of the SqlInjectionMatchSet, if any, specified by Id.
    */
  var Name: ResourceName
  
  /**
    * A unique identifier for a SqlInjectionMatchSet. You use SqlInjectionMatchSetId to get information about a SqlInjectionMatchSet (see GetSqlInjectionMatchSet), update a SqlInjectionMatchSet (see UpdateSqlInjectionMatchSet), insert a SqlInjectionMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SqlInjectionMatchSet from AWS WAF (see DeleteSqlInjectionMatchSet).  SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId
}
object SqlInjectionMatchSetSummary {
  
  inline def apply(Name: ResourceName, SqlInjectionMatchSetId: ResourceId): SqlInjectionMatchSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetSummary]
  }
  
  extension [Self <: SqlInjectionMatchSetSummary](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSqlInjectionMatchSetId(value: ResourceId): Self = StObject.set(x, "SqlInjectionMatchSetId", value.asInstanceOf[js.Any])
  }
}
