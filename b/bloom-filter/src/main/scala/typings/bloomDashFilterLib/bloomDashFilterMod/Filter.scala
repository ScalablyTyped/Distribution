package typings
package bloomDashFilterLib.bloomDashFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var BLOOM_UPDATE_ALL: scala.Double
  var BLOOM_UPDATE_NONE: scala.Double
  var BLOOM_UPDATE_P2PUBKEY_ONLY: scala.Double
  var LN2: scala.Double
  var LN2SQUARED: scala.Double
  var MAX_BLOOM_FILTER_SIZE: scala.Double
  var MAX_HASH_FUNCS: scala.Double
  var MIN_HASH_FUNCS: scala.Double
  def clear(): scala.Unit
  def contains(data: nodeLib.Buffer): scala.Boolean
  def hash(nHashNum: scala.Double, vDataToHash: nodeLib.Buffer): scala.Double
  def insert(data: nodeLib.Buffer): scala.Unit
  def inspect(): java.lang.String
  def toObject(): bloomDashFilterLib.bloomDashFilterMod.FilterNs.FilterOptions
}

object Filter {
  @scala.inline
  def apply(
    BLOOM_UPDATE_ALL: scala.Double,
    BLOOM_UPDATE_NONE: scala.Double,
    BLOOM_UPDATE_P2PUBKEY_ONLY: scala.Double,
    LN2: scala.Double,
    LN2SQUARED: scala.Double,
    MAX_BLOOM_FILTER_SIZE: scala.Double,
    MAX_HASH_FUNCS: scala.Double,
    MIN_HASH_FUNCS: scala.Double,
    clear: () => scala.Unit,
    contains: nodeLib.Buffer => scala.Boolean,
    hash: (scala.Double, nodeLib.Buffer) => scala.Double,
    insert: nodeLib.Buffer => scala.Unit,
    inspect: () => java.lang.String,
    toObject: () => bloomDashFilterLib.bloomDashFilterMod.FilterNs.FilterOptions
  ): Filter = {
    val __obj = js.Dynamic.literal(BLOOM_UPDATE_ALL = BLOOM_UPDATE_ALL, BLOOM_UPDATE_NONE = BLOOM_UPDATE_NONE, BLOOM_UPDATE_P2PUBKEY_ONLY = BLOOM_UPDATE_P2PUBKEY_ONLY, LN2 = LN2, LN2SQUARED = LN2SQUARED, MAX_BLOOM_FILTER_SIZE = MAX_BLOOM_FILTER_SIZE, MAX_HASH_FUNCS = MAX_HASH_FUNCS, MIN_HASH_FUNCS = MIN_HASH_FUNCS, clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), hash = js.Any.fromFunction2(hash), insert = js.Any.fromFunction1(insert), inspect = js.Any.fromFunction0(inspect), toObject = js.Any.fromFunction0(toObject))
  
    __obj.asInstanceOf[Filter]
  }
}

