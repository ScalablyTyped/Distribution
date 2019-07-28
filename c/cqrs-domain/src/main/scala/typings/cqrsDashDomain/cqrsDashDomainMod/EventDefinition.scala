package typings.cqrsDashDomain.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDefinition extends js.Object {
  /**
    * optional, only makes sense if aggregates with names are defined in the 'domainPath' structure
    */
  var aggregate: js.UndefOr[String] = js.undefined
  /**
    * optional, default is 'aggregate.id'
    */
  var aggregateId: js.UndefOr[String] = js.undefined
  /**
    * optional, if defined the commit date of the eventstore will be saved in this value
    */
  var commitStamp: js.UndefOr[String] = js.undefined
  /**
    * optional, only makes sense if contexts are defined in the 'domainPath' structure
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * optional, default is 'correlationId'
    * will use the command id as correlationId, so you can match it in the sender
    */
  var correlationId: js.UndefOr[String] = js.undefined
  /**
    * optional, default is 'id'
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * optional, if defined the values of the command will be copied to the event (can be used to transport information like userId, etc..)
    */
  var meta: js.UndefOr[String] = js.undefined
  /**
    * optional, default is 'name'
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * optional, default is 'payload'
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * optional, default is 'revision'
    * will represent the aggregate revision, can be used in next command
    */
  var revision: js.UndefOr[String] = js.undefined
  /**
    * optional
    */
  var version: js.UndefOr[String] = js.undefined
}

object EventDefinition {
  @scala.inline
  def apply(
    aggregate: String = null,
    aggregateId: String = null,
    commitStamp: String = null,
    context: String = null,
    correlationId: String = null,
    id: String = null,
    meta: String = null,
    name: String = null,
    payload: String = null,
    revision: String = null,
    version: String = null
  ): EventDefinition = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (aggregateId != null) __obj.updateDynamic("aggregateId")(aggregateId)
    if (commitStamp != null) __obj.updateDynamic("commitStamp")(commitStamp)
    if (context != null) __obj.updateDynamic("context")(context)
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (name != null) __obj.updateDynamic("name")(name)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[EventDefinition]
  }
}

