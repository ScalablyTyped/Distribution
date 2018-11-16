package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryConditions extends js.Object

@JSImport("clearbladejs-node", "QueryConditions")
@js.native
object QueryConditions extends js.Object {
  @js.native
  sealed trait QUERY_EQUAL
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.QueryConditions
  
  @js.native
  sealed trait QUERY_GREATERTHAN
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.QueryConditions
  
  @js.native
  sealed trait QUERY_GREATERTHAN_EQUAL
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.QueryConditions
  
  @js.native
  sealed trait QUERY_LESSTHAN
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.QueryConditions
  
  @js.native
  sealed trait QUERY_LESSTHAN_EQUAL
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.QueryConditions
  
  @js.native
  sealed trait QUERY_MATCHES
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.QueryConditions
  
  @js.native
  sealed trait QUERY_NOTEQUAL
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.QueryConditions
  
  /* "EQ" */ val QUERY_EQUAL: QUERY_EQUAL with java.lang.String = js.native
  /* "GT" */ val QUERY_GREATERTHAN: QUERY_GREATERTHAN with java.lang.String = js.native
  /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: QUERY_GREATERTHAN_EQUAL with java.lang.String = js.native
  /* "LT" */ val QUERY_LESSTHAN: QUERY_LESSTHAN with java.lang.String = js.native
  /* "LTE" */ val QUERY_LESSTHAN_EQUAL: QUERY_LESSTHAN_EQUAL with java.lang.String = js.native
  /* "RE" */ val QUERY_MATCHES: QUERY_MATCHES with java.lang.String = js.native
  /* "NEQ" */ val QUERY_NOTEQUAL: QUERY_NOTEQUAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    clearbladejsDashNodeLib.clearbladejsDashNodeMod.QueryConditions with java.lang.String
  ] = js.native
}

