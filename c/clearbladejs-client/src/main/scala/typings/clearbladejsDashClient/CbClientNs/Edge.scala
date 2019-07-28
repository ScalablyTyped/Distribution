package typings.clearbladejsDashClient.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def columns(callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def create(newEdge: js.Object, name: String, callback: CbCallback): Unit
  def deleteEdgeByName(name: String, callback: CbCallback): Unit
  def updateEdgeByName(name: String, `object`: js.Object, callback: CbCallback): Unit
}

object Edge {
  @scala.inline
  def apply(
    URI: String,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (js.Object, String, CbCallback) => Unit,
    deleteEdgeByName: (String, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    updateEdgeByName: (String, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Edge = {
    val __obj = js.Dynamic.literal(URI = URI, columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction3(create), deleteEdgeByName = js.Any.fromFunction2(deleteEdgeByName), systemKey = systemKey, systemSecret = systemSecret, updateEdgeByName = js.Any.fromFunction3(updateEdgeByName), user = user)
  
    __obj.asInstanceOf[Edge]
  }
}

