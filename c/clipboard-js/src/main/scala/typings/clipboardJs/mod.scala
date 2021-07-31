package typings.clipboardJs

import org.scalablytyped.runtime.Shortcut
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("clipboard-js", JSImport.Namespace)
  @js.native
  val ^ : IClipboardJsStatic = js.native
  
  @js.native
  trait IClipboardJsStatic extends StObject {
    
    def copy(`val`: String): js.Promise[Unit] = js.native
    def copy(`val`: Element): js.Promise[Unit] = js.native
    
    def paste(): js.Promise[String] = js.native
  }
  
  type _To = IClipboardJsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IClipboardJsStatic = ^
}
