package typings.bloomDashFilter.bloomDashFilterMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bloom-filter", JSImport.Namespace)
@js.native
class ^ protected () extends Filter {
  def this(options: FilterOptions) = this()
  /* CompleteClass */
  override var BLOOM_UPDATE_ALL: Double = js.native
  /* CompleteClass */
  override var BLOOM_UPDATE_NONE: Double = js.native
  /* CompleteClass */
  override var BLOOM_UPDATE_P2PUBKEY_ONLY: Double = js.native
  /* CompleteClass */
  override var LN2: Double = js.native
  /* CompleteClass */
  override var LN2SQUARED: Double = js.native
  /* CompleteClass */
  override var MAX_BLOOM_FILTER_SIZE: Double = js.native
  /* CompleteClass */
  override var MAX_HASH_FUNCS: Double = js.native
  /* CompleteClass */
  override var MIN_HASH_FUNCS: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def contains(data: Buffer): Boolean = js.native
  /* CompleteClass */
  override def hash(nHashNum: Double, vDataToHash: Buffer): Double = js.native
  /* CompleteClass */
  override def insert(data: Buffer): Unit = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toObject(): FilterOptions = js.native
}

@JSImport("bloom-filter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def MurmurHash3(seed: Double, data: Buffer): Double = js.native
  def create(elements: Double, falsePositiveRate: Double): Filter = js.native
  def create(elements: Double, falsePositiveRate: Double, nTweak: Double): Filter = js.native
  def create(elements: Double, falsePositiveRate: Double, nTweak: Double, nFlags: Double): Filter = js.native
}

