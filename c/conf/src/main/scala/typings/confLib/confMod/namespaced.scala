package typings
package confLib.confMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("conf", JSImport.Namespace)
@js.native
class namespaced[T] () extends Conf[T] {
  def this(options: Options[T]) = this()
  /* CompleteClass */
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[js.Tuple2[java.lang.String, T]]] = js.native
}

