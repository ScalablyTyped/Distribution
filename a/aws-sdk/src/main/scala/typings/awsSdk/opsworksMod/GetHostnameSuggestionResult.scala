package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostnameSuggestionResult extends StObject {
  
  /**
    * The generated host name.
    */
  var Hostname: js.UndefOr[String] = js.undefined
  
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.undefined
}
object GetHostnameSuggestionResult {
  
  @scala.inline
  def apply(): GetHostnameSuggestionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostnameSuggestionResult]
  }
  
  @scala.inline
  implicit class GetHostnameSuggestionResultMutableBuilder[Self <: GetHostnameSuggestionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "LayerId", js.undefined)
  }
}
