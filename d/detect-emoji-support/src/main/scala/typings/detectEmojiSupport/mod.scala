package typings.detectEmojiSupport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-emoji-support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emojiSupport(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emojiSupport")().asInstanceOf[Boolean]
}
