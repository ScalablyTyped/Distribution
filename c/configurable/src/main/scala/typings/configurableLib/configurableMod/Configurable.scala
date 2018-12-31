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

