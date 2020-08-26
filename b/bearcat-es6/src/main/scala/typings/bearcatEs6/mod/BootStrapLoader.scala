package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootStrapLoader extends js.Object {
  /**
    * BootStrapLoader load script files.
    *
    * @param   idPaths
    * @api     public
    */
  def load(idPaths: js.Array[String]): Unit = js.native
}

object BootStrapLoader {
  @scala.inline
  def apply(load: js.Array[String] => Unit): BootStrapLoader = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load))
    __obj.asInstanceOf[BootStrapLoader]
  }
  @scala.inline
  implicit class BootStrapLoaderOps[Self <: BootStrapLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoad(value: js.Array[String] => Unit): Self = this.set("load", js.Any.fromFunction1(value))
  }
  
}

