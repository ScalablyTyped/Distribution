package typings.bip174.interfacesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapScript extends StObject {
  
  var leafVersion: Double
  
  var script: Buffer
}
object TapScript {
  
  inline def apply(leafVersion: Double, script: Buffer): TapScript = {
    val __obj = js.Dynamic.literal(leafVersion = leafVersion.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapScript]
  }
  
  extension [Self <: TapScript](x: Self) {
    
    inline def setLeafVersion(value: Double): Self = StObject.set(x, "leafVersion", value.asInstanceOf[js.Any])
    
    inline def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
