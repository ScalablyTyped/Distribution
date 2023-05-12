package typings.defaultBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("default-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Browser]]
  
  trait Browser extends StObject {
    
    /**
    	Unique ID for the browser on the current platform:
    	- On macOS, it's the ID in LaunchServices.
    	- On Linux, it's the desktop file ID (from `xdg-mime`).
    	- On Windows, it's an invented ID as Windows doesn't have IDs.
    	*/
    var id: String
    
    /**
    	Human-readadable name of the browser.
    	*/
    var name: String
  }
  object Browser {
    
    inline def apply(id: String, name: String): Browser = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
