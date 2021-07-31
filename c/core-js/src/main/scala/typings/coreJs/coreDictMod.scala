package typings.coreJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreDictMod extends Shortcut {
  
  @JSImport("core-js/library/core/dict", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DictConstructor = js.native
  
  type _To = js.Object & DictConstructor
  
  /* This means you don't have to write `^`, but can instead just say `coreDictMod.foo` */
  override def _to: js.Object & DictConstructor = ^
}
