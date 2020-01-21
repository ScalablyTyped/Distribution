package typings.carbonMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@carbon/motion", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object easings extends js.Object {
    var entrance: AnonExpressive = js.native
    var exit: AnonExpressive = js.native
    var standard: AnonExpressive = js.native
  }
  
  @js.native
  object motion extends js.Object {
    def apply(name: String, mode: String): String = js.native
  }
  
}

