package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3KeyOutput extends StObject {
  
  /**
    * The etag for the object.
    */
  var etag: js.UndefOr[S3Etag] = js.undefined
  
  /**
    * The S3 key.
    */
  var s3Key: js.UndefOr[S3Key] = js.undefined
}
object S3KeyOutput {
  
  @scala.inline
  def apply(): S3KeyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3KeyOutput]
  }
  
  @scala.inline
  implicit class S3KeyOutputMutableBuilder[Self <: S3KeyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: S3Etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "s3Key", js.undefined)
  }
}
