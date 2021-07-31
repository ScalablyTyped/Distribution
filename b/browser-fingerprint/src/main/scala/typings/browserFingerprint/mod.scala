package typings.browserFingerprint

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("browser-fingerprint", JSImport.Namespace)
  @js.native
  val ^ : typings.browserFingerprint.mod.browserFingerprint = js.native
  
  type _To = typings.browserFingerprint.mod.browserFingerprint
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.browserFingerprint.mod.browserFingerprint = ^
  
  @js.native
  trait browserFingerprint extends StObject {
    
    def apply(): String = js.native
    
    def default(): String = js.native
    @JSName("default")
    var default_Original: typings.browserFingerprint.mod.browserFingerprint = js.native
  }
}
