package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludesArtwork extends StObject {
  
  @JSName("$includesArtwork")
  var $includesArtwork: Boolean
}
object IncludesArtwork {
  
  inline def apply($includesArtwork: Boolean): IncludesArtwork = {
    val __obj = js.Dynamic.literal($includesArtwork = $includesArtwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludesArtwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludesArtwork] (val x: Self) extends AnyVal {
    
    inline def set$includesArtwork(value: Boolean): Self = StObject.set(x, "$includesArtwork", value.asInstanceOf[js.Any])
  }
}
