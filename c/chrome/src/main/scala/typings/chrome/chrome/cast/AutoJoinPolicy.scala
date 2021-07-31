package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoJoinPolicy extends StObject
@JSGlobal("chrome.cast.AutoJoinPolicy")
@js.native
object AutoJoinPolicy extends StObject {
  
  @js.native
  sealed trait CUSTOM_CONTROLLER_SCOPED
    extends StObject
       with AutoJoinPolicy
  
  @js.native
  sealed trait ORIGIN_SCOPED
    extends StObject
       with AutoJoinPolicy
  
  @js.native
  sealed trait PAGE_SCOPED
    extends StObject
       with AutoJoinPolicy
  
  @js.native
  sealed trait TAB_AND_ORIGIN_SCOPED
    extends StObject
       with AutoJoinPolicy
}
