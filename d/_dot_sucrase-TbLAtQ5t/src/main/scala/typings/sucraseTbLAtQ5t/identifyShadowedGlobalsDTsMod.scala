package typings.sucraseTbLAtQ5t

import typings.std.Set
import typings.sucraseTbLAtQ5t.stateDTsMod.Scope
import typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifyShadowedGlobalsDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/identifyShadowedGlobals.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
    scopes: js.Array[Scope],
    globalNames: Set[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tokens.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], globalNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hasShadowedGlobals(tokens: default, globalNames: Set[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasShadowedGlobals")(tokens.asInstanceOf[js.Any], globalNames.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
