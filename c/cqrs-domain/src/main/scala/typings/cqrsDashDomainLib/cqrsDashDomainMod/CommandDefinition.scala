package typings
package cqrsDashDomainLib.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region Domain itself
trait CommandDefinition extends js.Object {
  /**
    * optional, only makes sense if aggregates with names are defined in the 'domainPath' structure
    */
  var aggregate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is 'aggregate.id'
    * if an aggregate id is not defined in the command, the command handler will create a new aggregate instance
    */
  var aggregateId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, only makes sense if contexts are defined in the 'domainPath' structure
    */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is 'id'
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, if defined theses values will be copied to the event (can be used to transport information like userId, etc..)
    */
  var meta: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is 'name'
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, but recommended
    */
  var payload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, if defined the command handler will check if the command can be handled
    * if you want the command to be handled in a secure/transactional way pass a revision value that matches the current aggregate revision
    */
  var revision: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, if defined the command handler will search for a handle that matches command name and version number
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object CommandDefinition {
  @scala.inline
  def apply(
    aggregate: java.lang.String = null,
    aggregateId: java.lang.String = null,
    context: java.lang.String = null,
    id: java.lang.String = null,
    meta: java.lang.String = null,
    name: java.lang.String = null,
    payload: java.lang.String = null,
    revision: java.lang.String = null,
    version: java.lang.String = null
  ): CommandDefinition = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (aggregateId != null) __obj.updateDynamic("aggregateId")(aggregateId)
    if (context != null) __obj.updateDynamic("context")(context)
    if (id != null) __obj.updateDynamic("id")(id)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (name != null) __obj.updateDynamic("name")(name)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CommandDefinition]
  }
}

