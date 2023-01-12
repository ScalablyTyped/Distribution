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
  
  inline def apply(): CustomMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMedia]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomMedia] (val x: Self) extends AnyVal {
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
