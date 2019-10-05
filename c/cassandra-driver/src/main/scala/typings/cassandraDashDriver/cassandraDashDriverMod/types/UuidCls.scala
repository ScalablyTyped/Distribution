package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Uuid")
@js.native
class UuidCls protected () extends Uuid {
  def this(buffer: Buffer) = this()
  /* CompleteClass */
  override var buffer: Buffer = js.native
  // tslint:disable-next-line:no-unnecessary-qualifier
  /* CompleteClass */
  override def equals(other: Uuid): Boolean = js.native
  /* CompleteClass */
  override def getBuffer(): Buffer = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

