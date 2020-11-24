package typings.braintree.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Environment extends js.Object
@JSImport("braintree", "Environment")
@js.native
object Environment extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Environment with String] = js.native
  
  @js.native
  sealed trait Development extends Environment
  /* "Development" */ @js.native
  object Development extends TopLevel[Development with String]
  
  @js.native
  sealed trait Production extends Environment
  /* "Production" */ @js.native
  object Production extends TopLevel[Production with String]
  
  @js.native
  sealed trait Qa extends Environment
  /* "Qa" */ @js.native
  object Qa extends TopLevel[Qa with String]
  
  @js.native
  sealed trait Sandbox extends Environment
  /* "Sandbox" */ @js.native
  object Sandbox extends TopLevel[Sandbox with String]
}
