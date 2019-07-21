package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "BaseException")
@js.native
class BaseException protected ()
  extends stdLib.Error {
  /**
    * Create the BaseException
    */
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, component: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

