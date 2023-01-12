package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.WRITE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait READ extends StObject {
  
  var READ: typings.chromeApps.chromeAppsStrings.READ
  
  var WRITE: typings.chromeApps.chromeAppsStrings.WRITE
}
object READ {
  
  inline def apply(): READ = {
    val __obj = js.Dynamic.literal(READ = "READ", WRITE = "WRITE")
    __obj.asInstanceOf[READ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: READ] (val x: Self) extends AnyVal {
    
    inline def setREAD(value: typings.chromeApps.chromeAppsStrings.READ): Self = StObject.set(x, "READ", value.asInstanceOf[js.Any])
    
    inline def setWRITE(value: WRITE): Self = StObject.set(x, "WRITE", value.asInstanceOf[js.Any])
  }
}
