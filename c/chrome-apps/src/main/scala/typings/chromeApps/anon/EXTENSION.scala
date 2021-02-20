package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.extension
import typings.chromeApps.chromeAppsStrings.hosted_app
import typings.chromeApps.chromeAppsStrings.legacy_packaged_app
import typings.chromeApps.chromeAppsStrings.packaged_app
import typings.chromeApps.chromeAppsStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EXTENSION extends StObject {
  
  var EXTENSION: extension = js.native
  
  var HOSTED_APP: hosted_app = js.native
  
  var LEGACY_PACKAGED_APP: legacy_packaged_app = js.native
  
  var PACKAGED_APP: packaged_app = js.native
  
  var THEME: theme = js.native
}
object EXTENSION {
  
  @scala.inline
  def apply(
    EXTENSION: extension,
    HOSTED_APP: hosted_app,
    LEGACY_PACKAGED_APP: legacy_packaged_app,
    PACKAGED_APP: packaged_app,
    THEME: theme
  ): EXTENSION = {
    val __obj = js.Dynamic.literal(EXTENSION = EXTENSION.asInstanceOf[js.Any], HOSTED_APP = HOSTED_APP.asInstanceOf[js.Any], LEGACY_PACKAGED_APP = LEGACY_PACKAGED_APP.asInstanceOf[js.Any], PACKAGED_APP = PACKAGED_APP.asInstanceOf[js.Any], THEME = THEME.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTENSION]
  }
  
  @scala.inline
  implicit class EXTENSIONMutableBuilder[Self <: EXTENSION] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEXTENSION(value: extension): Self = StObject.set(x, "EXTENSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHOSTED_APP(value: hosted_app): Self = StObject.set(x, "HOSTED_APP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEGACY_PACKAGED_APP(value: legacy_packaged_app): Self = StObject.set(x, "LEGACY_PACKAGED_APP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPACKAGED_APP(value: packaged_app): Self = StObject.set(x, "PACKAGED_APP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHEME(value: theme): Self = StObject.set(x, "THEME", value.asInstanceOf[js.Any])
  }
}
