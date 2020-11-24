package typings.degenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("degenerator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Compiles sync JavaScript code into JavaScript with async Functions.
    *
    * @param {String} code JavaScript string to convert
    * @param {Array} names Array of function names to add `await` operators to
    * @return {String} Converted JavaScript string with async/await injected
    * @api public
    */
  def apply(code: String, _names: DegeneratorNames): String = js.native
  def apply(code: String, _names: DegeneratorNames, hasOutput: DegeneratorOptions): String = js.native
}
