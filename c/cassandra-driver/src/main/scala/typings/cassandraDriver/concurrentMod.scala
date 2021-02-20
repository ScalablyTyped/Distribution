package typings.cassandraDriver

import typings.cassandraDriver.anon.Params
import typings.cassandraDriver.mod.Client
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concurrentMod {
  
  object concurrent {
    
    @JSImport("cassandra-driver/lib/concurrent", "concurrent.executeConcurrent")
    @js.native
    def executeConcurrent(client: Client, queries: js.Array[Params]): js.Promise[ResultSetGroup] = js.native
    @JSImport("cassandra-driver/lib/concurrent", "concurrent.executeConcurrent")
    @js.native
    def executeConcurrent(client: Client, queries: js.Array[Params], options: Options): js.Promise[ResultSetGroup] = js.native
    @JSImport("cassandra-driver/lib/concurrent", "concurrent.executeConcurrent")
    @js.native
    def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
    @JSImport("cassandra-driver/lib/concurrent", "concurrent.executeConcurrent")
    @js.native
    def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[_]], options: Options): js.Promise[ResultSetGroup] = js.native
    @JSImport("cassandra-driver/lib/concurrent", "concurrent.executeConcurrent")
    @js.native
    def executeConcurrent(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = js.native
    @JSImport("cassandra-driver/lib/concurrent", "concurrent.executeConcurrent")
    @js.native
    def executeConcurrent(client: Client, query: String, parameters: Readable, options: Options): js.Promise[ResultSetGroup] = js.native
    
    @js.native
    trait Options extends StObject {
      
      var collectResults: js.UndefOr[Boolean] = js.native
      
      var concurrencyLevel: js.UndefOr[Double] = js.native
      
      var executionProfile: js.UndefOr[String] = js.native
      
      var maxErrors: js.UndefOr[Double] = js.native
      
      var raiseOnFirstError: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCollectResults(value: Boolean): Self = StObject.set(x, "collectResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollectResultsUndefined: Self = StObject.set(x, "collectResults", js.undefined)
        
        @scala.inline
        def setConcurrencyLevel(value: Double): Self = StObject.set(x, "concurrencyLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConcurrencyLevelUndefined: Self = StObject.set(x, "concurrencyLevel", js.undefined)
        
        @scala.inline
        def setExecutionProfile(value: String): Self = StObject.set(x, "executionProfile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExecutionProfileUndefined: Self = StObject.set(x, "executionProfile", js.undefined)
        
        @scala.inline
        def setMaxErrors(value: Double): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
        
        @scala.inline
        def setRaiseOnFirstError(value: Boolean): Self = StObject.set(x, "raiseOnFirstError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRaiseOnFirstErrorUndefined: Self = StObject.set(x, "raiseOnFirstError", js.undefined)
      }
    }
    
    @js.native
    trait ResultSetGroup extends StObject {
      
      var errors: js.Array[Error] = js.native
      
      var resultItems: js.Array[_] = js.native
      
      var totalExecuted: Double = js.native
    }
    object ResultSetGroup {
      
      @scala.inline
      def apply(errors: js.Array[Error], resultItems: js.Array[_], totalExecuted: Double): ResultSetGroup = {
        val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], resultItems = resultItems.asInstanceOf[js.Any], totalExecuted = totalExecuted.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResultSetGroup]
      }
      
      @scala.inline
      implicit class ResultSetGroupMutableBuilder[Self <: ResultSetGroup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
        
        @scala.inline
        def setResultItems(value: js.Array[_]): Self = StObject.set(x, "resultItems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResultItemsVarargs(value: js.Any*): Self = StObject.set(x, "resultItems", js.Array(value :_*))
        
        @scala.inline
        def setTotalExecuted(value: Double): Self = StObject.set(x, "totalExecuted", value.asInstanceOf[js.Any])
      }
    }
  }
}
