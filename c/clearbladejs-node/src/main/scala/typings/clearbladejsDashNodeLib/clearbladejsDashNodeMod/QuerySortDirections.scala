package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuerySortDirections extends js.Object

@JSImport("clearbladejs-node", "QuerySortDirections")
@js.native
object QuerySortDirections extends js.Object {
  @js.native
  sealed trait QUERY_SORT_ASCENDING
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.QuerySortDirections
  
  @js.native
  sealed trait QUERY_SORT_DESCENDING
    extends clearbladejsDashNodeLib.clearbladejsDashNodeMod.QuerySortDirections
  
  /* "ASC" */ val QUERY_SORT_ASCENDING: QUERY_SORT_ASCENDING with java.lang.String = js.native
  /* "DESC" */ val QUERY_SORT_DESCENDING: QUERY_SORT_DESCENDING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    clearbladejsDashNodeLib.clearbladejsDashNodeMod.QuerySortDirections with java.lang.String
  ] = js.native
}

