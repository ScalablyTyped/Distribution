package typings
package cqrsDashDomainLib.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cqrs-domain", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: CreateDomainOptions): CqrsDomain = js.native
  def defineAggregate(options: DefineAggregateOptions): DefineAggregateResult = js.native
  def defineAggregate(options: DefineAggregateOptions, initializationData: js.Any): DefineAggregateResult = js.native
  def defineBusinessRule(options: DefineBusinessRuleOptions, handler: businessRuleHandler): scala.Unit = js.native
  def defineCommand(options: DefineCommandOptions, handler: commandHandler): DefineCommandResult = js.native
  def defineCommandHandler(options: DefineCommandHandlerOptions, handler: commandHandlerHandler): scala.Unit = js.native
  def defineContext(options: DefineAggregateOptions): scala.Unit = js.native
  def defineEvent(options: DefineEventOptions, handler: eventHandler): scala.Unit = js.native
  def definePreCondition(options: DefinePreConditionOptions, handler: preConditionHandler): scala.Unit = js.native
  def definePreLoadCondition(options: DefinePreLoadConditionOptions, handler: preLoadConditionHandler): scala.Unit = js.native
  // endregion
  // region extendValidator
  def extendValidator(cb: js.Function1[/* validator */ js.Any, scala.Unit]): scala.Unit = js.native
}

