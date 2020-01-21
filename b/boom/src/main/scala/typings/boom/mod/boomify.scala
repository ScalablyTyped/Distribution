package typings.boom.mod

import typings.boom.AnonMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("boom", "boomify")
@js.native
object boomify extends js.Object {
  /**
    * Decorates an error with the boom properties
    * @param error the error object to wrap. If error is already a boom object, it defaults to overriding the object with the new status code and message.
    * @param options optional additional options
    * @see {@link https://github.com/hapijs/boom#boomifyerror-options}
    */
  def apply(error: Error): Boom[Null] = js.native
  def apply(error: Error, options: AnonMessage): Boom[Null] = js.native
}

