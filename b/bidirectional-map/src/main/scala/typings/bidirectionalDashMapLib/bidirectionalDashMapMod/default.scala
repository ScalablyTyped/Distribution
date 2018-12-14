package typings
package bidirectionalDashMapLib.bidirectionalDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bidirectional-map", JSImport.Default)
@js.native
class default[TValue] () extends BiMap[TValue] {
  def this(`object`: org.scalablytyped.runtime.StringDictionary[TValue]) = this()
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def delete(key: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def deleteValue(value: TValue): scala.Unit = js.native
  /* CompleteClass */
  override def entries(): stdLib.IterableIterator[js.Tuple2[java.lang.String, TValue]] = js.native
  /* CompleteClass */
  override def get(key: java.lang.String): TValue = js.native
  /* CompleteClass */
  override def getKey(value: TValue): java.lang.String = js.native
  /* CompleteClass */
  override def has(key: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def hasValue(value: TValue): scala.Boolean = js.native
  /* CompleteClass */
  override def keys(): stdLib.IterableIterator[java.lang.String] = js.native
  /* CompleteClass */
  override def set(key: java.lang.String, value: TValue): scala.Unit = js.native
  /* CompleteClass */
  override def values(): stdLib.IterableIterator[TValue] = js.native
}

