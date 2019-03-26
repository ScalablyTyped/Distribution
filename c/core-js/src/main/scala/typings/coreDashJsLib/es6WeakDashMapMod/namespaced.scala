package typings
package coreDashJsLib.es6WeakDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/es6/weak-map", JSImport.Namespace)
@js.native
class namespaced[K /* <: js.Object */, V] ()
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

