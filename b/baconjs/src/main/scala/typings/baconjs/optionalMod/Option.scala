package typings.baconjs.optionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option[V] extends js.Object {
  var isDefined: Boolean = js.native
  def filter(f: js.Function1[/* value */ V, Boolean]): Option[V] = js.native
  def forEach(f: js.Function1[/* value */ V, _]): Unit = js.native
  def get(): V = js.native
  def getOrElse(arg: V): V = js.native
  def inspect(): String = js.native
  def map[V2](f: js.Function1[/* value */ V, V2]): Option[V2] = js.native
  def toArray(): js.Array[V] = js.native
}

object Option {
  @scala.inline
  def apply[V](
    filter: js.Function1[/* value */ V, Boolean] => Option[V],
    forEach: js.Function1[/* value */ V, _] => Unit,
    get: () => V,
    getOrElse: V => V,
    inspect: () => String,
    isDefined: Boolean,
    map: js.Function1[/* value */ V, js.Any] => Option[js.Any],
    toArray: () => js.Array[V]
  ): Option[V] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction0(get), getOrElse = js.Any.fromFunction1(getOrElse), inspect = js.Any.fromFunction0(inspect), isDefined = isDefined.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Option[V]]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option[_], V] (val x: Self with Option[V]) extends AnyVal {
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
    def setFilter(value: js.Function1[/* value */ V, Boolean] => Option[V]): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setForEach(value: js.Function1[/* value */ V, _] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: () => V): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOrElse(value: V => V): Self = this.set("getOrElse", js.Any.fromFunction1(value))
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDefined(value: Boolean): Self = this.set("isDefined", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: js.Function1[/* value */ V, js.Any] => Option[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def setToArray(value: () => js.Array[V]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
  
}

