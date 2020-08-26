package typings.bloomFilter.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  var BLOOM_UPDATE_ALL: Double = js.native
  var BLOOM_UPDATE_NONE: Double = js.native
  var BLOOM_UPDATE_P2PUBKEY_ONLY: Double = js.native
  var LN2: Double = js.native
  var LN2SQUARED: Double = js.native
  var MAX_BLOOM_FILTER_SIZE: Double = js.native
  var MAX_HASH_FUNCS: Double = js.native
  var MIN_HASH_FUNCS: Double = js.native
  def clear(): Unit = js.native
  def contains(data: Buffer): Boolean = js.native
  def hash(nHashNum: Double, vDataToHash: Buffer): Double = js.native
  def insert(data: Buffer): Unit = js.native
  def inspect(): String = js.native
  def toObject(): FilterOptions = js.native
}

object Filter {
  @scala.inline
  def apply(
    BLOOM_UPDATE_ALL: Double,
    BLOOM_UPDATE_NONE: Double,
    BLOOM_UPDATE_P2PUBKEY_ONLY: Double,
    LN2: Double,
    LN2SQUARED: Double,
    MAX_BLOOM_FILTER_SIZE: Double,
    MAX_HASH_FUNCS: Double,
    MIN_HASH_FUNCS: Double,
    clear: () => Unit,
    contains: Buffer => Boolean,
    hash: (Double, Buffer) => Double,
    insert: Buffer => Unit,
    inspect: () => String,
    toObject: () => FilterOptions
  ): Filter = {
    val __obj = js.Dynamic.literal(BLOOM_UPDATE_ALL = BLOOM_UPDATE_ALL.asInstanceOf[js.Any], BLOOM_UPDATE_NONE = BLOOM_UPDATE_NONE.asInstanceOf[js.Any], BLOOM_UPDATE_P2PUBKEY_ONLY = BLOOM_UPDATE_P2PUBKEY_ONLY.asInstanceOf[js.Any], LN2 = LN2.asInstanceOf[js.Any], LN2SQUARED = LN2SQUARED.asInstanceOf[js.Any], MAX_BLOOM_FILTER_SIZE = MAX_BLOOM_FILTER_SIZE.asInstanceOf[js.Any], MAX_HASH_FUNCS = MAX_HASH_FUNCS.asInstanceOf[js.Any], MIN_HASH_FUNCS = MIN_HASH_FUNCS.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), hash = js.Any.fromFunction2(hash), insert = js.Any.fromFunction1(insert), inspect = js.Any.fromFunction0(inspect), toObject = js.Any.fromFunction0(toObject))
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBLOOM_UPDATE_ALL(value: Double): Self = this.set("BLOOM_UPDATE_ALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setBLOOM_UPDATE_NONE(value: Double): Self = this.set("BLOOM_UPDATE_NONE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBLOOM_UPDATE_P2PUBKEY_ONLY(value: Double): Self = this.set("BLOOM_UPDATE_P2PUBKEY_ONLY", value.asInstanceOf[js.Any])
    @scala.inline
    def setLN2(value: Double): Self = this.set("LN2", value.asInstanceOf[js.Any])
    @scala.inline
    def setLN2SQUARED(value: Double): Self = this.set("LN2SQUARED", value.asInstanceOf[js.Any])
    @scala.inline
    def setMAX_BLOOM_FILTER_SIZE(value: Double): Self = this.set("MAX_BLOOM_FILTER_SIZE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMAX_HASH_FUNCS(value: Double): Self = this.set("MAX_HASH_FUNCS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIN_HASH_FUNCS(value: Double): Self = this.set("MIN_HASH_FUNCS", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setContains(value: Buffer => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setHash(value: (Double, Buffer) => Double): Self = this.set("hash", js.Any.fromFunction2(value))
    @scala.inline
    def setInsert(value: Buffer => Unit): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setToObject(value: () => FilterOptions): Self = this.set("toObject", js.Any.fromFunction0(value))
  }
  
}

