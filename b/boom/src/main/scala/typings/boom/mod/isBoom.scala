package typings.boom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("boom", "isBoom")
@js.native
object isBoom extends js.Object {
  
  /**
    * Identifies whether an error is a Boom object. Same as calling instanceof Boom.
    * @param error the error object to identify.
    */
  def apply(error: Error): /* is boom.boom.Boom<any> */ Boolean = js.native
}
