package typings.cordovaDashPluginDashFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Constants defined in fileSystemPaths
  */
trait Cordova extends js.Object {
  var file: Anon_ApplicationDirectory
}

object Cordova {
  @scala.inline
  def apply(file: Anon_ApplicationDirectory): Cordova = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cordova]
  }
}

