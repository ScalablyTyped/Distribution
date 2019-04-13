package typings
package bloomDashFilterLib.bloomDashFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bloom-filter", JSImport.Namespace)
@js.native
class ^ protected () extends Filter {
  def this(options: FilterOptions) = this()
  /* CompleteClass */
  override var BLOOM_UPDATE_ALL: scala.Double = js.native
  /* CompleteClass */
  override var BLOOM_UPDATE_NONE: scala.Double = js.native
  /* CompleteClass */
  override var BLOOM_UPDATE_P2PUBKEY_ONLY: scala.Double = js.native
  /* CompleteClass */
  override var LN2: scala.Double = js.native
  /* CompleteClass */
  override var LN2SQUARED: scala.Double = js.native
  /* CompleteClass */
  override var MAX_BLOOM_FILTER_SIZE: scala.Double = js.native
  /* CompleteClass */
  override var MAX_HASH_FUNCS: scala.Double = js.native
  /* CompleteClass */
  override var MIN_HASH_FUNCS: scala.Double = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def contains(data: nodeLib.Buffer): scala.Boolean = js.native
  /* CompleteClass */
  override def hash(nHashNum: scala.Double, vDataToHash: nodeLib.Buffer): scala.Double = js.native
  /* CompleteClass */
  override def insert(data: nodeLib.Buffer): scala.Unit = js.native
  /* CompleteClass */
  override def inspect(): java.lang.String = js.native
  /* CompleteClass */
  override def toObject(): FilterOptions = js.native
}

@JSImport("bloom-filter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def MurmurHash3(seed: scala.Double, data: nodeLib.Buffer): scala.Double = js.native
  def create(elements: scala.Double, falsePositiveRate: scala.Double): Filter = js.native
  def create(elements: scala.Double, falsePositiveRate: scala.Double, nTweak: scala.Double): Filter = js.native
  def create(
    elements: scala.Double,
    falsePositiveRate: scala.Double,
    nTweak: scala.Double,
    nFlags: scala.Double
  ): Filter = js.native
}

