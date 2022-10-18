package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod.WriteCampaignRequest
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateCampaignInputMod {
  
  trait CreateCampaignInput
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
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: String
    
    /**
      * Used to create a campaign.
      */
    var WriteCampaignRequest: typings.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod.WriteCampaignRequest
  }
  object CreateCampaignInput {
    
    inline def apply(ApplicationId: String, WriteCampaignRequest: WriteCampaignRequest): CreateCampaignInput = {
      val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCampaignInput]
    }
    
    extension [Self <: CreateCampaignInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setWriteCampaignRequest(value: WriteCampaignRequest): Self = StObject.set(x, "WriteCampaignRequest", value.asInstanceOf[js.Any])
    }
  }
}
