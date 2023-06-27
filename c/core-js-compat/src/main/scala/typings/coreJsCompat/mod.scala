package typings.coreJsCompat

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.coreJsCompat.anon.Compat
import typings.coreJsCompat.anon.targetinTargetTargetVersi
import typings.coreJsCompat.compatMod.CompatOptions
import typings.coreJsCompat.compatMod.CompatOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("core-js-compat", JSImport.Namespace)
  @js.native
  val ^ : (js.Function1[/* options */ js.UndefOr[CompatOptions], CompatOutput]) & Compat = js.native
  
  type CompatData = StringDictionary[targetinTargetTargetVersi]
  
  type _To = (js.Function1[/* options */ js.UndefOr[CompatOptions], CompatOutput]) & Compat
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* options */ js.UndefOr[CompatOptions], CompatOutput]) & Compat = ^
}
