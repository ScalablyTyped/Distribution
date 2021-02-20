package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesTelemetryRecordMod.TelemetryRecord
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutTelemetryRecordsInputMod {
  
  @js.native
  trait PutTelemetryRecordsInput extends InputTypesUnion {
    
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
      * <p/>
      */
    var EC2InstanceId: js.UndefOr[String] = js.native
    
    /**
      * <p/>
      */
    var Hostname: js.UndefOr[String] = js.native
    
    /**
      * <p/>
      */
    var ResourceARN: js.UndefOr[String] = js.native
    
    /**
      * <p/>
      */
    var TelemetryRecords: js.Array[TelemetryRecord] | Iterable[TelemetryRecord] = js.native
  }
  object PutTelemetryRecordsInput {
    
    @scala.inline
    def apply(TelemetryRecords: js.Array[TelemetryRecord] | Iterable[TelemetryRecord]): PutTelemetryRecordsInput = {
      val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutTelemetryRecordsInput]
    }
    
    @scala.inline
    implicit class PutTelemetryRecordsInputMutableBuilder[Self <: PutTelemetryRecordsInput] (val x: Self) extends AnyVal {
      
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
      def setEC2InstanceId(value: String): Self = StObject.set(x, "EC2InstanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEC2InstanceIdUndefined: Self = StObject.set(x, "EC2InstanceId", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
      
      @scala.inline
      def setResourceARN(value: String): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
      
      @scala.inline
      def setTelemetryRecords(value: js.Array[TelemetryRecord] | Iterable[TelemetryRecord]): Self = StObject.set(x, "TelemetryRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelemetryRecordsVarargs(value: TelemetryRecord*): Self = StObject.set(x, "TelemetryRecords", js.Array(value :_*))
    }
  }
}
