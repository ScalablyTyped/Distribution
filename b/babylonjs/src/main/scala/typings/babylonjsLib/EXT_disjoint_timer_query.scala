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
    beginQueryEXT: (scala.Double, WebGLQuery) => scala.Unit,
    createQueryEXT: () => WebGLQuery,
    deleteQueryEXT: WebGLQuery => scala.Unit,
    endQueryEXT: scala.Double => scala.Unit,
    getQueryObjectEXT: (WebGLQuery, scala.Double) => js.Any,
    queryCounterEXT: (WebGLQuery, scala.Double) => scala.Unit
  ): EXT_disjoint_timer_query = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT, QUERY_COUNTER_BITS_EXT = QUERY_COUNTER_BITS_EXT, QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT, QUERY_RESULT_EXT = QUERY_RESULT_EXT, TIMESTAMP_EXT = TIMESTAMP_EXT, TIME_ELAPSED_EXT = TIME_ELAPSED_EXT, beginQueryEXT = js.Any.fromFunction2(beginQueryEXT), createQueryEXT = js.Any.fromFunction0(createQueryEXT), deleteQueryEXT = js.Any.fromFunction1(deleteQueryEXT), endQueryEXT = js.Any.fromFunction1(endQueryEXT), getQueryObjectEXT = js.Any.fromFunction2(getQueryObjectEXT), queryCounterEXT = js.Any.fromFunction2(queryCounterEXT))
  
    __obj.asInstanceOf[EXT_disjoint_timer_query]
  }
}

