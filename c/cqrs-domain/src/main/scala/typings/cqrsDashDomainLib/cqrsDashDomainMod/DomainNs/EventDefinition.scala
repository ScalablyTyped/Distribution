package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDefinition extends js.Object {
  /**
    * optional, only makes sense if aggregates with names are defined in the 'domainPath' structure
    */
  var aggregate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is 'aggregate.id'
    */
  var aggregateId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, if defined the commit date of the eventstore will be saved in this value
    */
  var commitStamp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, only makes sense if contexts are defined in the 'domainPath' structure
    */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is 'correlationId'
    * will use the command id as correlationId, so you can match it in the sender
    */
  var correlationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is 'id'
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, if defined the values of the command will be copied to the event (can be used to transport information like userId, etc..)
    */
  var meta: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is 'name'
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is 'payload'
    */
  var payload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is 'revision'
    * will represent the aggregate revision, can be used in next command
    */
  var revision: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

