package typings
package coreDashJsLib.webMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/web", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends stdLib.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  override val toStringTag: java.lang.String = js.native
  /* CompleteClass */
  override def delete(key: K): scala.Boolean = js.native
  /* CompleteClass */
  override def get(key: K): js.UndefOr[V] = js.native
  /* CompleteClass */
  override def has(key: K): scala.Boolean = js.native
  /* CompleteClass */
  override def set(key: K, value: V): this.type = js.native
}

