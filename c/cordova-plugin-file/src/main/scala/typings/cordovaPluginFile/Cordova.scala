package typings.cordovaPluginFile

import typings.cordovaPluginFile.anon.ApplicationDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Constants defined in fileSystemPaths
  */
@js.native
trait Cordova extends js.Object {
  var file: ApplicationDirectory = js.native
}

object Cordova {
  @scala.inline
  def apply(file: ApplicationDirectory): Cordova = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  @scala.inline
  implicit class CordovaOps[Self <: Cordova] (val x: Self) extends AnyVal {
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
    def setFile(value: ApplicationDirectory): Self = this.set("file", value.asInstanceOf[js.Any])
  }
  
}

