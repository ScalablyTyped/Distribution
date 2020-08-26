package typings.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  var del: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var keys: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var mget: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var mset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var reset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var setex: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var ttl: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  // These functions will just be bound to the Cache object if they exist so args can be anything
  def get[T](args: js.Any*): js.Promise[_] = js.native
  def set[T](args: js.Any*): js.Promise[_] = js.native
}

object Store {
  @scala.inline
  def apply(get: /* repeated */ js.Any => js.Promise[_], set: /* repeated */ js.Any => js.Promise[_]): Store = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
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
    def setGet(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setDel(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("del", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDel: Self = this.set("del", js.undefined)
    @scala.inline
    def setKeys(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("keys", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setMget(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("mget", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMget: Self = this.set("mget", js.undefined)
    @scala.inline
    def setMset(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("mset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMset: Self = this.set("mset", js.undefined)
    @scala.inline
    def setReset(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setSetex(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("setex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetex: Self = this.set("setex", js.undefined)
    @scala.inline
    def setTtl(value: /* repeated */ js.Any => js.Promise[_]): Self = this.set("ttl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

