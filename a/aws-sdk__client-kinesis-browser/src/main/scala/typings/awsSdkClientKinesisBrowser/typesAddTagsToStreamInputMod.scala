package typings.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddTagsToStreamInputMod {
  
  trait AddTagsToStreamInput
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
      * <p>The name of the stream.</p>
      */
    var StreamName: String
    
    /**
      * <p>A set of up to 10 key-value pairs to use to create the tags.</p>
      */
    var Tags: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])
  }
  object AddTagsToStreamInput {
    
    inline def apply(StreamName: String, Tags: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): AddTagsToStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddTagsToStreamInput]
    }
    
    extension [Self <: AddTagsToStreamInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    }
  }
}
