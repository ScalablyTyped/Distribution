package typings.baconjs.typesOptionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option[V] extends js.Object {
  var isDefined: Boolean
  def filter(f: js.Function1[/* value */ V, Boolean]): Option[V]
  def forEach(f: js.Function1[/* value */ V, _]): Unit
  def get(): V
  def getOrElse(arg: V): V
  def inspect(): String
  def map[V2](f: js.Function1[/* value */ V, V2]): Option[V2]
  def toArray(): js.Array[V]
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
}

