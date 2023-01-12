package typings.detectInapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-inapp", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with InApp {
    def this(useragent: String) = this()
    
    /* CompleteClass */
    override val browser: String = js.native
    
    /* CompleteClass */
    override val isDesktop: Boolean = js.native
    
    /* CompleteClass */
    override val isInApp: Boolean = js.native
    
    /* CompleteClass */
    override val isMobile: Boolean = js.native
    
    /* CompleteClass */
    var ua: String = js.native
  }
  
  trait InApp extends StObject {
    
    val browser: String
    
    val isDesktop: Boolean
    
    val isInApp: Boolean
    
    val isMobile: Boolean
    
    var ua: String
  }
  object InApp {
    
    inline def apply(browser: String, isDesktop: Boolean, isInApp: Boolean, isMobile: Boolean, ua: String): InApp = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], isDesktop = isDesktop.asInstanceOf[js.Any], isInApp = isInApp.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any])
      __obj.asInstanceOf[InApp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InApp] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setIsDesktop(value: Boolean): Self = StObject.set(x, "isDesktop", value.asInstanceOf[js.Any])
      
      inline def setIsInApp(value: Boolean): Self = StObject.set(x, "isInApp", value.asInstanceOf[js.Any])
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setUa(value: String): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
    }
  }
}
