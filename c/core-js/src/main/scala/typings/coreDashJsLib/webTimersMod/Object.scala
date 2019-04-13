package typings
package coreDashJsLib.webTimersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/web/timers", "Object")
@js.native
object Object extends js.Object {
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def classof(value: js.Any): java.lang.String = js.native
  def create(o: js.Any): js.Any = js.native
  def create(o: js.Any, properties: stdLib.PropertyDescriptorMap): js.Any = js.native
  def define[T](target: T, mixin: js.Any): T = js.native
  def defineProperties(o: js.Any, properties: stdLib.PropertyDescriptorMap): js.Any = js.native
  def defineProperty(o: js.Any, propertyKey: stdLib.PropertyKey, attributes: stdLib.PropertyDescriptor): js.Any = js.native
  def entries(`object`: js.Any): coreDashJsLib.Array[_] = js.native
  def freeze[T](o: T): T = js.native
  def getOwnPropertyDescriptor(o: js.Any, propertyKey: stdLib.PropertyKey): stdLib.PropertyDescriptor = js.native
  def getOwnPropertyDescriptors(`object`: js.Any): stdLib.PropertyDescriptorMap = js.native
  def getOwnPropertyNames(o: js.Any): coreDashJsLib.Array[java.lang.String] = js.native
  def getOwnPropertySymbols(o: js.Any): coreDashJsLib.Array[js.Symbol] = js.native
  def getPrototypeOf(o: js.Any): js.Any = js.native
  def is(value1: js.Any, value2: js.Any): scala.Boolean = js.native
  def isExtensible(o: js.Any): scala.Boolean = js.native
  def isFrozen(o: js.Any): scala.Boolean = js.native
  def isObject(value: js.Any): scala.Boolean = js.native
  def isSealed(o: js.Any): scala.Boolean = js.native
  def keys(o: js.Any): coreDashJsLib.Array[java.lang.String] = js.native
  def make[T](proto: T): T = js.native
  def make[T](proto: T, mixin: js.Any): T = js.native
  def preventExtensions[T](o: T): T = js.native
  def seal[T](o: T): T = js.native
  def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
  def values(`object`: js.Any): coreDashJsLib.Array[_] = js.native
}

