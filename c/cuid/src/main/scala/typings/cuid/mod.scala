package typings.cuid

import org.scalablytyped.runtime.Shortcut
import typings.cuid.anon.IsCuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cuid", JSImport.Namespace)
  @js.native
  val ^ : js.Function0[String] & IsCuid = js.native
  
  type _To = js.Function0[String] & IsCuid
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Function0[String] & IsCuid = ^
}
