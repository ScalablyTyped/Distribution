package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefaultActionPolicy extends StObject
@JSGlobal("chrome.cast.DefaultActionPolicy")
@js.native
object DefaultActionPolicy extends StObject {
  
  @js.native
  sealed trait CAST_THIS_TAB
    extends StObject
       with DefaultActionPolicy
  
  @js.native
  sealed trait CREATE_SESSION
    extends StObject
       with DefaultActionPolicy
}
