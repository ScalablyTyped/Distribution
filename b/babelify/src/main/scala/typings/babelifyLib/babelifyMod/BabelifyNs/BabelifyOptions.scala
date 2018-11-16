package typings
package babelifyLib.babelifyMod.BabelifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BabelifyOptions
  extends babelDashCoreLib.babelDashCoreMod.TransformOptions {
  /** These are passed to babel.util.canCompile() for each filename
           * default: null
           */
  var extensions: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** if true, a 'sourceFileName' property with a value equal to the current file being transformed is included with the options passed to babel.transform()
           * default: false
           */
  var sourceMapsAbsolute: js.UndefOr[scala.Boolean] = js.undefined
}

