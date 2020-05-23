package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region definePreCondition
trait DefinePreLoadConditionOptions extends js.Object {
  /**
    * optional
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * the command name
    * optional, default is file name without extension,
    * if name is '' it will handle all commands that matches the appropriate aggregate
    * if name is an array of strings it will handle all commands that matches the appropriate name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * optional, if not defined it will use what is defined as default in aggregate or pass the whole command
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * optional, default Infinity, all pre-conditions will be sorted by this value
    */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    * optional, default 0
    */
  var version: js.UndefOr[Double] = js.undefined
}

object DefinePreLoadConditionOptions {
  @scala.inline
  def apply(
    description: String = null,
    name: String = null,
    payload: String = null,
    priority: js.UndefOr[Double] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): DefinePreLoadConditionOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinePreLoadConditionOptions]
  }
}

