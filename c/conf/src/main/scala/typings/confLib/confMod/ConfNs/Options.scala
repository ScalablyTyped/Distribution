package typings
package confLib.confMod.ConfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options[T] extends js.Object {
  var configName: js.UndefOr[java.lang.String] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var defaults: js.UndefOr[ScalablyTyped.runtime.StringDictionary[T]] = js.undefined
  var encryptionKey: js.UndefOr[
    java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView
  ] = js.undefined
  var fileExtension: js.UndefOr[java.lang.String] = js.undefined
  var projectName: js.UndefOr[java.lang.String] = js.undefined
}

