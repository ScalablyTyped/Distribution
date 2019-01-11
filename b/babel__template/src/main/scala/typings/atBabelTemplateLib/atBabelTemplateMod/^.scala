package typings
package atBabelTemplateLib.atBabelTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/template", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: atBabelTemplateLib.DefaultTemplateBuilder = js.native
  val expression: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[atBabelTypesLib.atBabelTypesMod.Expression] = js.native
  val program: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[atBabelTypesLib.atBabelTypesMod.Program] = js.native
  val smart: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[
    atBabelTypesLib.atBabelTypesMod.Statement | js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ] = js.native
  val statement: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[atBabelTypesLib.atBabelTypesMod.Statement] = js.native
  val statements: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[js.Array[atBabelTypesLib.atBabelTypesMod.Statement]] = js.native
}

