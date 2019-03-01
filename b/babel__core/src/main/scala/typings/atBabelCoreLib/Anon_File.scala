package typings
package atBabelCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: java.lang.String
  var mappings: java.lang.String
  var names: js.Array[java.lang.String]
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
  var sources: js.Array[java.lang.String]
  var sourcesContent: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var version: scala.Double
}

object Anon_File {
  @scala.inline
  def apply(
    file: java.lang.String,
    mappings: java.lang.String,
    names: js.Array[java.lang.String],
    sources: js.Array[java.lang.String],
    version: scala.Double,
    sourceRoot: java.lang.String = null,
    sourcesContent: js.Array[java.lang.String] = null
  ): Anon_File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("mappings")(mappings)
    __obj.updateDynamic("names")(names)
    __obj.updateDynamic("sources")(sources)
    __obj.updateDynamic("version")(version)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent)
    __obj.asInstanceOf[Anon_File]
  }
}

