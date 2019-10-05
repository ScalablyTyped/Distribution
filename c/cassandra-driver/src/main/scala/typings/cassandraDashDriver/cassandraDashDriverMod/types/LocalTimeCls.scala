package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.long.longMod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.LocalTime")
@js.native
class LocalTimeCls protected () extends LocalTime {
  def this(totalNanoseconds: ^) = this()
  /* CompleteClass */
  override var hour: Double = js.native
  /* CompleteClass */
  override var minute: Double = js.native
  /* CompleteClass */
  override var nanosecond: Double = js.native
  /* CompleteClass */
  override var second: Double = js.native
  /* CompleteClass */
  override def compare(other: LocalTime): Boolean = js.native
  /* CompleteClass */
  override def equals(other: LocalTime): Boolean = js.native
  /* CompleteClass */
  override def getTotalNanoseconds(): ^ = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toBuffer(): Buffer = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

