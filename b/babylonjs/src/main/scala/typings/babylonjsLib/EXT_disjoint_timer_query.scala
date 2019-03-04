package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXT_disjoint_timer_query extends js.Object {
  var GPU_DISJOINT_EXT: scala.Double
  var QUERY_COUNTER_BITS_EXT: scala.Double
  var QUERY_RESULT_AVAILABLE_EXT: scala.Double
  var QUERY_RESULT_EXT: scala.Double
  var TIMESTAMP_EXT: scala.Double
  var TIME_ELAPSED_EXT: scala.Double
  def beginQueryEXT(target: scala.Double, query: WebGLQuery): scala.Unit
  def createQueryEXT(): WebGLQuery
  def deleteQueryEXT(query: WebGLQuery): scala.Unit
  def endQueryEXT(target: scala.Double): scala.Unit
  def getQueryObjectEXT(query: WebGLQuery, target: scala.Double): js.Any
  def queryCounterEXT(query: WebGLQuery, target: scala.Double): scala.Unit
}

object EXT_disjoint_timer_query {
  @scala.inline
  def apply(
    GPU_DISJOINT_EXT: scala.Double,
    QUERY_COUNTER_BITS_EXT: scala.Double,
    QUERY_RESULT_AVAILABLE_EXT: scala.Double,
    QUERY_RESULT_EXT: scala.Double,
    TIMESTAMP_EXT: scala.Double,
    TIME_ELAPSED_EXT: scala.Double,
    beginQueryEXT: js.Function2[scala.Double, WebGLQuery, scala.Unit],
    createQueryEXT: js.Function0[WebGLQuery],
    deleteQueryEXT: js.Function1[WebGLQuery, scala.Unit],
    endQueryEXT: js.Function1[scala.Double, scala.Unit],
    getQueryObjectEXT: js.Function2[WebGLQuery, scala.Double, js.Any],
    queryCounterEXT: js.Function2[WebGLQuery, scala.Double, scala.Unit]
  ): EXT_disjoint_timer_query = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT, QUERY_COUNTER_BITS_EXT = QUERY_COUNTER_BITS_EXT, QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT, QUERY_RESULT_EXT = QUERY_RESULT_EXT, TIMESTAMP_EXT = TIMESTAMP_EXT, TIME_ELAPSED_EXT = TIME_ELAPSED_EXT, beginQueryEXT = beginQueryEXT, createQueryEXT = createQueryEXT, deleteQueryEXT = deleteQueryEXT, endQueryEXT = endQueryEXT, getQueryObjectEXT = getQueryObjectEXT, queryCounterEXT = queryCounterEXT)
  
    __obj.asInstanceOf[EXT_disjoint_timer_query]
  }
}

