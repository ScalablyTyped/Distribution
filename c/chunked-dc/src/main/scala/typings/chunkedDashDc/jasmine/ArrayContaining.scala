package typings.chunkedDashDc.jasmine

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayContaining
  extends Instantiable1[/* sample */ js.Array[js.Any], js.Any] {
  def asymmetricMatch(other: js.Any): Boolean = js.native
  def jasmineToString(): String = js.native
}

@JSGlobal("jasmine.arrayContaining")
@js.native
object arrayContaining extends js.Object {
  def apply(sample: js.Array[_]): ArrayContaining = js.native
}

