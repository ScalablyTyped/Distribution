package typings
package blenoLib.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bleno", JSImport.Namespace)
@js.native
object namespacedNs extends js.Object {
  @js.native
  class Descriptor protected ()
    extends blenoLib.blenoMod.Descriptor {
    def this(options: blenoLib.blenoMod.DescriptorOptions) = this()
    /* CompleteClass */
    override var uuid: java.lang.String = js.native
    /* CompleteClass */
    override var value: nodeLib.Buffer = js.native
  }
  
  @js.native
  class PrimaryService protected ()
    extends blenoLib.blenoMod.PrimaryService {
    def this(options: blenoLib.blenoMod.PrimaryServiceOptions) = this()
    /* CompleteClass */
    override var characteristics: js.Array[blenoLib.blenoMod.Characteristic] = js.native
    /* CompleteClass */
    override var uuid: java.lang.String = js.native
  }
  
}

