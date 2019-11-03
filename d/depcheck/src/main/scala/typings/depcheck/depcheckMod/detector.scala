package typings.depcheck.depcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("depcheck", "detector")
@js.native
object detector extends js.Object {
  @JSName("exportDeclaration")
  var exportDeclaration_Original: Detector = js.native
  @JSName("expressViewEngine")
  var expressViewEngine_Original: Detector = js.native
  @JSName("gruntLoadTaskCallExpression")
  var gruntLoadTaskCallExpression_Original: Detector = js.native
  @JSName("importCallExpression")
  var importCallExpression_Original: Detector = js.native
  @JSName("importDeclaration")
  var importDeclaration_Original: Detector = js.native
  @JSName("requireCallExpression")
  var requireCallExpression_Original: Detector = js.native
  @JSName("requireResolveCallExpression")
  var requireResolveCallExpression_Original: Detector = js.native
  @JSName("typescriptImportEqualsDeclaration")
  var typescriptImportEqualsDeclaration_Original: Detector = js.native
  def exportDeclaration(node: Node): js.Array[String] | String = js.native
  def expressViewEngine(node: Node): js.Array[String] | String = js.native
  def gruntLoadTaskCallExpression(node: Node): js.Array[String] | String = js.native
  def importCallExpression(node: Node): js.Array[String] | String = js.native
  def importDeclaration(node: Node): js.Array[String] | String = js.native
  def requireCallExpression(node: Node): js.Array[String] | String = js.native
  def requireResolveCallExpression(node: Node): js.Array[String] | String = js.native
  def typescriptImportEqualsDeclaration(node: Node): js.Array[String] | String = js.native
}

