package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.WRITE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait READ extends StObject {
  
  var READ: typings.chromeApps.chromeAppsStrings.READ = js.native
  
  var WRITE: typings.chromeApps.chromeAppsStrings.WRITE = js.native
}
object READ {
  
  @scala.inline
  def apply(READ: typings.chromeApps.chromeAppsStrings.READ, WRITE: WRITE): READ = {
    val __obj = js.Dynamic.literal(READ = READ.asInstanceOf[js.Any], WRITE = WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[READ]
  }
  
  @scala.inline
  implicit class READMutableBuilder[Self <: READ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setREAD(value: typings.chromeApps.chromeAppsStrings.READ): Self = StObject.set(x, "READ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWRITE(value: WRITE): Self = StObject.set(x, "WRITE", value.asInstanceOf[js.Any])
  }
}
