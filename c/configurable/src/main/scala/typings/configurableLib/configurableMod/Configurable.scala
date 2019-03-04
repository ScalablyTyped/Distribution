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
    disable: js.Function1[java.lang.String, T with Configurable[T]],
    disabled: js.Function1[java.lang.String, scala.Boolean],
    enable: js.Function1[java.lang.String, T with Configurable[T]],
    enabled: js.Function1[java.lang.String, scala.Boolean],
    get: js.Function1[java.lang.String, js.Any],
    set: js.Function2[java.lang.String, js.Any, T with Configurable[T]],
    settings: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): Configurable[T] = {
    val __obj = js.Dynamic.literal(disable = disable, disabled = disabled, enable = enable, enabled = enabled, get = get, set = set, settings = settings)
  
    __obj.asInstanceOf[Configurable[T]]
  }
}

