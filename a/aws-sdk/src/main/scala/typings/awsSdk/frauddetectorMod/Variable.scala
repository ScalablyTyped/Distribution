package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  /**
    * The time when the variable was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The data source of the variable.
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /**
    * The data type of the variable.
    */
  var dataType: js.UndefOr[DataType] = js.native
  /**
    * The default value of the variable.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The description of the variable. 
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time when variable was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The name of the variable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The variable type of the variable.
    */
  var variableType: js.UndefOr[String] = js.native
}

object Variable {
  @scala.inline
  def apply(
    createdTime: time = null,
    dataSource: DataSource = null,
    dataType: DataType = null,
    defaultValue: String = null,
    description: String = null,
    lastUpdatedTime: time = null,
    name: String = null,
    variableType: String = null
  ): Variable = {
    val __obj = js.Dynamic.literal()
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (variableType != null) __obj.updateDynamic("variableType")(variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

