package typings
package depcheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ExpressViewEngine extends js.Object {
  @JSName("expressViewEngine")
  var expressViewEngine_Original: depcheckLib.depcheckMod.depcheckNs.Detector = js.native
  @JSName("gruntLoadTaskCallExpression")
  var gruntLoadTaskCallExpression_Original: depcheckLib.depcheckMod.depcheckNs.Detector = js.native
  @JSName("importDeclaration")
  var importDeclaration_Original: depcheckLib.depcheckMod.depcheckNs.Detector = js.native
  @JSName("requireCallExpression")
  var requireCallExpression_Original: depcheckLib.depcheckMod.depcheckNs.Detector = js.native
  @JSName("requireResolveCallExpression")
  var requireResolveCallExpression_Original: depcheckLib.depcheckMod.depcheckNs.Detector = js.native
  def expressViewEngine(node: depcheckLib.depcheckMod.depcheckNs.Node): js.Array[java.lang.String] | java.lang.String = js.native
  def gruntLoadTaskCallExpression(node: depcheckLib.depcheckMod.depcheckNs.Node): js.Array[java.lang.String] | java.lang.String = js.native
  def importDeclaration(node: depcheckLib.depcheckMod.depcheckNs.Node): js.Array[java.lang.String] | java.lang.String = js.native
  def requireCallExpression(node: depcheckLib.depcheckMod.depcheckNs.Node): js.Array[java.lang.String] | java.lang.String = js.native
  def requireResolveCallExpression(node: depcheckLib.depcheckMod.depcheckNs.Node): js.Array[java.lang.String] | java.lang.String = js.native
}

