package typings.barnard59Base

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object limitMod {
  
  @JSImport("barnard59-base/limit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(limit: Double): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(limit.asInstanceOf[js.Any]).asInstanceOf[Transform]
}
