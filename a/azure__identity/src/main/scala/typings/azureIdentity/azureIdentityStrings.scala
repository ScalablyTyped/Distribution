package typings.azureIdentity

import typings.azureIdentity.mod.BrowserLoginStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureIdentityStrings {
  
  @js.native
  sealed trait common extends StObject
  inline def common: common = "common".asInstanceOf[common]
  
  @js.native
  sealed trait popup
    extends StObject
       with BrowserLoginStyle
  inline def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait redirect
    extends StObject
       with BrowserLoginStyle
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
}
