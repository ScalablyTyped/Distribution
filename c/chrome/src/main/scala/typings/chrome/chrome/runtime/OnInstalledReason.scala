package typings.chrome.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OnInstalledReason extends StObject
@JSGlobal("chrome.runtime.OnInstalledReason")
@js.native
object OnInstalledReason extends StObject {
  
  @js.native
  sealed trait CHROME_UPDATE
    extends StObject
       with OnInstalledReason
  
  @js.native
  sealed trait INSTALL
    extends StObject
       with OnInstalledReason
  
  @js.native
  sealed trait SHARED_MODULE_UPDATE
    extends StObject
       with OnInstalledReason
  
  @js.native
  sealed trait UPDATE
    extends StObject
       with OnInstalledReason
}
