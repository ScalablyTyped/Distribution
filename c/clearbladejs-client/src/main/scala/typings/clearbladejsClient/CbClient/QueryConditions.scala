package typings.clearbladejsClient.CbClient

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
  
}

