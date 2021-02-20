package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListGlobalTablesInputMod {
  
  @js.native
  trait ListGlobalTablesInput extends InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * <p>The first global table name that this operation will evaluate.</p>
      */
    var ExclusiveStartGlobalTableName: js.UndefOr[String] = js.native
    
    /**
      * <p>The maximum number of table names to return.</p>
      */
    var Limit: js.UndefOr[Double] = js.native
    
    /**
      * <p>Lists the global tables in a specific region.</p>
      */
    var RegionName: js.UndefOr[String] = js.native
  }
  object ListGlobalTablesInput {
    
    @scala.inline
    def apply(): ListGlobalTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGlobalTablesInput]
    }
    
    @scala.inline
    implicit class ListGlobalTablesInputMutableBuilder[Self <: ListGlobalTablesInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setExclusiveStartGlobalTableName(value: String): Self = StObject.set(x, "ExclusiveStartGlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveStartGlobalTableNameUndefined: Self = StObject.set(x, "ExclusiveStartGlobalTableName", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      @scala.inline
      def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    }
  }
}
