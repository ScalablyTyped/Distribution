package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryConditions extends StObject
@JSImport("clearbladejs-node", "QueryConditions")
@js.native
object QueryConditions extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QueryConditions & String] = js.native
  
  @js.native
  sealed trait QUERY_EQUAL
    extends StObject
       with QueryConditions
  /* "EQ" */ val QUERY_EQUAL: typings.clearbladejsNode.mod.QueryConditions.QUERY_EQUAL & String = js.native
  
  @js.native
  sealed trait QUERY_GREATERTHAN
    extends StObject
       with QueryConditions
  /* "GT" */ val QUERY_GREATERTHAN: typings.clearbladejsNode.mod.QueryConditions.QUERY_GREATERTHAN & String = js.native
  
  @js.native
  sealed trait QUERY_GREATERTHAN_EQUAL
    extends StObject
       with QueryConditions
  /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: typings.clearbladejsNode.mod.QueryConditions.QUERY_GREATERTHAN_EQUAL & String = js.native
  
  @js.native
  sealed trait QUERY_LESSTHAN
    extends StObject
       with QueryConditions
  /* "LT" */ val QUERY_LESSTHAN: typings.clearbladejsNode.mod.QueryConditions.QUERY_LESSTHAN & String = js.native
  
  @js.native
  sealed trait QUERY_LESSTHAN_EQUAL
    extends StObject
       with QueryConditions
  /* "LTE" */ val QUERY_LESSTHAN_EQUAL: typings.clearbladejsNode.mod.QueryConditions.QUERY_LESSTHAN_EQUAL & String = js.native
  
  @js.native
  sealed trait QUERY_MATCHES
    extends StObject
       with QueryConditions
  /* "RE" */ val QUERY_MATCHES: typings.clearbladejsNode.mod.QueryConditions.QUERY_MATCHES & String = js.native
  
  @js.native
  sealed trait QUERY_NOTEQUAL
    extends StObject
       with QueryConditions
  /* "NEQ" */ val QUERY_NOTEQUAL: typings.clearbladejsNode.mod.QueryConditions.QUERY_NOTEQUAL & String = js.native
}
