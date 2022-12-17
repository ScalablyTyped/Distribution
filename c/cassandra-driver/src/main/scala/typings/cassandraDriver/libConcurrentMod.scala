package typings.cassandraDriver

import typings.cassandraDriver.anon.Params
import typings.cassandraDriver.mod.Client
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConcurrentMod {
  
  object concurrent {
    
    @JSImport("cassandra-driver/lib/concurrent", "concurrent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def executeConcurrent(client: Client, queries: js.Array[Params]): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], queries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
    inline def executeConcurrent(client: Client, queries: js.Array[Params], options: Options): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], queries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
    inline def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[Any]]): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
    inline def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[Any]], options: Options): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
    inline def executeConcurrent(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
    inline def executeConcurrent(client: Client, query: String, parameters: Readable, options: Options): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
    
    trait Options extends StObject {
      
      var collectResults: js.UndefOr[Boolean] = js.undefined
      
      var concurrencyLevel: js.UndefOr[Double] = js.undefined
      
      var executionProfile: js.UndefOr[String] = js.undefined
      
      var maxErrors: js.UndefOr[Double] = js.undefined
      
      var raiseOnFirstError: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCollectResults(value: Boolean): Self = StObject.set(x, "collectResults", value.asInstanceOf[js.Any])
        
        inline def setCollectResultsUndefined: Self = StObject.set(x, "collectResults", js.undefined)
        
        inline def setConcurrencyLevel(value: Double): Self = StObject.set(x, "concurrencyLevel", value.asInstanceOf[js.Any])
        
        inline def setConcurrencyLevelUndefined: Self = StObject.set(x, "concurrencyLevel", js.undefined)
        
        inline def setExecutionProfile(value: String): Self = StObject.set(x, "executionProfile", value.asInstanceOf[js.Any])
        
        inline def setExecutionProfileUndefined: Self = StObject.set(x, "executionProfile", js.undefined)
        
        inline def setMaxErrors(value: Double): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
        
        inline def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
        
        inline def setRaiseOnFirstError(value: Boolean): Self = StObject.set(x, "raiseOnFirstError", value.asInstanceOf[js.Any])
        
        inline def setRaiseOnFirstErrorUndefined: Self = StObject.set(x, "raiseOnFirstError", js.undefined)
      }
    }
    
    trait ResultSetGroup extends StObject {
      
      var errors: js.Array[js.Error]
      
      var resultItems: js.Array[Any]
      
      var totalExecuted: Double
    }
    object ResultSetGroup {
      
      inline def apply(errors: js.Array[js.Error], resultItems: js.Array[Any], totalExecuted: Double): ResultSetGroup = {
        val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], resultItems = resultItems.asInstanceOf[js.Any], totalExecuted = totalExecuted.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResultSetGroup]
      }
      
      extension [Self <: ResultSetGroup](x: Self) {
        
        inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
        
        inline def setResultItems(value: js.Array[Any]): Self = StObject.set(x, "resultItems", value.asInstanceOf[js.Any])
        
        inline def setResultItemsVarargs(value: Any*): Self = StObject.set(x, "resultItems", js.Array(value*))
        
        inline def setTotalExecuted(value: Double): Self = StObject.set(x, "totalExecuted", value.asInstanceOf[js.Any])
      }
    }
  }
}
