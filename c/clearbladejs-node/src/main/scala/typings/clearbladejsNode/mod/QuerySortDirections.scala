package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QuerySortDirections extends StObject
@JSImport("clearbladejs-node", "QuerySortDirections")
@js.native
object QuerySortDirections extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QuerySortDirections with String] = js.native
  
  @js.native
  sealed trait QUERY_SORT_ASCENDING extends QuerySortDirections
  /* "ASC" */ val QUERY_SORT_ASCENDING: typings.clearbladejsNode.mod.QuerySortDirections.QUERY_SORT_ASCENDING with String = js.native
  
  @js.native
  sealed trait QUERY_SORT_DESCENDING extends QuerySortDirections
  /* "DESC" */ val QUERY_SORT_DESCENDING: typings.clearbladejsNode.mod.QuerySortDirections.QUERY_SORT_DESCENDING with String = js.native
}
