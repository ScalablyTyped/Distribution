package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends js.Object {
  /**
    * The type of the scope.
    */
  var key: js.UndefOr[ScopeType] = js.native
  /**
    * The resource identifier for the specified scope type.
    */
  var value: js.UndefOr[ScopeValue] = js.native
}

object Scope {
  @scala.inline
  def apply(key: ScopeType = null, value: ScopeValue = null): Scope = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

