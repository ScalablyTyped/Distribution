package typings.concurrently

import typings.concurrently.anon.ColorSupport
import typings.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGetSpawnOptsMod {
  
  @JSImport("concurrently/dist/src/get-spawn-opts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSpawnOpts(param0: ColorSupport): SpawnOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpawnOpts")(param0.asInstanceOf[js.Any]).asInstanceOf[SpawnOptions]
}
