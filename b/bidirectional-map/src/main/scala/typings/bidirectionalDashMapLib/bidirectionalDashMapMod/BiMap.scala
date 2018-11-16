package typings
package bidirectionalDashMapLib.bidirectionalDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BiMap[TValue] extends js.Object {
  var size: scala.Double
  def clear(): scala.Unit
  def delete(key: java.lang.String): scala.Unit
  def deleteValue(value: TValue): scala.Unit
  def entries(): stdLib.IterableIterator[js.Tuple2[java.lang.String, TValue]]
  def get(key: java.lang.String): TValue
  def getKey(value: TValue): java.lang.String
  def has(key: java.lang.String): scala.Boolean
  def hasValue(value: TValue): scala.Boolean
  def keys(): stdLib.IterableIterator[java.lang.String]
  def set(key: java.lang.String, value: TValue): scala.Unit
  def values(): stdLib.IterableIterator[TValue]
}

