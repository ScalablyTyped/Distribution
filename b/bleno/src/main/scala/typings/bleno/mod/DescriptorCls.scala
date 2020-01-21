package typings.bleno.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bleno", "Descriptor")
@js.native
class DescriptorCls protected () extends Descriptor {
  def this(options: DescriptorOptions) = this()
  /* CompleteClass */
  override var uuid: String = js.native
  /* CompleteClass */
  override var value: Buffer = js.native
}

