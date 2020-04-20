package typings.cordovaPluginFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Constants defined in fileSystemPaths
  */
trait Cordova extends js.Object {
  var file: AnonApplicationDirectory
}

object Cordova {
  @scala.inline
  def apply(file: AnonApplicationDirectory): Cordova = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
}

