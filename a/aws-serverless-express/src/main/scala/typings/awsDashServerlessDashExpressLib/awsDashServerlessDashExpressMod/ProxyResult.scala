package typings
package awsDashServerlessDashExpressLib.awsDashServerlessDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyResult extends js.Object {
  var promise: js.Promise[Response]
}

object ProxyResult {
  @scala.inline
  def apply(promise: js.Promise[Response]): ProxyResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[ProxyResult]
  }
}

