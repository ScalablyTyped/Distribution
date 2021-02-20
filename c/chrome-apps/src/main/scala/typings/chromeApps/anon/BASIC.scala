package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.basic_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.list_
import typings.chromeApps.chromeAppsStrings.progress_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BASIC extends StObject {
  
  var BASIC: basic_ = js.native
  
  var IMAGE: image_ = js.native
  
  var LIST: list_ = js.native
  
  var PROGRESS: progress_ = js.native
}
object BASIC {
  
  @scala.inline
  def apply(BASIC: basic_, IMAGE: image_, LIST: list_, PROGRESS: progress_): BASIC = {
    val __obj = js.Dynamic.literal(BASIC = BASIC.asInstanceOf[js.Any], IMAGE = IMAGE.asInstanceOf[js.Any], LIST = LIST.asInstanceOf[js.Any], PROGRESS = PROGRESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[BASIC]
  }
  
  @scala.inline
  implicit class BASICMutableBuilder[Self <: BASIC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBASIC(value: basic_): Self = StObject.set(x, "BASIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMAGE(value: image_): Self = StObject.set(x, "IMAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLIST(value: list_): Self = StObject.set(x, "LIST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPROGRESS(value: progress_): Self = StObject.set(x, "PROGRESS", value.asInstanceOf[js.Any])
  }
}
