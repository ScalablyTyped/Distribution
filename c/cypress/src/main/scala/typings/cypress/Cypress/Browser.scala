package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a browser Cypress can control
  */
trait Browser extends StObject {
  
  /**
    * The release channel of the browser.
    */
  var channel: BrowserChannel
  
  /**
    * Human-readable browser name.
    */
  var displayName: String
  
  /**
    * The underlying engine for this browser.
    */
  var family: BrowserFamily
  
  /**
    * Informational text to accompany this browser. Shown in desktop-gui.
    */
  var info: js.UndefOr[String] = js.undefined
  
  var isHeaded: Boolean
  
  var isHeadless: Boolean
  
  var majorVersion: Double | String
  
  /**
    * The minimum majorVersion of this browser supported by Cypress.
    */
  var minSupportedVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Short browser name.
    */
  var name: BrowserName
  
  var path: String
  
  /**
    * If `true`, this browser is too old to be supported by Cypress.
    */
  var unsupportedVersion: js.UndefOr[Boolean] = js.undefined
  
  var version: String
  
  /**
    * Warning text to accompany this browser. Shown in desktop-gui.
    */
  var warning: js.UndefOr[String] = js.undefined
}
object Browser {
  
  inline def apply(
    channel: BrowserChannel,
    displayName: String,
    family: BrowserFamily,
    isHeaded: Boolean,
    isHeadless: Boolean,
    majorVersion: Double | String,
    name: BrowserName,
    path: String,
    version: String
  ): Browser = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], isHeaded = isHeaded.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  extension [Self <: Browser](x: Self) {
    
    inline def setChannel(value: BrowserChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFamily(value: BrowserFamily): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setIsHeaded(value: Boolean): Self = StObject.set(x, "isHeaded", value.asInstanceOf[js.Any])
    
    inline def setIsHeadless(value: Boolean): Self = StObject.set(x, "isHeadless", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: Double | String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinSupportedVersion(value: Double): Self = StObject.set(x, "minSupportedVersion", value.asInstanceOf[js.Any])
    
    inline def setMinSupportedVersionUndefined: Self = StObject.set(x, "minSupportedVersion", js.undefined)
    
    inline def setName(value: BrowserName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedVersion(value: Boolean): Self = StObject.set(x, "unsupportedVersion", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedVersionUndefined: Self = StObject.set(x, "unsupportedVersion", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
