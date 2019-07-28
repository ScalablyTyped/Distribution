package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Environment extends js.Object

@JSImport("braintree", "Environment")
@js.native
object Environment extends js.Object {
  @js.native
  sealed trait Development extends Environment
  
  @js.native
  sealed trait Production extends Environment
  
  @js.native
  sealed trait Qa extends Environment
  
  @js.native
  sealed trait Sandbox extends Environment
  
  /* "Development" */ val Development: typings.braintree.braintreeMod.Environment.Development with String = js.native
  /* "Production" */ val Production: typings.braintree.braintreeMod.Environment.Production with String = js.native
  /* "Qa" */ val Qa: typings.braintree.braintreeMod.Environment.Qa with String = js.native
  /* "Sandbox" */ val Sandbox: typings.braintree.braintreeMod.Environment.Sandbox with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Environment with String] = js.native
}

