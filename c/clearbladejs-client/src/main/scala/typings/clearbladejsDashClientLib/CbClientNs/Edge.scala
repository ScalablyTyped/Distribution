package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def columns(callback: CbCallback): scala.Unit
  def count(query: Query, callback: CbCallback): scala.Unit
  def create(newEdge: js.Object, name: java.lang.String, callback: CbCallback): scala.Unit
  def deleteEdgeByName(name: java.lang.String, callback: CbCallback): scala.Unit
  def updateEdgeByName(name: java.lang.String, `object`: js.Object, callback: CbCallback): scala.Unit
}

object Edge {
  @scala.inline
  def apply(
    URI: java.lang.String,
    columns: CbCallback => scala.Unit,
    count: (Query, CbCallback) => scala.Unit,
    create: (js.Object, java.lang.String, CbCallback) => scala.Unit,
    deleteEdgeByName: (java.lang.String, CbCallback) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    updateEdgeByName: (java.lang.String, js.Object, CbCallback) => scala.Unit,
    user: APIUser
  ): Edge = {
    val __obj = js.Dynamic.literal(URI = URI, columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction3(create), deleteEdgeByName = js.Any.fromFunction2(deleteEdgeByName), systemKey = systemKey, systemSecret = systemSecret, updateEdgeByName = js.Any.fromFunction3(updateEdgeByName), user = user)
  
    __obj.asInstanceOf[Edge]
  }
}

