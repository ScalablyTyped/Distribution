package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResourceType extends StObject
@JSGlobal("chrome.declarativeNetRequest.ResourceType")
@js.native
object ResourceType extends StObject {
  
  @js.native
  sealed trait CSP_REPORT
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait FONT
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait IMAGE
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait MAIN_FRAME
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait MEDIA
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait OBJECT
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait OTHER
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait PING
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait SCRIPT
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait STYLESHEET
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait SUB_FRAME
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait WEBSOCKET
    extends StObject
       with ResourceType
  
  @js.native
  sealed trait XMLHTTPREQUEST
    extends StObject
       with ResourceType
}
