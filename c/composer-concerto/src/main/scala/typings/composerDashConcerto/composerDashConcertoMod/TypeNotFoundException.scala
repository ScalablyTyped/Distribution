package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "TypeNotFoundException")
@js.native
class TypeNotFoundException protected () extends BaseException {
  /**
    * If the optional 'message' argument is not supplied, it will be set to a default value that
    * includes the type name.
    */
  def this(typeName: String) = this()
  def this(typeName: String, message: String) = this()
  def this(typeName: String, message: String, component: String) = this()
  /**
    * Get the name of the type that was not found.
    */
  def getTypeName(): String = js.native
}

