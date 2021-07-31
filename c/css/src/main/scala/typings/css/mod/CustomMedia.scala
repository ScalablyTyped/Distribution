package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMedia
  extends StObject
     with Node
     with AtRule {
  
  /** The part following the name. */
  var media: js.UndefOr[String] = js.undefined
  
  /** The ---prefixed name. */
  var name: js.UndefOr[String] = js.undefined
}
object CustomMedia {
  
  @scala.inline
  def apply(): CustomMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMedia]
  }
  
  @scala.inline
  implicit class CustomMediaMutableBuilder[Self <: CustomMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
