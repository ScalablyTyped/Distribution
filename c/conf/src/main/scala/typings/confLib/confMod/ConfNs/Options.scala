package typings
package confLib.confMod.ConfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var configName: js.UndefOr[java.lang.String] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var defaults: js.UndefOr[org.scalablytyped.runtime.StringDictionary[T]] = js.undefined
  var encryptionKey: js.UndefOr[
    java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView
  ] = js.undefined
  var fileExtension: js.UndefOr[java.lang.String] = js.undefined
  var projectName: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    configName: java.lang.String = null,
    cwd: java.lang.String = null,
    defaults: org.scalablytyped.runtime.StringDictionary[T] = null,
    encryptionKey: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView = null,
    fileExtension: java.lang.String = null,
    projectName: java.lang.String = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (configName != null) __obj.updateDynamic("configName")(configName)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension)
    if (projectName != null) __obj.updateDynamic("projectName")(projectName)
    __obj.asInstanceOf[Options[T]]
  }
}

