package typings.atBabelTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelTemplateMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atBabelTemplate.Anon_Ast
  import typings.atBabelTypes.atBabelTypesMod.Statement

  type DefaultTemplateBuilder = (TemplateBuilder[Statement | js.Array[Statement]]) with Anon_Ast
  type PublicReplacements = StringDictionary[js.Any] | js.Array[js.Any]
}
