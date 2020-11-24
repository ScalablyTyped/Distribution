package typings.codependency.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequirePeerFunction extends js.Object {
  
  def apply(name: String): js.Any = js.native
  def apply(name: String, options: RequirePeerFunctionOptions): js.Any = js.native
  
  def resolve(name: String): DependencyInfo = js.native
}
