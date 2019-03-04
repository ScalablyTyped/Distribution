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
    columns: js.Function1[CbCallback, scala.Unit],
    count: js.Function2[Query, CbCallback, scala.Unit],
    create: js.Function3[js.Object, java.lang.String, CbCallback, scala.Unit],
    deleteEdgeByName: js.Function2[java.lang.String, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    updateEdgeByName: js.Function3[java.lang.String, js.Object, CbCallback, scala.Unit],
    user: APIUser
  ): Edge = {
    val __obj = js.Dynamic.literal(URI = URI, columns = columns, count = count, create = create, deleteEdgeByName = deleteEdgeByName, systemKey = systemKey, systemSecret = systemSecret, updateEdgeByName = updateEdgeByName, user = user)
  
    __obj.asInstanceOf[Edge]
  }
}

