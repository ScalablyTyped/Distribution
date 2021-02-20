package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.admin_
import typings.chromeApps.chromeAppsStrings.development_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.other_
import typings.chromeApps.chromeAppsStrings.sideload_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADMIN extends StObject {
  
  var ADMIN: admin_ = js.native
  
  var DEVELOPMENT: development_ = js.native
  
  var NORMAL: normal_ = js.native
  
  var OTHER: other_ = js.native
  
  var SIDELOAD: sideload_ = js.native
}
object ADMIN {
  
  @scala.inline
  def apply(ADMIN: admin_, DEVELOPMENT: development_, NORMAL: normal_, OTHER: other_, SIDELOAD: sideload_): ADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], SIDELOAD = SIDELOAD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMIN]
  }
  
  @scala.inline
  implicit class ADMINMutableBuilder[Self <: ADMIN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADMIN(value: admin_): Self = StObject.set(x, "ADMIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEVELOPMENT(value: development_): Self = StObject.set(x, "DEVELOPMENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNORMAL(value: normal_): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTHER(value: other_): Self = StObject.set(x, "OTHER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIDELOAD(value: sideload_): Self = StObject.set(x, "SIDELOAD", value.asInstanceOf[js.Any])
  }
}
