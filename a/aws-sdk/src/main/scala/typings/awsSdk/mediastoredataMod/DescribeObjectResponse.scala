package typings.awsSdk.mediastoredataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeObjectResponse extends StObject {
  
  /**
    * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
    */
  var CacheControl: js.UndefOr[StringPrimitive] = js.undefined
  
  /**
    * The length of the object in bytes.
    */
  var ContentLength: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The content type of the object.
    */
  var ContentType: js.UndefOr[typings.awsSdk.mediastoredataMod.ContentType] = js.undefined
  
  /**
    * The ETag that represents a unique instance of the object.
    */
  var ETag: js.UndefOr[typings.awsSdk.mediastoredataMod.ETag] = js.undefined
  
  /**
    * The date and time that the object was last modified.
    */
  var LastModified: js.UndefOr[TimeStamp] = js.undefined
}
object DescribeObjectResponse {
  
  @scala.inline
  def apply(): DescribeObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeObjectResponse]
  }
  
  @scala.inline
  implicit class DescribeObjectResponseMutableBuilder[Self <: DescribeObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheControl(value: StringPrimitive): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    @scala.inline
    def setContentLength(value: NonNegativeLong): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLastModified(value: TimeStamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
  }
}
