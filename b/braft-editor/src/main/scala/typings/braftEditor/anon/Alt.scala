package typings.braftEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alt extends StObject {
  
  var alt: String = js.native
  
  var autoPlay: Boolean = js.native
  
  var controls: Boolean = js.native
  
  var id: String = js.native
  
  var loop: Boolean = js.native
  
  var poster: String = js.native
  
  var title: String = js.native
}
object Alt {
  
  @scala.inline
  def apply(
    alt: String,
    autoPlay: Boolean,
    controls: Boolean,
    id: String,
    loop: Boolean,
    poster: String,
    title: String
  ): Alt = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], poster = poster.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
  
  @scala.inline
  implicit class AltMutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
