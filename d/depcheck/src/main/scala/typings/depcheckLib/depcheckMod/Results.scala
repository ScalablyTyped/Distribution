package typings
package depcheckLib.depcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var dependencies: js.Array[java.lang.String]
  var devDependencies: js.Array[java.lang.String]
  var invalidDirs: org.scalablytyped.runtime.StringDictionary[js.Any]
  var invalidFiles: org.scalablytyped.runtime.StringDictionary[js.Any]
  var missing: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var using: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}

object Results {
  @scala.inline
  def apply(
    dependencies: js.Array[java.lang.String],
    devDependencies: js.Array[java.lang.String],
    invalidDirs: org.scalablytyped.runtime.StringDictionary[js.Any],
    invalidFiles: org.scalablytyped.runtime.StringDictionary[js.Any],
    missing: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    using: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  ): Results = {
    val __obj = js.Dynamic.literal(dependencies = dependencies, devDependencies = devDependencies, invalidDirs = invalidDirs, invalidFiles = invalidFiles, missing = missing, using = using)
  
    __obj.asInstanceOf[Results]
  }
}

