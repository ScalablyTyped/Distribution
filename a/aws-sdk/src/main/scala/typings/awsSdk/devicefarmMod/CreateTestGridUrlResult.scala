package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTestGridUrlResult extends StObject {
  
  /**
    * The number of seconds the URL from CreateTestGridUrlResult$url stays active.
    */
  var expires: js.UndefOr[DateTime] = js.undefined
  
  /**
    * A signed URL, expiring in CreateTestGridUrlRequest$expiresInSeconds seconds, to be passed to a RemoteWebDriver. 
    */
  var url: js.UndefOr[String] = js.undefined
}
object CreateTestGridUrlResult {
  
  @scala.inline
  def apply(): CreateTestGridUrlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTestGridUrlResult]
  }
  
  @scala.inline
  implicit class CreateTestGridUrlResultMutableBuilder[Self <: CreateTestGridUrlResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires(value: DateTime): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
