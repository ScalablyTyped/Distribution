package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def addColumn(options: js.Object, callback: CbCallback): Unit = js.native
  def columns(callback: CbCallback): Unit = js.native
  def count(query: Query, callback: CbCallback): Unit = js.native
  def create(newItem: Item, callback: CbCallback): Unit = js.native
  def deleteCollection(callback: CbCallback): Unit = js.native
  def dropColumn(name: String, callback: CbCallback): Unit = js.native
  def fetch(query: Query, callback: CbCallback): Unit = js.native
  def remove(query: Query, callback: CbCallback): Unit = js.native
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit = js.native
}

object Collection {
  @scala.inline
  def apply(
    URI: String,
    addColumn: (js.Object, CbCallback) => Unit,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (Item, CbCallback) => Unit,
    deleteCollection: CbCallback => Unit,
    dropColumn: (String, CbCallback) => Unit,
    fetch: (Query, CbCallback) => Unit,
    remove: (Query, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], addColumn = js.Any.fromFunction2(addColumn), columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), deleteCollection = js.Any.fromFunction1(deleteCollection), dropColumn = js.Any.fromFunction2(dropColumn), fetch = js.Any.fromFunction2(fetch), remove = js.Any.fromFunction2(remove), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
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
    def setAddColumn(value: (js.Object, CbCallback) => Unit): Self = this.set("addColumn", js.Any.fromFunction2(value))
    @scala.inline
    def setColumns(value: CbCallback => Unit): Self = this.set("columns", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: (Query, CbCallback) => Unit): Self = this.set("count", js.Any.fromFunction2(value))
    @scala.inline
    def setCreate(value: (Item, CbCallback) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def setDeleteCollection(value: CbCallback => Unit): Self = this.set("deleteCollection", js.Any.fromFunction1(value))
    @scala.inline
    def setDropColumn(value: (String, CbCallback) => Unit): Self = this.set("dropColumn", js.Any.fromFunction2(value))
    @scala.inline
    def setFetch(value: (Query, CbCallback) => Unit): Self = this.set("fetch", js.Any.fromFunction2(value))
    @scala.inline
    def setRemove(value: (Query, CbCallback) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (Query, js.Object, CbCallback) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

