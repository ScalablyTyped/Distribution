package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionManagerOutputUrl extends StObject {
  
  /**
    * Reserved for future use.
    */
  var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.undefined
}
object SessionManagerOutputUrl {
  
  @scala.inline
  def apply(): SessionManagerOutputUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionManagerOutputUrl]
  }
  
  @scala.inline
  implicit class SessionManagerOutputUrlMutableBuilder[Self <: SessionManagerOutputUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchOutputUrl(value: SessionManagerCloudWatchOutputUrl): Self = StObject.set(x, "CloudWatchOutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchOutputUrlUndefined: Self = StObject.set(x, "CloudWatchOutputUrl", js.undefined)
    
    @scala.inline
    def setS3OutputUrl(value: SessionManagerS3OutputUrl): Self = StObject.set(x, "S3OutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3OutputUrlUndefined: Self = StObject.set(x, "S3OutputUrl", js.undefined)
  }
}
