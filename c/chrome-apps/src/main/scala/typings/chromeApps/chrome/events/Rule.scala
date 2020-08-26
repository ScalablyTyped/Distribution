package typings.chromeApps.chrome.events

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a declarative rule for handling events.
  * @template T Type for conditions array, default: any.
  * @template K Type for actions array, default: any.
  */
@js.native
trait Rule[T /* <: js.Object */, K /* <: js.Object */] extends js.Object {
  /** List of actions that are triggered if one of the condtions is fulfilled. */
  var actions: js.Array[K] = js.native
  /** List of conditions that can trigger the actions. */
  var conditions: js.Array[T] = js.native
  /** Identifier that allows referencing this rule.  */
  var id: js.UndefOr[String] = js.native
  /**
    * Optional priority of this rule.
    * @default 100
    */
  var priority: js.UndefOr[integer] = js.native
  /**
    * Tags can be used to annotate rules and perform operations on sets of rules.
    * @since Chrome 28.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object Rule {
  @scala.inline
  def apply[/* <: js.Object */ T, /* <: js.Object */ K](actions: js.Array[K], conditions: js.Array[T]): Rule[T, K] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule[T, K]]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule[_, _], /* <: js.Object */ T, /* <: js.Object */ K] (val x: Self with (Rule[T, K])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: K*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[K]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: T*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[T]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPriority(value: integer): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

