package typings.depcheck.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("depcheck", "detector")
@js.native
object detector extends js.Object {
  
  def exportDeclaration(node: Node): js.Array[String] | String = js.native
  @JSName("exportDeclaration")
  var exportDeclaration_Original: Detector_ = js.native
  
  def expressViewEngine(node: Node): js.Array[String] | String = js.native
  @JSName("expressViewEngine")
  var expressViewEngine_Original: Detector_ = js.native
  
  def extract(node: Node): js.Array[String] | String = js.native
  @JSName("extract")
  var extract_Original: Detector_ = js.native
  
  def gruntLoadTaskCallExpression(node: Node): js.Array[String] | String = js.native
  @JSName("gruntLoadTaskCallExpression")
  var gruntLoadTaskCallExpression_Original: Detector_ = js.native
  
  def importCallExpression(node: Node): js.Array[String] | String = js.native
  @JSName("importCallExpression")
  var importCallExpression_Original: Detector_ = js.native
  
  def importDeclaration(node: Node): js.Array[String] | String = js.native
  @JSName("importDeclaration")
  var importDeclaration_Original: Detector_ = js.native
  
  def requireCallExpression(node: Node): js.Array[String] | String = js.native
  @JSName("requireCallExpression")
  var requireCallExpression_Original: Detector_ = js.native
  
  def requireResolveCallExpression(node: Node): js.Array[String] | String = js.native
  @JSName("requireResolveCallExpression")
  var requireResolveCallExpression_Original: Detector_ = js.native
  
  def typescriptImportEqualsDeclaration(node: Node): js.Array[String] | String = js.native
  @JSName("typescriptImportEqualsDeclaration")
  var typescriptImportEqualsDeclaration_Original: Detector_ = js.native
  
  def typescriptImportType(node: Node): js.Array[String] | String = js.native
  @JSName("typescriptImportType")
  var typescriptImportType_Original: Detector_ = js.native
}
