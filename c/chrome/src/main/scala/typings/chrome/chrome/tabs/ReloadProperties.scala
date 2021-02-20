package typings.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReloadProperties extends StObject {
  
  /** Optional. Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[Boolean] = js.native
}
object ReloadProperties {
  
  @scala.inline
  def apply(): ReloadProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadProperties]
  }
  
  @scala.inline
  implicit class ReloadPropertiesMutableBuilder[Self <: ReloadProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassCache(value: Boolean): Self = StObject.set(x, "bypassCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassCacheUndefined: Self = StObject.set(x, "bypassCache", js.undefined)
  }
}
