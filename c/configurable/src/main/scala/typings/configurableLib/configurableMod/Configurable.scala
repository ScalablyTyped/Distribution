package typings
package configurableLib.configurableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configurable[T] extends js.Object {
  var settings: org.scalablytyped.runtime.StringDictionary[js.Any]
  def disable(name: java.lang.String): T with Configurable[T]
  def disabled(name: java.lang.String): scala.Boolean
  def enable(name: java.lang.String): T with Configurable[T]
  def enabled(name: java.lang.String): scala.Boolean
  def get(name: java.lang.String): js.Any
  def set(name: java.lang.String, `val`: js.Any): T with Configurable[T]
}

object Configurable {
  @scala.inline
  def apply[T](
    disable: java.lang.String => T with Configurable[T],
    disabled: java.lang.String => scala.Boolean,
    enable: java.lang.String => T with Configurable[T],
    enabled: java.lang.String => scala.Boolean,
    get: java.lang.String => js.Any,
    set: (java.lang.String, js.Any) => T with Configurable[T],
    settings: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): Configurable[T] = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), disabled = js.Any.fromFunction1(disabled), enable = js.Any.fromFunction1(enable), enabled = js.Any.fromFunction1(enabled), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), settings = settings)
  
    __obj.asInstanceOf[Configurable[T]]
  }
}

