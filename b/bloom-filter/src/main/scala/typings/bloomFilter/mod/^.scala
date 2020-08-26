package typings.bloomFilter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bloom-filter", JSImport.Namespace)
@js.native
class ^ protected () extends Filter {
  def this(options: FilterOptions) = this()
}

@JSImport("bloom-filter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(elements: Double, falsePositiveRate: Double): Filter = js.native
  def create(elements: Double, falsePositiveRate: Double, nTweak: js.UndefOr[scala.Nothing], nFlags: Double): Filter = js.native
  def create(elements: Double, falsePositiveRate: Double, nTweak: Double): Filter = js.native
  def create(elements: Double, falsePositiveRate: Double, nTweak: Double, nFlags: Double): Filter = js.native
}

