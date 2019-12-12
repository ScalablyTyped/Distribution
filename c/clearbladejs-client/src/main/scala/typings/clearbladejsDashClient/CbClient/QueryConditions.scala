package typings.clearbladejsDashClient.CbClient

import org.scalablytyped.runtime.TopLevel
import typings.clearbladejsDashClient.CbClient.QueryConditions.QUERY_EQUAL
import typings.clearbladejsDashClient.CbClient.QueryConditions.QUERY_GREATERTHAN
import typings.clearbladejsDashClient.CbClient.QueryConditions.QUERY_GREATERTHAN_EQUAL
import typings.clearbladejsDashClient.CbClient.QueryConditions.QUERY_LESSTHAN
import typings.clearbladejsDashClient.CbClient.QueryConditions.QUERY_LESSTHAN_EQUAL
import typings.clearbladejsDashClient.CbClient.QueryConditions.QUERY_MATCHES
import typings.clearbladejsDashClient.CbClient.QueryConditions.QUERY_NOTEQUAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryConditions extends js.Object

@JSGlobal("CbClient.QueryConditions")
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QueryConditions with String] = js.native
  /* "EQ" */ @js.native
  object QUERY_EQUAL extends TopLevel[QUERY_EQUAL with String]
  
  /* "GT" */ @js.native
  object QUERY_GREATERTHAN extends TopLevel[QUERY_GREATERTHAN with String]
  
  /* "GTE" */ @js.native
  object QUERY_GREATERTHAN_EQUAL extends TopLevel[QUERY_GREATERTHAN_EQUAL with String]
  
  /* "LT" */ @js.native
  object QUERY_LESSTHAN extends TopLevel[QUERY_LESSTHAN with String]
  
  /* "LTE" */ @js.native
  object QUERY_LESSTHAN_EQUAL extends TopLevel[QUERY_LESSTHAN_EQUAL with String]
  
  /* "RE" */ @js.native
  object QUERY_MATCHES extends TopLevel[QUERY_MATCHES with String]
  
  /* "NEQ" */ @js.native
  object QUERY_NOTEQUAL extends TopLevel[QUERY_NOTEQUAL with String]
  
}

