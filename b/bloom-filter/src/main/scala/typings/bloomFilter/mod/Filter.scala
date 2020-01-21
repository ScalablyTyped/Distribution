package typings.bloomFilter.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var BLOOM_UPDATE_ALL: Double
  var BLOOM_UPDATE_NONE: Double
  var BLOOM_UPDATE_P2PUBKEY_ONLY: Double
  var LN2: Double
  var LN2SQUARED: Double
  var MAX_BLOOM_FILTER_SIZE: Double
  var MAX_HASH_FUNCS: Double
  var MIN_HASH_FUNCS: Double
  def clear(): Unit
  def contains(data: Buffer): Boolean
  def hash(nHashNum: Double, vDataToHash: Buffer): Double
  def insert(data: Buffer): Unit
  def inspect(): String
  def toObject(): FilterOptions
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
}

