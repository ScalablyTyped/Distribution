package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesErrorDocumentMod.UnmarshalledErrorDocument
import typings.awsSdkClientS3Node.typesIndexDocumentMod.UnmarshalledIndexDocument
import typings.awsSdkClientS3Node.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typings.awsSdkClientS3Node.typesRoutingRuleMod.UnmarshalledRoutingRule
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketWebsiteOutputMod {
  
  @js.native
  trait GetBucketWebsiteOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _ErrorDocument shape
      */
    var ErrorDocument: js.UndefOr[UnmarshalledErrorDocument] = js.native
    
    /**
      * _IndexDocument shape
      */
    var IndexDocument: js.UndefOr[UnmarshalledIndexDocument] = js.native
    
    /**
      * _RedirectAllRequestsTo shape
      */
    var RedirectAllRequestsTo: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.native
    
    /**
      * _RoutingRules shape
      */
    var RoutingRules: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.native
  }
  object GetBucketWebsiteOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketWebsiteOutput]
    }
    
    @scala.inline
    implicit class GetBucketWebsiteOutputMutableBuilder[Self <: GetBucketWebsiteOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorDocument(value: UnmarshalledErrorDocument): Self = StObject.set(x, "ErrorDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDocumentUndefined: Self = StObject.set(x, "ErrorDocument", js.undefined)
      
      @scala.inline
      def setIndexDocument(value: UnmarshalledIndexDocument): Self = StObject.set(x, "IndexDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexDocumentUndefined: Self = StObject.set(x, "IndexDocument", js.undefined)
      
      @scala.inline
      def setRedirectAllRequestsTo(value: UnmarshalledRedirectAllRequestsTo): Self = StObject.set(x, "RedirectAllRequestsTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "RedirectAllRequestsTo", js.undefined)
      
      @scala.inline
      def setRoutingRules(value: js.Array[UnmarshalledRoutingRule]): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
      
      @scala.inline
      def setRoutingRulesVarargs(value: UnmarshalledRoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value :_*))
    }
  }
}
