package typings.crossDomainUtils

import typings.crossDomainUtils.crossDomainUtilsStrings.Asterisk
import typings.crossDomainUtils.crossDomainUtilsStrings.aboutColon
import typings.crossDomainUtils.crossDomainUtilsStrings.fileColon
import typings.crossDomainUtils.crossDomainUtilsStrings.iframe
import typings.crossDomainUtils.crossDomainUtilsStrings.mockColon
import typings.crossDomainUtils.crossDomainUtilsStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  object PROTOCOL {
    
    @JSImport("cross-domain-utils/constants", "PROTOCOL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cross-domain-utils/constants", "PROTOCOL.ABOUT")
    @js.native
    def ABOUT: aboutColon = js.native
    inline def ABOUT_=(x: aboutColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils/constants", "PROTOCOL.FILE")
    @js.native
    def FILE: fileColon = js.native
    inline def FILE_=(x: fileColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils/constants", "PROTOCOL.MOCK")
    @js.native
    def MOCK: mockColon = js.native
    inline def MOCK_=(x: mockColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOCK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("cross-domain-utils/constants", "WILDCARD")
  @js.native
  val WILDCARD: Asterisk = js.native
  
  object WINDOW_TYPE {
    
    @JSImport("cross-domain-utils/constants", "WINDOW_TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cross-domain-utils/constants", "WINDOW_TYPE.IFRAME")
    @js.native
    def IFRAME: iframe = js.native
    inline def IFRAME_=(x: iframe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IFRAME")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils/constants", "WINDOW_TYPE.POPUP")
    @js.native
    def POPUP: popup = js.native
    inline def POPUP_=(x: popup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP")(x.asInstanceOf[js.Any])
  }
}
