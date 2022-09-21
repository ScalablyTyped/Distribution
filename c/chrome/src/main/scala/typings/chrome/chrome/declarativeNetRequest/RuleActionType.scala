package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuleActionType extends StObject
@JSGlobal("chrome.declarativeNetRequest.RuleActionType")
@js.native
object RuleActionType extends StObject {
  
  @js.native
  sealed trait ALLOW
    extends StObject
       with RuleActionType
  
  @js.native
  sealed trait ALLOW_ALL_REQUESTS
    extends StObject
       with RuleActionType
  
  @js.native
  sealed trait BLOCK
    extends StObject
       with RuleActionType
  
  @js.native
  sealed trait MODIFY_HEADERS
    extends StObject
       with RuleActionType
  
  @js.native
  sealed trait REDIRECT
    extends StObject
       with RuleActionType
  
  @js.native
  sealed trait UPGRADE_SCHEME
    extends StObject
       with RuleActionType
}
