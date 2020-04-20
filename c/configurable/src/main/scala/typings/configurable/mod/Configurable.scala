package typings.configurable.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configurable[T] extends js.Object {
  var settings: StringDictionary[js.Any]
  def disable(name: String): T with Configurable[T]
  def disabled(name: String): Boolean
  def enable(name: String): T with Configurable[T]
  def enabled(name: String): Boolean
  def get(name: String): js.Any
  def set(name: String, `val`: js.Any): T with Configurable[T]
}

object Configurable {
  @scala.inline
  def apply[T](
    disable: String => T with Configurable[T],
    disabled: String => Boolean,
    enable: String => T with Configurable[T],
    enabled: String => Boolean,
    get: String => js.Any,
    set: (String, js.Any) => T with Configurable[T],
    settings: StringDictionary[js.Any]
  ): Configurable[T] = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), disabled = js.Any.fromFunction1(disabled), enable = js.Any.fromFunction1(enable), enabled = js.Any.fromFunction1(enabled), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurable[T]]
  }
}

