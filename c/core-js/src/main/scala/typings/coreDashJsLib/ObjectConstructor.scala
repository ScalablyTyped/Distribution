package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// Object - https://github.com/zloirock/core-js/#object
// Modules: core.object
// #############################################################################################
@js.native
trait ObjectConstructor extends js.Object {
  /**
       * Non-standard.
       */
  def classof(value: js.Any): java.lang.String = js.native
  /**
       * Non-standard.
       */
  def define[T](target: T, mixin: js.Any): T = js.native
  /**
       * Non-standard.
       */
  def isObject(value: js.Any): scala.Boolean = js.native
  /**
       * Non-standard.
       */
  def make[T](proto: T): T = js.native
  /**
       * Non-standard.
       */
  def make[T](proto: T, mixin: js.Any): T = js.native
}

