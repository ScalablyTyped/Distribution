package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SenderPlatform extends StObject
@JSGlobal("chrome.cast.SenderPlatform")
@js.native
object SenderPlatform extends StObject {
  
  @js.native
  sealed trait ANDROID
    extends StObject
       with SenderPlatform
  
  @js.native
  sealed trait CHROME
    extends StObject
       with SenderPlatform
  
  @js.native
  sealed trait IOS
    extends StObject
       with SenderPlatform
}
