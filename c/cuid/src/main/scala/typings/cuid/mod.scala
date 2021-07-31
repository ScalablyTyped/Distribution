package typings.cuid

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cuid", JSImport.Namespace)
  @js.native
  val ^ : CUID = js.native
  
  @js.native
  trait CUID extends StObject {
    
    def apply(): String = js.native
    
    def slug(): String = js.native
  }
  
  type _To = CUID
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CUID = ^
}
