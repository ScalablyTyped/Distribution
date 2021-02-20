package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Environment extends StObject
@JSImport("braintree", "Environment")
@js.native
object Environment extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Environment with String] = js.native
  
  @js.native
  sealed trait Development extends Environment
  /* "Development" */ val Development: typings.braintree.mod.Environment.Development with String = js.native
  
  @js.native
  sealed trait Production extends Environment
  /* "Production" */ val Production: typings.braintree.mod.Environment.Production with String = js.native
  
  @js.native
  sealed trait Qa extends Environment
  /* "Qa" */ val Qa: typings.braintree.mod.Environment.Qa with String = js.native
  
  @js.native
  sealed trait Sandbox extends Environment
  /* "Sandbox" */ val Sandbox: typings.braintree.mod.Environment.Sandbox with String = js.native
}
