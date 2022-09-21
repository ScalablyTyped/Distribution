package typings.barnard59Base

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  @JSImport("barnard59-base/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Transform]
  
  inline def stringify(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[Transform]
}
