package typings.cqrsDashDomain

import typings.cqrsDashDomain.Anon_Aggregate
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cqrsDashDomainMod {
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
    /* command */ js.Any, 
    /* callback */ js.UndefOr[js.Function1[/* err */ String | Error, String | Error]], 
    Unit | String | Error
  ]
  type commandHandler = js.Function2[/* data */ js.Any, /* aggregate */ AggregateModel, Unit]
  /**
    * @param aggId is the aggregate id
    * @param cmd is the command data
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type commandHandlerHandler = js.Function4[
    /* aggId */ String, 
    /* cmd */ js.Any, 
    /* commandHandler */ js.Any, 
    /* callback */ js.UndefOr[js.Function1[/* err */ String | Error, String | Error]], 
    Unit | String | Error
  ]
  type defineEventStreamsToLoadHandler = js.Function1[/* cmd */ js.Any, js.Array[Anon_Aggregate]]
  /**
    * @param loadingTime is the loading time in ms of the eventstore data
    * @param events are all loaded events in an array
    * @param aggregateData represents the aggregateData after applying the resulting events
    */
  type defineSnapshotNeedHandler = js.Function3[
    /* loadingTime */ Double, 
    /* events */ js.Array[js.Any], 
    /* aggregateData */ js.Any, 
    Boolean
  ]
  type eventHandler = js.Function2[/* data */ js.Any, /* aggregate */ AggregateModel, Unit]
  type generateIdCallback = js.Function2[/* err */ js.Any, /* id */ String, Unit]
  /**
    * @param data is the command data
    * @param aggregate is the aggregate object
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type preConditionHandler = js.Function3[
    /* data */ js.Any, 
    /* aggregate */ AggregateModel, 
    /* callback */ js.UndefOr[js.Function1[/* err */ String | Error, String | Error]], 
    Unit | String | Error
  ]
  /**
    * @param data is the command data
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type preLoadConditionHandler = js.Function2[
    /* data */ js.Any, 
    /* callback */ js.UndefOr[js.Function1[/* err */ String | Error, String | Error]], 
    Unit | String | Error
  ]
}
