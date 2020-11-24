package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QuerySortDirections extends js.Object
@JSImport("clearbladejs-node", "QuerySortDirections")
@js.native
object QuerySortDirections extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QuerySortDirections with String] = js.native
  
  @js.native
  sealed trait QUERY_SORT_ASCENDING extends QuerySortDirections
  /* "ASC" */ @js.native
  object QUERY_SORT_ASCENDING extends TopLevel[QUERY_SORT_ASCENDING with String]
  
  @js.native
  sealed trait QUERY_SORT_DESCENDING extends QuerySortDirections
  /* "DESC" */ @js.native
  object QUERY_SORT_DESCENDING extends TopLevel[QUERY_SORT_DESCENDING with String]
}
