package typings.cqrsDashDomain.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cqrs-domain", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: CreateDomainOptions): CqrsDomain = js.native
  def defineAggregate(options: DefineAggregateOptions): DefineAggregateResult = js.native
  def defineAggregate(options: DefineAggregateOptions, initializationData: js.Any): DefineAggregateResult = js.native
  def defineBusinessRule(options: DefineBusinessRuleOptions, handler: businessRuleHandler): Unit = js.native
  def defineCommand(options: DefineCommandOptions, handler: commandHandler): DefineCommandResult = js.native
  def defineCommandHandler(options: DefineCommandHandlerOptions, handler: commandHandlerHandler): Unit = js.native
  def defineContext(options: DefineAggregateOptions): Unit = js.native
  def defineEvent(options: DefineEventOptions, handler: eventHandler): Unit = js.native
  def definePreCondition(options: DefinePreConditionOptions, handler: preConditionHandler): Unit = js.native
  def definePreLoadCondition(options: DefinePreLoadConditionOptions, handler: preLoadConditionHandler): Unit = js.native
  // endregion
  // region extendValidator
  def extendValidator(cb: js.Function1[/* validator */ js.Any, Unit]): Unit = js.native
}

