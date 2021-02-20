package typings.cqrsDomain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(options: typings.cqrsDomain.mod.CreateDomainOptions): typings.cqrsDomain.mod.CqrsDomain = typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.cqrsDomain.mod.CqrsDomain]
  
  /**
    * @param changed is the new aggregate object
    * @param previous is the old aggregate object
    * @param events is the array with the resulting events
    * @param command the handling command
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type businessRuleHandler = js.Function4[
    /* changed */ typings.cqrsDomain.mod.AggregateModel, 
    /* previous */ typings.cqrsDomain.mod.AggregateModel, 
    /* command */ js.Any, 
    /* callback */ js.UndefOr[
      js.Function1[
        /* err */ java.lang.String | typings.std.Error, 
        java.lang.String | typings.std.Error
      ]
    ], 
    scala.Unit | java.lang.String | typings.std.Error
  ]
  
  type commandHandler = js.Function2[/* data */ js.Any, /* aggregate */ typings.cqrsDomain.mod.AggregateModel, scala.Unit]
  
  /**
    * @param aggId is the aggregate id
    * @param cmd is the command data
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type commandHandlerHandler = js.Function4[
    /* aggId */ java.lang.String, 
    /* cmd */ js.Any, 
    /* commandHandler */ js.Any, 
    /* callback */ js.UndefOr[
      js.Function1[
        /* err */ java.lang.String | typings.std.Error, 
        java.lang.String | typings.std.Error
      ]
    ], 
    scala.Unit | java.lang.String | typings.std.Error
  ]
  
  @scala.inline
  def defineAggregate(options: typings.cqrsDomain.mod.DefineAggregateOptions): typings.cqrsDomain.mod.DefineAggregateResult = typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineAggregate")(options.asInstanceOf[js.Any]).asInstanceOf[typings.cqrsDomain.mod.DefineAggregateResult]
  @scala.inline
  def defineAggregate(options: typings.cqrsDomain.mod.DefineAggregateOptions, initializationData: js.Any): typings.cqrsDomain.mod.DefineAggregateResult = (typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineAggregate")(options.asInstanceOf[js.Any], initializationData.asInstanceOf[js.Any])).asInstanceOf[typings.cqrsDomain.mod.DefineAggregateResult]
  
  @scala.inline
  def defineBusinessRule(
    options: typings.cqrsDomain.mod.DefineBusinessRuleOptions,
    handler: typings.cqrsDomain.mod.businessRuleHandler
  ): scala.Unit = (typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineBusinessRule")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defineCommand(
    options: typings.cqrsDomain.mod.DefineCommandOptions,
    handler: typings.cqrsDomain.mod.commandHandler
  ): typings.cqrsDomain.mod.DefineCommandResult = (typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineCommand")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.cqrsDomain.mod.DefineCommandResult]
  
  @scala.inline
  def defineCommandHandler(
    options: typings.cqrsDomain.mod.DefineCommandHandlerOptions,
    handler: typings.cqrsDomain.mod.commandHandlerHandler
  ): scala.Unit = (typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineCommandHandler")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defineContext(options: typings.cqrsDomain.mod.DefineAggregateOptions): scala.Unit = typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineContext")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defineEvent(options: typings.cqrsDomain.mod.DefineEventOptions, handler: typings.cqrsDomain.mod.eventHandler): scala.Unit = (typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineEvent")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  type defineEventStreamsToLoadHandler = js.Function1[/* cmd */ js.Any, js.Array[typings.cqrsDomain.anon.Aggregate]]
  
  @scala.inline
  def definePreCondition(
    options: typings.cqrsDomain.mod.DefinePreConditionOptions,
    handler: typings.cqrsDomain.mod.preConditionHandler
  ): scala.Unit = (typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("definePreCondition")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def definePreLoadCondition(
    options: typings.cqrsDomain.mod.DefinePreLoadConditionOptions,
    handler: typings.cqrsDomain.mod.preLoadConditionHandler
  ): scala.Unit = (typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("definePreLoadCondition")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * @param loadingTime is the loading time in ms of the eventstore data
    * @param events are all loaded events in an array
    * @param aggregateData represents the aggregateData after applying the resulting events
    */
  type defineSnapshotNeedHandler = js.Function3[
    /* loadingTime */ scala.Double, 
    /* events */ js.Array[js.Any], 
    /* aggregateData */ js.Any, 
    scala.Boolean
  ]
  
  type eventHandler = js.Function2[/* data */ js.Any, /* aggregate */ typings.cqrsDomain.mod.AggregateModel, scala.Unit]
  
  // endregion
  // region extendValidator
  @scala.inline
  def extendValidator(cb: js.Function1[/* validator */ js.Any, scala.Unit]): scala.Unit = typings.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendValidator")(cb.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  type generateIdCallback = js.Function2[/* err */ js.Any, /* id */ java.lang.String, scala.Unit]
  
  /**
    * @param data is the command data
    * @param aggregate is the aggregate object
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type preConditionHandler = js.Function3[
    /* data */ js.Any, 
    /* aggregate */ typings.cqrsDomain.mod.AggregateModel, 
    /* callback */ js.UndefOr[
      js.Function1[
        /* err */ java.lang.String | typings.std.Error, 
        java.lang.String | typings.std.Error
      ]
    ], 
    scala.Unit | java.lang.String | typings.std.Error
  ]
  
  /**
    * @param data is the command data
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type preLoadConditionHandler = js.Function2[
    /* data */ js.Any, 
    /* callback */ js.UndefOr[
      js.Function1[
        /* err */ java.lang.String | typings.std.Error, 
        java.lang.String | typings.std.Error
      ]
    ], 
    scala.Unit | java.lang.String | typings.std.Error
  ]
}
