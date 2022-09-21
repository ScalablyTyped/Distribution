package typings.cqrsDomain.mod

import typings.cqrsDomain.anon.Aggregate
import typings.cqrsDomain.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(options: CreateDomainOptions): CqrsDomain = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CqrsDomain]

inline def defineAggregate(options: DefineAggregateOptions): DefineAggregateResult = ^.asInstanceOf[js.Dynamic].applyDynamic("defineAggregate")(options.asInstanceOf[js.Any]).asInstanceOf[DefineAggregateResult]
inline def defineAggregate(options: DefineAggregateOptions, initializationData: Any): DefineAggregateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAggregate")(options.asInstanceOf[js.Any], initializationData.asInstanceOf[js.Any])).asInstanceOf[DefineAggregateResult]

inline def defineBusinessRule(options: DefineBusinessRuleOptions, handler: businessRuleHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineBusinessRule")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def defineCommand(options: DefineCommandOptions, handler: commandHandler): DefineCommandResult = (^.asInstanceOf[js.Dynamic].applyDynamic("defineCommand")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[DefineCommandResult]

inline def defineCommandHandler(options: DefineCommandHandlerOptions, handler: commandHandlerHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineCommandHandler")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def defineContext(options: DefineAggregateOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defineContext")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def defineEvent(options: DefineEventOptions, handler: eventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineEvent")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def definePreCondition(options: DefinePreConditionOptions, handler: preConditionHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("definePreCondition")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def definePreLoadCondition(options: DefinePreLoadConditionOptions, handler: preLoadConditionHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("definePreLoadCondition")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

// endregion
// region extendValidator
inline def extendValidator(cb: js.Function1[/* validator */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendValidator")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * @param changed is the new aggregate object
  * @param previous is the old aggregate object
  * @param events is the array with the resulting events
  * @param command the handling command
  * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
  */
type businessRuleHandler = js.Function4[
/* changed */ AggregateModel, 
/* previous */ AggregateModel, 
/* command */ Any, 
/* callback */ js.UndefOr[js.Function1[/* err */ String | js.Error, String | js.Error]], 
Unit | String | js.Error]

type commandHandler = js.Function2[/* data */ Any, /* aggregate */ AggregateModel, Unit]

/**
  * @param aggId is the aggregate id
  * @param cmd is the command data
  * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
  */
type commandHandlerHandler = js.Function4[
/* aggId */ String, 
/* cmd */ Any, 
/* commandHandler */ Any, 
/* callback */ js.UndefOr[js.Function1[/* err */ String | js.Error, String | js.Error]], 
Unit | String | js.Error]

type defineEventStreamsToLoadHandler = js.Function1[/* cmd */ Any, js.Array[Aggregate]]

/**
  * @param loadingTime is the loading time in ms of the eventstore data
  * @param events are all loaded events in an array
  * @param aggregateData represents the aggregateData after applying the resulting events
  */
type defineSnapshotNeedHandler = js.Function3[/* loadingTime */ Double, /* events */ js.Array[Any], /* aggregateData */ Any, Boolean]

type eventHandler = js.Function2[/* data */ Any, /* aggregate */ AggregateModel, Unit]

type generateIdCallback = js.Function2[/* err */ Any, /* id */ String, Unit]

/**
  * @param data is the command data
  * @param aggregate is the aggregate object
  * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
  */
type preConditionHandler = js.Function3[
/* data */ Any, 
/* aggregate */ AggregateModel, 
/* callback */ js.UndefOr[js.Function1[/* err */ String | js.Error, String | js.Error]], 
Unit | String | js.Error]

/**
  * @param data is the command data
  * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
  */
type preLoadConditionHandler = js.Function2[
/* data */ Any, 
/* callback */ js.UndefOr[js.Function1[/* err */ String | js.Error, String | js.Error]], 
Unit | String | js.Error]
