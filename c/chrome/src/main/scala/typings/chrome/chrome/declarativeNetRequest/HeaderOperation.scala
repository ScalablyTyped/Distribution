package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderOperation extends StObject
@JSGlobal("chrome.declarativeNetRequest.HeaderOperation")
@js.native
object HeaderOperation extends StObject {
  
  @js.native
  sealed trait APPEND
    extends StObject
       with HeaderOperation
  
  @js.native
  sealed trait REMOVE
    extends StObject
       with HeaderOperation
  
  @js.native
  sealed trait SET
    extends StObject
       with HeaderOperation
}
