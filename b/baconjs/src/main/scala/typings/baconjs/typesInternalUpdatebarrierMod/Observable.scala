package typings.baconjs.typesInternalUpdatebarrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable extends js.Object {
  var id: Double
  def internalDeps(): js.Array[Observable]
}

object Observable {
  @scala.inline
  def apply(id: Double, internalDeps: () => js.Array[Observable]): Observable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], internalDeps = js.Any.fromFunction0(internalDeps))
  
    __obj.asInstanceOf[Observable]
  }
}

