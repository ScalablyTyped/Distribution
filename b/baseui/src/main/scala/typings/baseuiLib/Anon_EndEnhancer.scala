package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndEnhancer extends js.Object {
  var EndEnhancer: js.UndefOr[Override[_]] = js.undefined
  var Root: js.UndefOr[Override[_]] = js.undefined
  var StartEnhancer: js.UndefOr[Override[_]] = js.undefined
}

object Anon_EndEnhancer {
  @scala.inline
  def apply(EndEnhancer: Override[_] = null, Root: Override[_] = null, StartEnhancer: Override[_] = null): Anon_EndEnhancer = {
    val __obj = js.Dynamic.literal()
    if (EndEnhancer != null) __obj.updateDynamic("EndEnhancer")(EndEnhancer.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (StartEnhancer != null) __obj.updateDynamic("StartEnhancer")(StartEnhancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndEnhancer]
  }
}

