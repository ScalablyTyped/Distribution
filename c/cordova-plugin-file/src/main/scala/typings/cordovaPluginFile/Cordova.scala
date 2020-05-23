package typings.cordovaPluginFile

import typings.cordovaPluginFile.anon.ApplicationDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Constants defined in fileSystemPaths
  */
trait Cordova extends js.Object {
  var file: ApplicationDirectory
}

object Cordova {
  @scala.inline
  def apply(file: ApplicationDirectory): Cordova = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
}

