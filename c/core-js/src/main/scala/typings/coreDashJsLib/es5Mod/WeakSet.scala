package typings
package coreDashJsLib.es5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/es5", "WeakSet")
@js.native
class WeakSet[T /* <: js.Object */] ()
  extends stdLib.WeakSet[T] {
  def this(iterable: stdLib.Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  override val toStringTag: java.lang.String = js.native
  /* CompleteClass */
  override def add(value: T): this.type = js.native
  /* CompleteClass */
  override def delete(value: T): scala.Boolean = js.native
  /* CompleteClass */
  override def has(value: T): scala.Boolean = js.native
}

