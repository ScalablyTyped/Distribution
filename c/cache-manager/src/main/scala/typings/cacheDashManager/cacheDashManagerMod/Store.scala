package typings.cacheDashManager.cacheDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  var del: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var keys: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var mget: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var mset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var reset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var setex: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  var ttl: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.undefined
  // These functions will just be bound to the Cache object if they exist so args can be anything
  def get[T](args: js.Any*): js.Promise[_]
  def set[T](args: js.Any*): js.Promise[_]
}

object Store {
  @scala.inline
  def apply(
    get: /* repeated */ js.Any => js.Promise[_],
    set: /* repeated */ js.Any => js.Promise[_],
    del: /* repeated */ js.Any => js.Promise[_] = null,
    keys: /* repeated */ js.Any => js.Promise[_] = null,
    mget: /* repeated */ js.Any => js.Promise[_] = null,
    mset: /* repeated */ js.Any => js.Promise[_] = null,
    reset: /* repeated */ js.Any => js.Promise[_] = null,
    setex: /* repeated */ js.Any => js.Promise[_] = null,
    ttl: /* repeated */ js.Any => js.Promise[_] = null
  ): Store = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
    if (del != null) __obj.updateDynamic("del")(js.Any.fromFunction1(del))
    if (keys != null) __obj.updateDynamic("keys")(js.Any.fromFunction1(keys))
    if (mget != null) __obj.updateDynamic("mget")(js.Any.fromFunction1(mget))
    if (mset != null) __obj.updateDynamic("mset")(js.Any.fromFunction1(mset))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1(reset))
    if (setex != null) __obj.updateDynamic("setex")(js.Any.fromFunction1(setex))
    if (ttl != null) __obj.updateDynamic("ttl")(js.Any.fromFunction1(ttl))
    __obj.asInstanceOf[Store]
  }
}

