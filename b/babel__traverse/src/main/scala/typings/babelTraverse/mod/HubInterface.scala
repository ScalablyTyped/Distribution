package typings.babelTraverse.mod

import typings.std.Error
import typings.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HubInterface extends js.Object {
  def addHelper(name: String): js.Any
  def buildError(node: js.Any, msg: String, Error: ErrorConstructor): Error
  def getCode(): js.UndefOr[String]
  def getScope(): js.UndefOr[Scope]
}

object HubInterface {
  @scala.inline
  def apply(
    addHelper: String => js.Any,
    buildError: (js.Any, String, ErrorConstructor) => Error,
    getCode: () => js.UndefOr[String],
    getScope: () => js.UndefOr[Scope]
  ): HubInterface = {
    val __obj = js.Dynamic.literal(addHelper = js.Any.fromFunction1(addHelper), buildError = js.Any.fromFunction3(buildError), getCode = js.Any.fromFunction0(getCode), getScope = js.Any.fromFunction0(getScope))
    __obj.asInstanceOf[HubInterface]
  }
}

