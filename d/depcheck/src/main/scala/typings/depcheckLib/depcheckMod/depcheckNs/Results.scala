package typings
package depcheckLib.depcheckMod.depcheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var dependencies: js.Array[java.lang.String]
  var devDependencies: js.Array[java.lang.String]
  var invalidDirs: js.Array[java.lang.String]
  var invalidFiles: js.Array[java.lang.String]
  var missing: js.Array[java.lang.String]
  var using: js.Array[java.lang.String]
}

object Results {
  @scala.inline
  def apply(
    dependencies: js.Array[java.lang.String],
    devDependencies: js.Array[java.lang.String],
    invalidDirs: js.Array[java.lang.String],
    invalidFiles: js.Array[java.lang.String],
    missing: js.Array[java.lang.String],
    using: js.Array[java.lang.String]
  ): Results = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dependencies")(dependencies)
    __obj.updateDynamic("devDependencies")(devDependencies)
    __obj.updateDynamic("invalidDirs")(invalidDirs)
    __obj.updateDynamic("invalidFiles")(invalidFiles)
    __obj.updateDynamic("missing")(missing)
    __obj.updateDynamic("using")(using)
    __obj.asInstanceOf[Results]
  }
}

