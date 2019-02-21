package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewScope extends js.Object

@JSImport("camljs/CamlBuilder", "ViewScope")
@js.native
object ViewScope extends js.Object {
  @js.native
  sealed trait FilesOnly
    extends camljsLib.camljsMod.CamlBuilderNs.ViewScope
  
  @js.native
  sealed trait Recursive
    extends camljsLib.camljsMod.CamlBuilderNs.ViewScope
  
  @js.native
  sealed trait RecursiveAll
    extends camljsLib.camljsMod.CamlBuilderNs.ViewScope
  
}

