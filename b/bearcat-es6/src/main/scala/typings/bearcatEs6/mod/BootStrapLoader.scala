package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootStrapLoader extends js.Object {
  /**
    * BootStrapLoader load script files.
    *
    * @param   idPaths
    * @api     public
    */
  def load(idPaths: js.Array[String]): Unit
}

object BootStrapLoader {
  @scala.inline
  def apply(load: js.Array[String] => Unit): BootStrapLoader = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load))
  
    __obj.asInstanceOf[BootStrapLoader]
  }
}

