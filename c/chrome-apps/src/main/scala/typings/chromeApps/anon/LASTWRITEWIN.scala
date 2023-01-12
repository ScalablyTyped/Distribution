package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.last_write_win_
import typings.chromeApps.chromeAppsStrings.manual__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LASTWRITEWIN extends StObject {
  
  var LAST_WRITE_WIN: last_write_win_
  
  var MANUAL: manual__
}
object LASTWRITEWIN {
  
  inline def apply(): LASTWRITEWIN = {
    val __obj = js.Dynamic.literal(LAST_WRITE_WIN = "last_write_win", MANUAL = "manual")
    __obj.asInstanceOf[LASTWRITEWIN]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LASTWRITEWIN] (val x: Self) extends AnyVal {
    
    inline def setLAST_WRITE_WIN(value: last_write_win_): Self = StObject.set(x, "LAST_WRITE_WIN", value.asInstanceOf[js.Any])
    
    inline def setMANUAL(value: manual__): Self = StObject.set(x, "MANUAL", value.asInstanceOf[js.Any])
  }
}
