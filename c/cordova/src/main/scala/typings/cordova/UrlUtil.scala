package typings.cordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// cordova/urlutil module
@js.native
trait UrlUtil extends StObject {
  
  def makeAbsolute(url: String): String = js.native
}
object UrlUtil {
  
  @scala.inline
  def apply(makeAbsolute: String => String): UrlUtil = {
    val __obj = js.Dynamic.literal(makeAbsolute = js.Any.fromFunction1(makeAbsolute))
    __obj.asInstanceOf[UrlUtil]
  }
  
  @scala.inline
  implicit class UrlUtilMutableBuilder[Self <: UrlUtil] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMakeAbsolute(value: String => String): Self = StObject.set(x, "makeAbsolute", js.Any.fromFunction1(value))
  }
}
