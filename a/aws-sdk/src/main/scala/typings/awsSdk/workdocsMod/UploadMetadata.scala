package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadMetadata extends StObject {
  
  /**
    * The signed headers.
    */
  var SignedHeaders: js.UndefOr[SignedHeaderMap] = js.native
  
  /**
    * The URL of the upload.
    */
  var UploadUrl: js.UndefOr[UrlType] = js.native
}
object UploadMetadata {
  
  @scala.inline
  def apply(): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadMetadata]
  }
  
  @scala.inline
  implicit class UploadMetadataMutableBuilder[Self <: UploadMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignedHeaders(value: SignedHeaderMap): Self = StObject.set(x, "SignedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedHeadersUndefined: Self = StObject.set(x, "SignedHeaders", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: UrlType): Self = StObject.set(x, "UploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "UploadUrl", js.undefined)
  }
}
