package typings.coreJsCompat

import typings.coreJsCompat.sharedMod.ModuleName
import typings.coreJsCompat.sharedMod.TargetVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getModulesListForTargetVersionMod {
  
  inline def apply(version: TargetVersion): js.Array[ModuleName] = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleName]]
  
  @JSImport("core-js-compat/get-modules-list-for-target-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
