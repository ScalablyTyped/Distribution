package typings.deepFreezeEs6

import org.scalablytyped.runtime.Shortcut
import typings.deepFreezeEs6.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("deep-freeze-es6", JSImport.Namespace)
  @js.native
  val ^ : DeepFreezeExport = js.native
  
  type DeepFreezeExport = DeepFreezeFn with Default
  
  type DeepFreezeFn = js.Function1[/* obj */ js.Any, js.Any]
  
  type _To = DeepFreezeExport
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DeepFreezeExport = ^
}
