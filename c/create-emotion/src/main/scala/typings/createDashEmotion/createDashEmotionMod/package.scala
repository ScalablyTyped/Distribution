package typings.createDashEmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createDashEmotionMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.csstype.csstypeMod.PropertiesFallback
  import typings.std.TemplateStringsArray

  type CSSBaseObject = PropertiesFallback[Double | String]
  type CSSPseudoObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? create-emotion.create-emotion.CSSObject}
    */ typings.createDashEmotion.createDashEmotionStrings.CSSPseudoObject with js.Any
  type ClassNameArg = js.UndefOr[
    Null | Boolean | String | (StringDictionary[js.UndefOr[Null | Boolean | String]]) | ArrayClassNameArg
  ]
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typings.std.TemplateStringsArray
    - typings.createDashEmotion.createDashEmotionMod.CSSObject
    - typings.createDashEmotion.createDashEmotionMod.ArrayInterpolation
    - typings.createDashEmotion.createDashEmotionMod.ClassInterpolation
  */
  type Interpolation = js.UndefOr[_Interpolation | Null | Boolean | String | Double | TemplateStringsArray]
  type StylisPlugins = Null | (js.Function1[/* repeated */ js.Any, js.Any]) | (js.Array[js.Function1[/* repeated */ js.Any, js.Any]])
}
