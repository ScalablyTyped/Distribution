package typings.atBabelTemplate.atBabelTemplateMod

import typings.atBabelTypes.atBabelTypesMod.Expression
import typings.atBabelTypes.atBabelTypesMod.Program
import typings.atBabelTypes.atBabelTypesMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/template", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: DefaultTemplateBuilder = js.native
  val expression: TemplateBuilder[Expression] = js.native
  val program: TemplateBuilder[Program] = js.native
  val smart: TemplateBuilder[Statement | js.Array[Statement]] = js.native
  val statement: TemplateBuilder[Statement] = js.native
  val statements: TemplateBuilder[js.Array[Statement]] = js.native
}

