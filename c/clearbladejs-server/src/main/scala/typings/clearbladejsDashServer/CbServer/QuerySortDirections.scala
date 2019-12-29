package typings.clearbladejsDashServer.CbServer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuerySortDirections extends js.Object

@JSGlobal("CbServer.QuerySortDirections")
@js.native
object QuerySortDirections extends js.Object {
  @js.native
  sealed trait QUERY_SORT_ASCENDING extends QuerySortDirections
  
  @js.native
  sealed trait QUERY_SORT_DESCENDING extends QuerySortDirections
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QuerySortDirections with String] = js.native
  /* "ASC" */ @js.native
  object QUERY_SORT_ASCENDING extends TopLevel[QUERY_SORT_ASCENDING with String]
  
  /* "DESC" */ @js.native
  object QUERY_SORT_DESCENDING extends TopLevel[QUERY_SORT_DESCENDING with String]
  
}

