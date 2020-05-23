package typings.babylonjs

import typings.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXTDisjointTimerQuery extends js.Object {
  var GPU_DISJOINT_EXT: Double
  var QUERY_COUNTER_BITS_EXT: Double
  var QUERY_RESULT_AVAILABLE_EXT: Double
  var QUERY_RESULT_EXT: Double
  var TIMESTAMP_EXT: Double
  var TIME_ELAPSED_EXT: Double
  def beginQueryEXT(target: Double, query: WebGLQuery): Unit
  def createQueryEXT(): WebGLQuery
  def deleteQueryEXT(query: WebGLQuery): Unit
  def endQueryEXT(target: Double): Unit
  def getQueryObjectEXT(query: WebGLQuery, target: Double): js.Any
  def queryCounterEXT(query: WebGLQuery, target: Double): Unit
}

object EXTDisjointTimerQuery {
  @scala.inline
  def apply(
    GPU_DISJOINT_EXT: Double,
    QUERY_COUNTER_BITS_EXT: Double,
    QUERY_RESULT_AVAILABLE_EXT: Double,
    QUERY_RESULT_EXT: Double,
    TIMESTAMP_EXT: Double,
    TIME_ELAPSED_EXT: Double,
    beginQueryEXT: (Double, WebGLQuery) => Unit,
    createQueryEXT: () => WebGLQuery,
    deleteQueryEXT: WebGLQuery => Unit,
    endQueryEXT: Double => Unit,
    getQueryObjectEXT: (WebGLQuery, Double) => js.Any,
    queryCounterEXT: (WebGLQuery, Double) => Unit
  ): EXTDisjointTimerQuery = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], QUERY_COUNTER_BITS_EXT = QUERY_COUNTER_BITS_EXT.asInstanceOf[js.Any], QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT.asInstanceOf[js.Any], QUERY_RESULT_EXT = QUERY_RESULT_EXT.asInstanceOf[js.Any], TIMESTAMP_EXT = TIMESTAMP_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any], beginQueryEXT = js.Any.fromFunction2(beginQueryEXT), createQueryEXT = js.Any.fromFunction0(createQueryEXT), deleteQueryEXT = js.Any.fromFunction1(deleteQueryEXT), endQueryEXT = js.Any.fromFunction1(endQueryEXT), getQueryObjectEXT = js.Any.fromFunction2(getQueryObjectEXT), queryCounterEXT = js.Any.fromFunction2(queryCounterEXT))
    __obj.asInstanceOf[EXTDisjointTimerQuery]
  }
}

