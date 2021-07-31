package typings.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpsOptions extends StObject {
  
  var cert: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
}
object HttpsOptions {
  
  @scala.inline
  def apply(): HttpsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpsOptions]
  }
  
  @scala.inline
  implicit class HttpsOptionsMutableBuilder[Self <: HttpsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
