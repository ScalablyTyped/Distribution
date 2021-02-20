package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mimetype extends StObject {
  
  /** The MIME type for which the Native Client module will be registered as content handler. */
  var mime_type: String = js.native
  
  /** The location of a Native Client manifest (a .nmf file) within the app's directory. */
  var path: String = js.native
}
object Mimetype {
  
  @scala.inline
  def apply(mime_type: String, path: String): Mimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mimetype]
  }
  
  @scala.inline
  implicit class MimetypeMutableBuilder[Self <: Mimetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
