package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.basic_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.list_
import typings.chromeApps.chromeAppsStrings.progress_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BASIC extends StObject {
  
  var BASIC: basic_
  
  var IMAGE: image_
  
  var LIST: list_
  
  var PROGRESS: progress_
}
object BASIC {
  
  inline def apply(): BASIC = {
    val __obj = js.Dynamic.literal(BASIC = "basic", IMAGE = "image", LIST = "list", PROGRESS = "progress")
    __obj.asInstanceOf[BASIC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BASIC] (val x: Self) extends AnyVal {
    
    inline def setBASIC(value: basic_): Self = StObject.set(x, "BASIC", value.asInstanceOf[js.Any])
    
    inline def setIMAGE(value: image_): Self = StObject.set(x, "IMAGE", value.asInstanceOf[js.Any])
    
    inline def setLIST(value: list_): Self = StObject.set(x, "LIST", value.asInstanceOf[js.Any])
    
    inline def setPROGRESS(value: progress_): Self = StObject.set(x, "PROGRESS", value.asInstanceOf[js.Any])
  }
}
