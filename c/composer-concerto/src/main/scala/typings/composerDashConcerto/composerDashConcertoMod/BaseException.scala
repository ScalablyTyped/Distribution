package typings.composerDashConcerto.composerDashConcertoMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "BaseException")
@js.native
class BaseException protected () extends Error {
  /**
    * Create the BaseException
    */
  def this(message: String) = this()
  def this(message: String, component: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

