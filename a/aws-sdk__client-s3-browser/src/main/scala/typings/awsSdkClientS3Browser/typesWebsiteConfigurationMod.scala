package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesErrorDocumentMod.ErrorDocument
import typings.awsSdkClientS3Browser.typesErrorDocumentMod.UnmarshalledErrorDocument
import typings.awsSdkClientS3Browser.typesIndexDocumentMod.IndexDocument
import typings.awsSdkClientS3Browser.typesIndexDocumentMod.UnmarshalledIndexDocument
import typings.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
import typings.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typings.awsSdkClientS3Browser.typesRoutingRuleMod.RoutingRule
import typings.awsSdkClientS3Browser.typesRoutingRuleMod.UnmarshalledRoutingRule
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWebsiteConfigurationMod {
  
  trait UnmarshalledWebsiteConfiguration
    extends StObject
       with WebsiteConfiguration {
    
    /**
      * _ErrorDocument shape
      */
    @JSName("ErrorDocument")
    var ErrorDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledErrorDocument] = js.undefined
    
    /**
      * _IndexDocument shape
      */
    @JSName("IndexDocument")
    var IndexDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledIndexDocument] = js.undefined
    
    /**
      * _RedirectAllRequestsTo shape
      */
    @JSName("RedirectAllRequestsTo")
    var RedirectAllRequestsTo_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.undefined
    
    /**
      * _RoutingRules shape
      */
    @JSName("RoutingRules")
    var RoutingRules_UnmarshalledWebsiteConfiguration: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.undefined
  }
  object UnmarshalledWebsiteConfiguration {
    
    @scala.inline
    def apply(): UnmarshalledWebsiteConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWebsiteConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledWebsiteConfigurationMutableBuilder[Self <: UnmarshalledWebsiteConfiguration] (val x: Self) extends AnyVal {
      
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
  
  trait WebsiteConfiguration extends StObject {
    
    /**
      * _ErrorDocument shape
      */
    var ErrorDocument: js.UndefOr[typings.awsSdkClientS3Browser.typesErrorDocumentMod.ErrorDocument] = js.undefined
    
    /**
      * _IndexDocument shape
      */
    var IndexDocument: js.UndefOr[typings.awsSdkClientS3Browser.typesIndexDocumentMod.IndexDocument] = js.undefined
    
    /**
      * _RedirectAllRequestsTo shape
      */
    var RedirectAllRequestsTo: js.UndefOr[
        typings.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
      ] = js.undefined
    
    /**
      * _RoutingRules shape
      */
    var RoutingRules: js.UndefOr[js.Array[RoutingRule] | Iterable[RoutingRule]] = js.undefined
  }
  object WebsiteConfiguration {
    
    @scala.inline
    def apply(): WebsiteConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebsiteConfiguration]
    }
    
    @scala.inline
    implicit class WebsiteConfigurationMutableBuilder[Self <: WebsiteConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorDocument(value: ErrorDocument): Self = StObject.set(x, "ErrorDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDocumentUndefined: Self = StObject.set(x, "ErrorDocument", js.undefined)
      
      @scala.inline
      def setIndexDocument(value: IndexDocument): Self = StObject.set(x, "IndexDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexDocumentUndefined: Self = StObject.set(x, "IndexDocument", js.undefined)
      
      @scala.inline
      def setRedirectAllRequestsTo(value: RedirectAllRequestsTo): Self = StObject.set(x, "RedirectAllRequestsTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "RedirectAllRequestsTo", js.undefined)
      
      @scala.inline
      def setRoutingRules(value: js.Array[RoutingRule] | Iterable[RoutingRule]): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
      
      @scala.inline
      def setRoutingRulesVarargs(value: RoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value :_*))
    }
  }
}
