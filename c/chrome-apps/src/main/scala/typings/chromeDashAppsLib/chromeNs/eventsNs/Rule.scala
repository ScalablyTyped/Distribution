package typings
package chromeDashAppsLib.chromeNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a declarative rule for handling events.
  * @template T Type for conditions array, default: any.
  * @template K Type for actions array, default: any.
  */
trait Rule[T /* <: js.Object */, K /* <: js.Object */] extends js.Object {
  /** List of actions that are triggered if one of the condtions is fulfilled. */
  var actions: js.Array[K]
  /** List of conditions that can trigger the actions. */
  var conditions: js.Array[T]
  /** Identifier that allows referencing this rule.  */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional priority of this rule.
    * @default 100
    */
  var priority: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * Tags can be used to annotate rules and perform operations on sets of rules.
    * @since Chrome 28.
    */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Rule {
  @scala.inline
  def apply[T /* <: js.Object */, K /* <: js.Object */](
    actions: js.Array[K],
    conditions: js.Array[T],
    id: java.lang.String = null,
    priority: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    tags: js.Array[java.lang.String] = null
  ): Rule[T, K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("conditions")(conditions)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Rule[T, K]]
  }
}

