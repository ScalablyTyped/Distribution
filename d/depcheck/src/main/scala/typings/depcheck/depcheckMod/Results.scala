package typings.depcheck.depcheckMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var dependencies: js.Array[String]
  var devDependencies: js.Array[String]
  var invalidDirs: StringDictionary[js.Any]
  var invalidFiles: StringDictionary[js.Any]
  var missing: StringDictionary[js.Array[String]]
  var using: StringDictionary[js.Array[String]]
}

object Results {
  @scala.inline
  def apply(
    dependencies: js.Array[String],
    devDependencies: js.Array[String],
    invalidDirs: StringDictionary[js.Any],
    invalidFiles: StringDictionary[js.Any],
    missing: StringDictionary[js.Array[String]],
    using: StringDictionary[js.Array[String]]
  ): Results = {
    val __obj = js.Dynamic.literal(dependencies = dependencies, devDependencies = devDependencies, invalidDirs = invalidDirs, invalidFiles = invalidFiles, missing = missing, using = using)
  
    __obj.asInstanceOf[Results]
  }
}

