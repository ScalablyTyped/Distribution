package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Config extends js.Object {
  /**
    * @deprecated Since 5.0, use `sinon.createSandbox` instead
    */
  def create(): cypressLib.typesSinonMod.SinonSandbox = js.native
  def create(config: stdLib.Partial[cypressLib.typesSinonMod.SinonSandboxConfig]): cypressLib.typesSinonMod.SinonSandbox = js.native
}

