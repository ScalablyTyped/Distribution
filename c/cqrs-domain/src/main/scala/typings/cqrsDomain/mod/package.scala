package typings.cqrsDomain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
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
  
  type defineEventStreamsToLoadHandler = js.Function1[/* cmd */ js.Any, js.Array[typings.cqrsDomain.anon.Aggregate]]
  
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
