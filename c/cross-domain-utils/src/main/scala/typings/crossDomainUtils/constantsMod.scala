package typings.crossDomainUtils

import typings.crossDomainUtils.crossDomainUtilsStrings.Asterisk
import typings.crossDomainUtils.crossDomainUtilsStrings.aboutColon
import typings.crossDomainUtils.crossDomainUtilsStrings.fileColon
import typings.crossDomainUtils.crossDomainUtilsStrings.iframe
import typings.crossDomainUtils.crossDomainUtilsStrings.mockColon
import typings.crossDomainUtils.crossDomainUtilsStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cross-domain-utils/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  val WILDCARD: Asterisk = js.native
  
  @js.native
  object PROTOCOL extends js.Object {
    
    var ABOUT: aboutColon = js.native
    
    var FILE: fileColon = js.native
    
    var MOCK: mockColon = js.native
  }
  
  @js.native
  object WINDOW_TYPE extends js.Object {
    
    var IFRAME: iframe = js.native
    
    var POPUP: popup = js.native
  }
}
