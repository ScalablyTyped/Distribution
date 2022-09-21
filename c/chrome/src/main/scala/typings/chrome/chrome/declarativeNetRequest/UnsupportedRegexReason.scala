package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnsupportedRegexReason extends StObject
@JSGlobal("chrome.declarativeNetRequest.UnsupportedRegexReason")
@js.native
object UnsupportedRegexReason extends StObject {
  
  @js.native
  sealed trait MEMORY_LIMIT_EXCEEDED
    extends StObject
       with UnsupportedRegexReason
  
  @js.native
  sealed trait SYNTAX_ERROR
    extends StObject
       with UnsupportedRegexReason
}
