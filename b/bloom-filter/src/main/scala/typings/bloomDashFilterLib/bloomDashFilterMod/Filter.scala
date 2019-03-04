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
    clear: js.Function0[scala.Unit],
    contains: js.Function1[nodeLib.Buffer, scala.Boolean],
    hash: js.Function2[scala.Double, nodeLib.Buffer, scala.Double],
    insert: js.Function1[nodeLib.Buffer, scala.Unit],
    inspect: js.Function0[java.lang.String],
    toObject: js.Function0[bloomDashFilterLib.bloomDashFilterMod.FilterNs.FilterOptions]
  ): Filter = {
    val __obj = js.Dynamic.literal(BLOOM_UPDATE_ALL = BLOOM_UPDATE_ALL, BLOOM_UPDATE_NONE = BLOOM_UPDATE_NONE, BLOOM_UPDATE_P2PUBKEY_ONLY = BLOOM_UPDATE_P2PUBKEY_ONLY, LN2 = LN2, LN2SQUARED = LN2SQUARED, MAX_BLOOM_FILTER_SIZE = MAX_BLOOM_FILTER_SIZE, MAX_HASH_FUNCS = MAX_HASH_FUNCS, MIN_HASH_FUNCS = MIN_HASH_FUNCS, clear = clear, contains = contains, hash = hash, insert = insert, inspect = inspect, toObject = toObject)
  
    __obj.asInstanceOf[Filter]
  }
}

