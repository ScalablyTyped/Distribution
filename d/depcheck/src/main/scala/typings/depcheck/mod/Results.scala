package typings.depcheck.mod

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
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], invalidDirs = invalidDirs.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

