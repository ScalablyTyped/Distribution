package typings
package chromeLib.chromeNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /** List of actions that are triggered if one of the condtions is fulfilled. */
  var actions: js.Array[_]
  /** List of conditions that can trigger the actions. */
  var conditions: js.Array[_]
  /** Optional. Optional identifier that allows referencing this rule.  */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Optional priority of this rule. Defaults to 100.  */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional.
    * Since Chrome 28.
    * Tags can be used to annotate rules and perform operations on sets of rules.
    */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    actions: js.Array[_],
    conditions: js.Array[_],
    id: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    tags: js.Array[java.lang.String] = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("conditions")(conditions)
    if (id != null) __obj.updateDynamic("id")(id)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Rule]
  }
}

