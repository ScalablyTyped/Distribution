package typings.braftEditor.anon

import typings.braftEditor.braftEditorBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audio extends StObject {
  
  var audio: js.UndefOr[String | `false`] = js.undefined
  
  var image: js.UndefOr[String | `false`] = js.undefined
  
  var video: js.UndefOr[String | `false`] = js.undefined
}
object Audio {
  
  inline def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: String | `false`): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setImage(value: String | `false`): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setVideo(value: String | `false`): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
