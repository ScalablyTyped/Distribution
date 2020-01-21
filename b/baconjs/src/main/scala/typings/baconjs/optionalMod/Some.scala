package typings.baconjs.optionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@JSImport("baconjs/types/optional", "Some")
@js.native
class Some[V] protected () extends Option[V] {
  def this(value: V) = this()
  var _isSome: Boolean = js.native
  /* CompleteClass */
  override var isDefined: Boolean = js.native
  var value: V = js.native
  /* CompleteClass */
  override def filter(f: js.Function1[V, Boolean]): Option[V] = js.native
  /* CompleteClass */
  override def forEach(f: js.Function1[V, _]): Unit = js.native
  /* CompleteClass */
  override def get(): V = js.native
  /* CompleteClass */
  override def getOrElse(arg: V): V = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def map[V2](f: js.Function1[V, V2]): Option[V2] = js.native
  /* CompleteClass */
  override def toArray(): js.Array[V] = js.native
}

