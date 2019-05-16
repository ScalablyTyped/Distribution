package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Environment extends js.Object

@JSImport("braintree", "Environment")
@js.native
object Environment extends js.Object {
  @js.native
  sealed trait Development
    extends braintreeLib.braintreeMod.Environment
  
  @js.native
  sealed trait Production
    extends braintreeLib.braintreeMod.Environment
  
  @js.native
  sealed trait Qa
    extends braintreeLib.braintreeMod.Environment
  
  @js.native
  sealed trait Sandbox
    extends braintreeLib.braintreeMod.Environment
  
  /* "Development" */ val Development: Development with java.lang.String = js.native
  /* "Production" */ val Production: Production with java.lang.String = js.native
  /* "Qa" */ val Qa: Qa with java.lang.String = js.native
  /* "Sandbox" */ val Sandbox: Sandbox with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[braintreeLib.braintreeMod.Environment with java.lang.String] = js.native
}

