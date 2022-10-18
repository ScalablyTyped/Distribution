package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoverySpecificationMod.PointInTimeRecoverySpecification
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateContinuousBackupsInputMod {
  
  trait UpdateContinuousBackupsInput
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
      * <p>Represents the settings used to enable point in time recovery.</p>
      */
    var PointInTimeRecoverySpecification: typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoverySpecificationMod.PointInTimeRecoverySpecification
    
    /**
      * <p>The name of the table.</p>
      */
    var TableName: String
  }
  object UpdateContinuousBackupsInput {
    
    inline def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: String): UpdateContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateContinuousBackupsInput]
    }
    
    extension [Self <: UpdateContinuousBackupsInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setPointInTimeRecoverySpecification(value: PointInTimeRecoverySpecification): Self = StObject.set(x, "PointInTimeRecoverySpecification", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
}
