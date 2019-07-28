package typings.clearbladejsDashServer.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryConditions extends js.Object

@JSGlobal("CbServer.QueryConditions")
@js.native
object QueryConditions extends js.Object {
  @js.native
  sealed trait QUERY_EQUAL extends QueryConditions
  
  @js.native
  sealed trait QUERY_GREATERTHAN extends QueryConditions
  
  @js.native
  sealed trait QUERY_GREATERTHAN_EQUAL extends QueryConditions
  
  @js.native
  sealed trait QUERY_LESSTHAN extends QueryConditions
  
  @js.native
  sealed trait QUERY_LESSTHAN_EQUAL extends QueryConditions
  
  @js.native
  sealed trait QUERY_MATCHES extends QueryConditions
  
  @js.native
  sealed trait QUERY_NOTEQUAL extends QueryConditions
  
  /* "EQ" */ val QUERY_EQUAL: typings.clearbladejsDashServer.CbServerNs.QueryConditions.QUERY_EQUAL with String = js.native
  /* "GT" */ val QUERY_GREATERTHAN: typings.clearbladejsDashServer.CbServerNs.QueryConditions.QUERY_GREATERTHAN with String = js.native
  /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: typings.clearbladejsDashServer.CbServerNs.QueryConditions.QUERY_GREATERTHAN_EQUAL with String = js.native
  /* "LT" */ val QUERY_LESSTHAN: typings.clearbladejsDashServer.CbServerNs.QueryConditions.QUERY_LESSTHAN with String = js.native
  /* "LTE" */ val QUERY_LESSTHAN_EQUAL: typings.clearbladejsDashServer.CbServerNs.QueryConditions.QUERY_LESSTHAN_EQUAL with String = js.native
  /* "RE" */ val QUERY_MATCHES: typings.clearbladejsDashServer.CbServerNs.QueryConditions.QUERY_MATCHES with String = js.native
  /* "NEQ" */ val QUERY_NOTEQUAL: typings.clearbladejsDashServer.CbServerNs.QueryConditions.QUERY_NOTEQUAL with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QueryConditions with String] = js.native
}

