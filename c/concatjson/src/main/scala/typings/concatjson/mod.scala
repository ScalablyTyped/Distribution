package typings.concatjson

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("concatjson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Transform]
  
  inline def serialize(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[Transform]
  
  inline def stringify(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[Transform]
}
