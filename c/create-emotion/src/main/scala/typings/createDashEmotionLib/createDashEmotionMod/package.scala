package typings
package createDashEmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createDashEmotionMod {
  type CSSBaseObject = csstypeLib.csstypeMod.PropertiesFallback[scala.Double | java.lang.String]
  type CSSPseudoObject = createDashEmotionLib.createDashEmotionLibStrings.CSSPseudoObject with js.Any
  type ClassNameArg = js.UndefOr[
    scala.Null | scala.Boolean | java.lang.String | (ScalablyTyped.runtime.StringDictionary[js.UndefOr[scala.Null | scala.Boolean | java.lang.String]]) | ArrayClassNameArg
  ]
  type Interpolation = js.UndefOr[
    scala.Null | scala.Boolean | java.lang.String | scala.Double | stdLib.TemplateStringsArray | CSSObject | ArrayInterpolation | ClassInterpolation
  ]
  type StylisPlugins = scala.Null | (js.Function1[/* repeated */js.Any, js.Any]) | (js.Array[js.Function1[/* repeated */js.Any, js.Any]])
}
