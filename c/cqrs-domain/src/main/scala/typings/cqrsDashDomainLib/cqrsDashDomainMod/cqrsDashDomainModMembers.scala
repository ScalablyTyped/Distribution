package typings
package cqrsDashDomainLib.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cqrs-domain", JSImport.Namespace)
@js.native
object cqrsDashDomainModMembers extends js.Object {
  def apply(options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.CreateDomainOptions): cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.CqrsDomain = js.native
  def defineAggregate(options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineAggregateOptions): cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineAggregateResult = js.native
  def defineAggregate(
    options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineAggregateOptions,
    initializationData: js.Any
  ): cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineAggregateResult = js.native
  def defineBusinessRule(
    options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineBusinessRuleOptions,
    handler: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.businessRuleHandler
  ): scala.Unit = js.native
  def defineCommand(
    options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineCommandOptions,
    handler: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.commandHandler
  ): cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineCommandResult = js.native
  def defineCommandHandler(
    options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineCommandHandlerOptions,
    handler: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.commandHandlerHandler
  ): scala.Unit = js.native
  def defineContext(options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineAggregateOptions): scala.Unit = js.native
  def defineEvent(
    options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefineEventOptions,
    handler: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.eventHandler
  ): scala.Unit = js.native
  def definePreCondition(
    options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefinePreConditionOptions,
    handler: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.preConditionHandler
  ): scala.Unit = js.native
  def definePreLoadCondition(
    options: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.DefinePreLoadConditionOptions,
    handler: cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.preLoadConditionHandler
  ): scala.Unit = js.native
  // endregion
  // region extendValidator
  def extendValidator(cb: js.Function1[/* validator */ js.Any, scala.Unit]): scala.Unit = js.native
}

