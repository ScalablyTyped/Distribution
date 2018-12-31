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

