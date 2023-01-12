package typings.cypress.anon

import typings.cypress.Cypress.BrowserChannel
import typings.cypress.Cypress.BrowserFamily
import typings.cypress.Cypress.BrowserName
import typings.cypress.Cypress._IsBrowserMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.Browser> */
trait PartialBrowser
  extends StObject
     with _IsBrowserMatcher {
  
  var channel: js.UndefOr[BrowserChannel] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var family: js.UndefOr[BrowserFamily] = js.undefined
  
  var info: js.UndefOr[String] = js.undefined
  
  var isHeaded: js.UndefOr[Boolean] = js.undefined
  
  var isHeadless: js.UndefOr[Boolean] = js.undefined
  
  var majorVersion: js.UndefOr[Double | String] = js.undefined
  
  var minSupportedVersion: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[BrowserName] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var unsupportedVersion: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var warning: js.UndefOr[String] = js.undefined
}
object PartialBrowser {
  
  inline def apply(): PartialBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBrowser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBrowser] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: BrowserChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFamily(value: BrowserFamily): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setIsHeaded(value: Boolean): Self = StObject.set(x, "isHeaded", value.asInstanceOf[js.Any])
    
    inline def setIsHeadedUndefined: Self = StObject.set(x, "isHeaded", js.undefined)
    
    inline def setIsHeadless(value: Boolean): Self = StObject.set(x, "isHeadless", value.asInstanceOf[js.Any])
    
    inline def setIsHeadlessUndefined: Self = StObject.set(x, "isHeadless", js.undefined)
    
    inline def setMajorVersion(value: Double | String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setMinSupportedVersion(value: Double): Self = StObject.set(x, "minSupportedVersion", value.asInstanceOf[js.Any])
    
    inline def setMinSupportedVersionUndefined: Self = StObject.set(x, "minSupportedVersion", js.undefined)
    
    inline def setName(value: BrowserName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setUnsupportedVersion(value: Boolean): Self = StObject.set(x, "unsupportedVersion", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedVersionUndefined: Self = StObject.set(x, "unsupportedVersion", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
