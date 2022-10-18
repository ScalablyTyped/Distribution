package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlInjectionMatchSet extends StObject {
  
  /**
    * The name, if any, of the SqlInjectionMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A unique identifier for a SqlInjectionMatchSet. You use SqlInjectionMatchSetId to get information about a SqlInjectionMatchSet (see GetSqlInjectionMatchSet), update a SqlInjectionMatchSet (see UpdateSqlInjectionMatchSet), insert a SqlInjectionMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SqlInjectionMatchSet from AWS WAF (see DeleteSqlInjectionMatchSet).  SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId
  
  /**
    * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
    */
  var SqlInjectionMatchTuples: typings.awsSdk.clientsWafregionalMod.SqlInjectionMatchTuples
}
object SqlInjectionMatchSet {
  
  inline def apply(SqlInjectionMatchSetId: ResourceId, SqlInjectionMatchTuples: SqlInjectionMatchTuples): SqlInjectionMatchSet = {
    val __obj = js.Dynamic.literal(SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any], SqlInjectionMatchTuples = SqlInjectionMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSet]
  }
  
  extension [Self <: SqlInjectionMatchSet](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSqlInjectionMatchSetId(value: ResourceId): Self = StObject.set(x, "SqlInjectionMatchSetId", value.asInstanceOf[js.Any])
    
    inline def setSqlInjectionMatchTuples(value: SqlInjectionMatchTuples): Self = StObject.set(x, "SqlInjectionMatchTuples", value.asInstanceOf[js.Any])
    
    inline def setSqlInjectionMatchTuplesVarargs(value: SqlInjectionMatchTuple*): Self = StObject.set(x, "SqlInjectionMatchTuples", js.Array(value*))
  }
}
