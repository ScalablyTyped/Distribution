package typings
package depcheckLib.depcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("depcheck", "detector")
@js.native
object detector extends js.Object {
  @JSName("expressViewEngine")
  var expressViewEngine_Original: depcheckLib.depcheckMod.Detector = js.native
  @JSName("gruntLoadTaskCallExpression")
  var gruntLoadTaskCallExpression_Original: depcheckLib.depcheckMod.Detector = js.native
  @JSName("importDeclaration")
  var importDeclaration_Original: depcheckLib.depcheckMod.Detector = js.native
  @JSName("requireCallExpression")
  var requireCallExpression_Original: depcheckLib.depcheckMod.Detector = js.native
  @JSName("requireResolveCallExpression")
  var requireResolveCallExpression_Original: depcheckLib.depcheckMod.Detector = js.native
  def expressViewEngine(node: depcheckLib.depcheckMod.Node): js.Array[java.lang.String] | java.lang.String = js.native
  def gruntLoadTaskCallExpression(node: depcheckLib.depcheckMod.Node): js.Array[java.lang.String] | java.lang.String = js.native
  def importDeclaration(node: depcheckLib.depcheckMod.Node): js.Array[java.lang.String] | java.lang.String = js.native
  def requireCallExpression(node: depcheckLib.depcheckMod.Node): js.Array[java.lang.String] | java.lang.String = js.native
  def requireResolveCallExpression(node: depcheckLib.depcheckMod.Node): js.Array[java.lang.String] | java.lang.String = js.native
}

