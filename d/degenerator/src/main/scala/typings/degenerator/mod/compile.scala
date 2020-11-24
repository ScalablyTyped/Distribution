package typings.degenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("degenerator", "compile")
@js.native
object compile extends js.Object {
  
  def apply[T /* <: js.Function */](code: String, returnName: String, names: DegeneratorNames): T = js.native
  def apply[T /* <: js.Function */](code: String, returnName: String, names: DegeneratorNames, options: CompileOptions): T = js.native
}
