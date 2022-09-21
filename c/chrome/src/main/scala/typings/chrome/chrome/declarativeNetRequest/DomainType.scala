package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DomainType extends StObject
@JSGlobal("chrome.declarativeNetRequest.DomainType")
@js.native
object DomainType extends StObject {
  
  @js.native
  sealed trait FIRST_PARTY
    extends StObject
       with DomainType
  
  @js.native
  sealed trait THIRD_PARTY
    extends StObject
       with DomainType
}
