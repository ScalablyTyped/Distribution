package typings.braintree.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Environment with String] = js.native
  /* "Development" */ @js.native
  object Development extends TopLevel[Development with String]
  
  /* "Production" */ @js.native
  object Production extends TopLevel[Production with String]
  
  /* "Qa" */ @js.native
  object Qa extends TopLevel[Qa with String]
  
  /* "Sandbox" */ @js.native
  object Sandbox extends TopLevel[Sandbox with String]
  
}

