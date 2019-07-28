package typings.bidirectionalDashMap.bidirectionalDashMapMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bidirectional-map", JSImport.Default)
@js.native
class default[TValue] () extends BiMap[TValue] {
  def this(`object`: StringDictionary[TValue]) = this()
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def delete(key: String): Unit = js.native
  /* CompleteClass */
  override def deleteValue(value: TValue): Unit = js.native
  /* CompleteClass */
  override def entries(): IterableIterator[js.Tuple2[String, TValue]] = js.native
  /* CompleteClass */
  override def get(key: String): TValue = js.native
  /* CompleteClass */
  override def getKey(value: TValue): String = js.native
  /* CompleteClass */
  override def has(key: String): Boolean = js.native
  /* CompleteClass */
  override def hasValue(value: TValue): Boolean = js.native
  /* CompleteClass */
  override def keys(): IterableIterator[String] = js.native
  /* CompleteClass */
  override def set(key: String, value: TValue): Unit = js.native
  /* CompleteClass */
  override def values(): IterableIterator[TValue] = js.native
}

