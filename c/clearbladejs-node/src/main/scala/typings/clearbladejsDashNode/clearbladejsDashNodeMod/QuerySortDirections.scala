package typings.clearbladejsDashNode.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuerySortDirections extends js.Object

@JSImport("clearbladejs-node", "QuerySortDirections")
@js.native
object QuerySortDirections extends js.Object {
  @js.native
  sealed trait QUERY_SORT_ASCENDING extends QuerySortDirections
  
  @js.native
  sealed trait QUERY_SORT_DESCENDING extends QuerySortDirections
  
  /* "ASC" */ val QUERY_SORT_ASCENDING: typings.clearbladejsDashNode.clearbladejsDashNodeMod.QuerySortDirections.QUERY_SORT_ASCENDING with String = js.native
  /* "DESC" */ val QUERY_SORT_DESCENDING: typings.clearbladejsDashNode.clearbladejsDashNodeMod.QuerySortDirections.QUERY_SORT_DESCENDING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QuerySortDirections with String] = js.native
}

