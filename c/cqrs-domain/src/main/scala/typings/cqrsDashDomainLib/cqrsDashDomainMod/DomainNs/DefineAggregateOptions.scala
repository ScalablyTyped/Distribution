package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

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
  var applyLastEvent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional, default ''
    */
  var defaultCommandPayload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default ''
    */
  var defaultEventPayload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default ''
    */
  var defaultPreConditionPayload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default false
    * will publish the events but will not commit them to the eventstore
    */
  var disablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional, default is last part of path name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default false
    * by skipping the history, only the last event will be loaded and defaultly not applyed (just to ensure the revision number increment)
    */
  var skipHistory: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional, default 0
    */
  var version: js.UndefOr[scala.Double] = js.undefined
}

