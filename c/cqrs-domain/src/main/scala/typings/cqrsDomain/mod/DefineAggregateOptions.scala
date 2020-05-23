package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineAggregate
trait DefineAggregateOptions extends js.Object {
  /**
    * optional, default false
    * only optionally needed when skipHistory is set to true, only the last event will be loaded and applyed
    */
  var applyLastEvent: js.UndefOr[Boolean] = js.undefined
  /**
    * optional, default ''
    */
  var defaultCommandPayload: js.UndefOr[String] = js.undefined
  /**
    * optional, default ''
    */
  var defaultEventPayload: js.UndefOr[String] = js.undefined
  /**
    * optional, default ''
    */
  var defaultPreConditionPayload: js.UndefOr[String] = js.undefined
  /**
    * optional, default false
    * will publish the events but will not commit them to the eventstore
    */
  var disablePersistence: js.UndefOr[Boolean] = js.undefined
  /**
    * optional, default is last part of path name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * optional, default false
    * by skipping the history, only the last event will be loaded and defaultly not applyed (just to ensure the revision number increment)
    */
  var skipHistory: js.UndefOr[Boolean] = js.undefined
  /**
    * optional, default 0
    */
  var version: js.UndefOr[Double] = js.undefined
}

object DefineAggregateOptions {
  @scala.inline
  def apply(
    applyLastEvent: js.UndefOr[Boolean] = js.undefined,
    defaultCommandPayload: String = null,
    defaultEventPayload: String = null,
    defaultPreConditionPayload: String = null,
    disablePersistence: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    skipHistory: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): DefineAggregateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyLastEvent)) __obj.updateDynamic("applyLastEvent")(applyLastEvent.get.asInstanceOf[js.Any])
    if (defaultCommandPayload != null) __obj.updateDynamic("defaultCommandPayload")(defaultCommandPayload.asInstanceOf[js.Any])
    if (defaultEventPayload != null) __obj.updateDynamic("defaultEventPayload")(defaultEventPayload.asInstanceOf[js.Any])
    if (defaultPreConditionPayload != null) __obj.updateDynamic("defaultPreConditionPayload")(defaultPreConditionPayload.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePersistence)) __obj.updateDynamic("disablePersistence")(disablePersistence.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHistory)) __obj.updateDynamic("skipHistory")(skipHistory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAggregateOptions]
  }
}

