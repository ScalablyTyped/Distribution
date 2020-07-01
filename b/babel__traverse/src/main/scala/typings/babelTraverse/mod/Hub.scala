package typings.babelTraverse.mod

import typings.std.Error
import typings.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/traverse", "Hub")
@js.native
class Hub protected () extends HubInterface {
  def this(file: js.Any, options: js.Any) = this()
  var file: js.Any = js.native
  var options: js.Any = js.native
  /* CompleteClass */
  override def addHelper(name: String): js.Any = js.native
  /* CompleteClass */
  override def buildError(node: js.Any, msg: String, Error: ErrorConstructor): Error = js.native
  /* CompleteClass */
  override def getCode(): js.UndefOr[String] = js.native
  /* CompleteClass */
  override def getScope(): js.UndefOr[Scope] = js.native
}

