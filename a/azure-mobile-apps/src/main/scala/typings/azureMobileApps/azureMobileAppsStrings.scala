package typings.azureMobileApps

import typings.azureMobileApps.Azure.MobileApps.AccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureMobileAppsStrings {
  
  @js.native
  sealed trait anonymous
    extends StObject
       with AccessType
  inline def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  
  @js.native
  sealed trait authenticated
    extends StObject
       with AccessType
  inline def authenticated: authenticated = "authenticated".asInstanceOf[authenticated]
  
  @js.native
  sealed trait disabled
    extends StObject
       with AccessType
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
}
