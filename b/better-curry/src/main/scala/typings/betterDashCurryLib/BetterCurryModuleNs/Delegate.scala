package typings
package betterDashCurryLib.BetterCurryModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BetterCurryModule.Delegate")
@js.native
class Delegate[T] protected () extends js.Object {
  def this(proto: T, target: java.lang.String) = this()
  var getters: js.Array[_] = js.native
  var methods: js.Array[_] = js.native
  var proto: T = js.native
  var setters: js.Array[_] = js.native
  var target: java.lang.String = js.native
  def access(name: DelegateOptions): Delegate[T] = js.native
  def access(name: java.lang.String): Delegate[T] = js.native
  def all(): scala.Unit = js.native
  def all(skip: js.Array[java.lang.String]): scala.Unit = js.native
  def getter(name: DelegateOptions): Delegate[T] = js.native
  def getter(name: java.lang.String): Delegate[T] = js.native
  def method(name: DelegateOptions): Delegate[T] = js.native
  def method(name: java.lang.String): Delegate[T] = js.native
  def revoke(name: java.lang.String): Delegate[T] = js.native
  def setter(name: DelegateOptions): Delegate[T] = js.native
  def setter(name: java.lang.String): Delegate[T] = js.native
}

