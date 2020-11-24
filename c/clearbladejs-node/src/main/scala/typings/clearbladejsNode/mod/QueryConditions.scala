package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryConditions extends js.Object
@JSImport("clearbladejs-node", "QueryConditions")
@js.native
object QueryConditions extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QueryConditions with String] = js.native
  
  @js.native
  sealed trait QUERY_EQUAL extends QueryConditions
  /* "EQ" */ @js.native
  object QUERY_EQUAL extends TopLevel[QUERY_EQUAL with String]
  
  @js.native
  sealed trait QUERY_GREATERTHAN extends QueryConditions
  /* "GT" */ @js.native
  object QUERY_GREATERTHAN extends TopLevel[QUERY_GREATERTHAN with String]
  
  @js.native
  sealed trait QUERY_GREATERTHAN_EQUAL extends QueryConditions
  /* "GTE" */ @js.native
  object QUERY_GREATERTHAN_EQUAL extends TopLevel[QUERY_GREATERTHAN_EQUAL with String]
  
  @js.native
  sealed trait QUERY_LESSTHAN extends QueryConditions
  /* "LT" */ @js.native
  object QUERY_LESSTHAN extends TopLevel[QUERY_LESSTHAN with String]
  
  @js.native
  sealed trait QUERY_LESSTHAN_EQUAL extends QueryConditions
  /* "LTE" */ @js.native
  object QUERY_LESSTHAN_EQUAL extends TopLevel[QUERY_LESSTHAN_EQUAL with String]
  
  @js.native
  sealed trait QUERY_MATCHES extends QueryConditions
  /* "RE" */ @js.native
  object QUERY_MATCHES extends TopLevel[QUERY_MATCHES with String]
  
  @js.native
  sealed trait QUERY_NOTEQUAL extends QueryConditions
  /* "NEQ" */ @js.native
  object QUERY_NOTEQUAL extends TopLevel[QUERY_NOTEQUAL with String]
}
