package typings.bs58

import org.scalablytyped.runtime.Shortcut
import typings.baseX.mod.BaseConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bs58", JSImport.Namespace)
  @js.native
  val ^ : BaseConverter = js.native
  
  type _To = BaseConverter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BaseConverter = ^
}
