package typings.barnard59Base

import typings.readableStream.mod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forEachMod {
  
  @JSImport("barnard59-base/forEach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pipeline: typings.barnard59Core.libPipelineMod.default): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pipeline.asInstanceOf[js.Any]).asInstanceOf[Duplex]
  inline def default(pipeline: typings.barnard59Core.libPipelineMod.default, variable: String): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pipeline.asInstanceOf[js.Any], variable.asInstanceOf[js.Any])).asInstanceOf[Duplex]
}
