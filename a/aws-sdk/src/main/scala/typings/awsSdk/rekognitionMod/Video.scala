package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  /**
    * The Amazon S3 bucket name and file name for the video.
    */
  var S3Object: js.UndefOr[typings.awsSdk.rekognitionMod.S3Object] = js.undefined
}
object Video {
  
  @scala.inline
  def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit class VideoMutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
