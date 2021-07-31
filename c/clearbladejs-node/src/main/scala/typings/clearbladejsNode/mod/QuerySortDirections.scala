package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QuerySortDirections extends StObject
@JSImport("clearbladejs-node", "QuerySortDirections")
@js.native
object QuerySortDirections extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QuerySortDirections & String] = js.native
  
  @js.native
  sealed trait QUERY_SORT_ASCENDING
    extends StObject
       with QuerySortDirections
  /* "ASC" */ val QUERY_SORT_ASCENDING: typings.clearbladejsNode.mod.QuerySortDirections.QUERY_SORT_ASCENDING & String = js.native
  
  @js.native
  sealed trait QUERY_SORT_DESCENDING
    extends StObject
       with QuerySortDirections
  /* "DESC" */ val QUERY_SORT_DESCENDING: typings.clearbladejsNode.mod.QuerySortDirections.QUERY_SORT_DESCENDING & String = js.native
}
