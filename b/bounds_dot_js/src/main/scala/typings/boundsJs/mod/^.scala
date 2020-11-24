package typings.boundsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bounds.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Asynchronous boundary detection. 1KB, no dependencies.
    */
  def apply(): Boundary = js.native
  def apply(options: Options): Boundary = js.native
}
