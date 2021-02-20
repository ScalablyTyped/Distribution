package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryConditions extends StObject
@JSImport("clearbladejs-node", "QueryConditions")
@js.native
object QueryConditions extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QueryConditions with String] = js.native
  
  @js.native
  sealed trait QUERY_EQUAL extends QueryConditions
  /* "EQ" */ val QUERY_EQUAL: typings.clearbladejsNode.mod.QueryConditions.QUERY_EQUAL with String = js.native
  
  @js.native
  sealed trait QUERY_GREATERTHAN extends QueryConditions
  /* "GT" */ val QUERY_GREATERTHAN: typings.clearbladejsNode.mod.QueryConditions.QUERY_GREATERTHAN with String = js.native
  
  @js.native
  sealed trait QUERY_GREATERTHAN_EQUAL extends QueryConditions
  /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: typings.clearbladejsNode.mod.QueryConditions.QUERY_GREATERTHAN_EQUAL with String = js.native
  
  @js.native
  sealed trait QUERY_LESSTHAN extends QueryConditions
  /* "LT" */ val QUERY_LESSTHAN: typings.clearbladejsNode.mod.QueryConditions.QUERY_LESSTHAN with String = js.native
  
  @js.native
  sealed trait QUERY_LESSTHAN_EQUAL extends QueryConditions
  /* "LTE" */ val QUERY_LESSTHAN_EQUAL: typings.clearbladejsNode.mod.QueryConditions.QUERY_LESSTHAN_EQUAL with String = js.native
  
  @js.native
  sealed trait QUERY_MATCHES extends QueryConditions
  /* "RE" */ val QUERY_MATCHES: typings.clearbladejsNode.mod.QueryConditions.QUERY_MATCHES with String = js.native
  
  @js.native
  sealed trait QUERY_NOTEQUAL extends QueryConditions
  /* "NEQ" */ val QUERY_NOTEQUAL: typings.clearbladejsNode.mod.QueryConditions.QUERY_NOTEQUAL with String = js.native
}
