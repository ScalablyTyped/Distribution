package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListTablesInputMod {
  
  trait ListTablesInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The first table name that this operation will evaluate. Use the value that was returned for <code>LastEvaluatedTableName</code> in a previous operation, so that you can obtain the next page of results.</p>
      */
    var ExclusiveStartTableName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A maximum number of table names to return. If this parameter is not specified, the limit is 100.</p>
      */
    var Limit: js.UndefOr[Double] = js.undefined
  }
  object ListTablesInput {
    
    inline def apply(): ListTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTablesInput]
    }
    
    extension [Self <: ListTablesInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setExclusiveStartTableName(value: String): Self = StObject.set(x, "ExclusiveStartTableName", value.asInstanceOf[js.Any])
      
      inline def setExclusiveStartTableNameUndefined: Self = StObject.set(x, "ExclusiveStartTableName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    }
  }
}
