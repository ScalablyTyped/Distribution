package typings
package atBabelTemplateLib.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/template", JSImport.Namespace)
@js.native
object templateModMembers extends js.Object {
  val default: atBabelTemplateLib.DefaultTemplateBuilder = js.native
  val expression: TemplateBuilder[atBabelTypesLib.typesMod.Expression] = js.native
  val program: TemplateBuilder[atBabelTypesLib.typesMod.Program] = js.native
  val smart: TemplateBuilder[
    atBabelTypesLib.typesMod.Statement | js.Array[atBabelTypesLib.typesMod.Statement]
  ] = js.native
  val statement: TemplateBuilder[atBabelTypesLib.typesMod.Statement] = js.native
  val statements: TemplateBuilder[js.Array[atBabelTypesLib.typesMod.Statement]] = js.native
}

