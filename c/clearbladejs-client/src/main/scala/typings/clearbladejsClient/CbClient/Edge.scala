package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def columns(callback: CbCallback): Unit = js.native
  def count(query: Query, callback: CbCallback): Unit = js.native
  def create(newEdge: js.Object, name: String, callback: CbCallback): Unit = js.native
  def deleteEdgeByName(name: String, callback: CbCallback): Unit = js.native
  def updateEdgeByName(name: String, `object`: js.Object, callback: CbCallback): Unit = js.native
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
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction3(create), deleteEdgeByName = js.Any.fromFunction2(deleteEdgeByName), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], updateEdgeByName = js.Any.fromFunction3(updateEdgeByName), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumns(value: CbCallback => Unit): Self = this.set("columns", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: (Query, CbCallback) => Unit): Self = this.set("count", js.Any.fromFunction2(value))
    @scala.inline
    def setCreate(value: (js.Object, String, CbCallback) => Unit): Self = this.set("create", js.Any.fromFunction3(value))
    @scala.inline
    def setDeleteEdgeByName(value: (String, CbCallback) => Unit): Self = this.set("deleteEdgeByName", js.Any.fromFunction2(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateEdgeByName(value: (String, js.Object, CbCallback) => Unit): Self = this.set("updateEdgeByName", js.Any.fromFunction3(value))
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

