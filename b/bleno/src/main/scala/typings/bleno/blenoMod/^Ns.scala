package typings.bleno.blenoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bleno", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  class Descriptor protected ()
    extends typings.bleno.blenoMod.Descriptor {
    def this(options: DescriptorOptions) = this()
    /* CompleteClass */
    override var uuid: String = js.native
    /* CompleteClass */
    override var value: Buffer = js.native
  }
  
  @js.native
  class PrimaryService protected ()
    extends typings.bleno.blenoMod.PrimaryService {
    def this(options: PrimaryServiceOptions) = this()
    /* CompleteClass */
    override var characteristics: js.Array[Characteristic] = js.native
    /* CompleteClass */
    override var uuid: String = js.native
  }
  
}

