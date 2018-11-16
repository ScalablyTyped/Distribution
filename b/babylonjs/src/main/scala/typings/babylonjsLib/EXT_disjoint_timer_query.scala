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

