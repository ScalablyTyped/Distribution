package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketWebsiteOutput extends StObject {
  
  /**
    * The object key name of the website error document to use for 4XX class errors.
    */
  var ErrorDocument: js.UndefOr[typings.awsSdk.s3Mod.ErrorDocument] = js.native
  
  /**
    * The name of the index document for the website (for example index.html).
    */
  var IndexDocument: js.UndefOr[typings.awsSdk.s3Mod.IndexDocument] = js.native
  
  /**
    * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
    */
  var RedirectAllRequestsTo: js.UndefOr[typings.awsSdk.s3Mod.RedirectAllRequestsTo] = js.native
  
  /**
    * Rules that define when a redirect is applied and the redirect behavior.
    */
  var RoutingRules: js.UndefOr[typings.awsSdk.s3Mod.RoutingRules] = js.native
}
object GetBucketWebsiteOutput {
  
  @scala.inline
  def apply(): GetBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketWebsiteOutput]
  }
  
  @scala.inline
  implicit class GetBucketWebsiteOutputMutableBuilder[Self <: GetBucketWebsiteOutput] (val x: Self) extends AnyVal {
    
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
    def setRoutingRules(value: RoutingRules): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
    
    @scala.inline
    def setRoutingRulesVarargs(value: RoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value :_*))
  }
}
