package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuerySortDirections extends js.Object

@JSGlobal("CbClient.QuerySortDirections")
@js.native
object QuerySortDirections extends js.Object {
  @js.native
  sealed trait QUERY_SORT_ASCENDING
    extends clearbladejsDashClientLib.CbClientNs.QuerySortDirections
  
  @js.native
  sealed trait QUERY_SORT_DESCENDING
    extends clearbladejsDashClientLib.CbClientNs.QuerySortDirections
  
  /* "ASC" */ val QUERY_SORT_ASCENDING: QUERY_SORT_ASCENDING with java.lang.String = js.native
  /* "DESC" */ val QUERY_SORT_DESCENDING: QUERY_SORT_DESCENDING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[clearbladejsDashClientLib.CbClientNs.QuerySortDirections with java.lang.String] = js.native
}

