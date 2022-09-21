package typings.azureMobileServicesClient

import org.scalablytyped.runtime.Shortcut
import typings.azureMobileServicesClient.Microsoft.WindowsAzure.WindowsAzureStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WindowsAzure extends Shortcut {
    
    @JSGlobal("WindowsAzure")
    @js.native
    val ^ : WindowsAzureStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("WindowsAzure.MobileServiceClient")
    @js.native
    open class MobileServiceClient protected ()
      extends StObject
         with typings.azureMobileServicesClient.Microsoft.WindowsAzure.MobileServiceClient {
      def this(applicationUrl: String) = this()
      def this(applicationUrl: String, applicationKey: String) = this()
    }
    
    type _To = WindowsAzureStatic
    
    /* This means you don't have to write `^`, but can instead just say `WindowsAzure.foo` */
    override def _to: WindowsAzureStatic = ^
  }
}
