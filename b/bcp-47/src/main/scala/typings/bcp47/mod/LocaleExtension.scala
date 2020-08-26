package typings.bcp47.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleExtension extends js.Object {
  var extensions: js.Array[String] = js.native
  var singleton: String = js.native
}

object LocaleExtension {
  @scala.inline
  def apply(extensions: js.Array[String], singleton: String): LocaleExtension = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], singleton = singleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleExtension]
  }
  @scala.inline
  implicit class LocaleExtensionOps[Self <: LocaleExtension] (val x: Self) extends AnyVal {
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
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleton(value: String): Self = this.set("singleton", value.asInstanceOf[js.Any])
  }
  
}

