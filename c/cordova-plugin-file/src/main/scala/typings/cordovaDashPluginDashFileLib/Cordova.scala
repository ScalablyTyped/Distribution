package typings
package cordovaDashPluginDashFileLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[Cordova]
  }
}

