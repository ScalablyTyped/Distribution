package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDASHStreamingSessionURLOutput extends StObject {
  
  /**
    * The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
    */
  var DASHStreamingSessionURL: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.DASHStreamingSessionURL] = js.undefined
}
object GetDASHStreamingSessionURLOutput {
  
  @scala.inline
  def apply(): GetDASHStreamingSessionURLOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDASHStreamingSessionURLOutput]
  }
  
  @scala.inline
  implicit class GetDASHStreamingSessionURLOutputMutableBuilder[Self <: GetDASHStreamingSessionURLOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDASHStreamingSessionURL(value: DASHStreamingSessionURL): Self = StObject.set(x, "DASHStreamingSessionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDASHStreamingSessionURLUndefined: Self = StObject.set(x, "DASHStreamingSessionURL", js.undefined)
  }
}
