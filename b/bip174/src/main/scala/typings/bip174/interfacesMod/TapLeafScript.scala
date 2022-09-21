package typings.bip174.interfacesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapLeafScript
  extends StObject
     with TapScript {
  
  var controlBlock: ControlBlock
}
object TapLeafScript {
  
  inline def apply(controlBlock: ControlBlock, leafVersion: Double, script: Buffer): TapLeafScript = {
    val __obj = js.Dynamic.literal(controlBlock = controlBlock.asInstanceOf[js.Any], leafVersion = leafVersion.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapLeafScript]
  }
  
  extension [Self <: TapLeafScript](x: Self) {
    
    inline def setControlBlock(value: ControlBlock): Self = StObject.set(x, "controlBlock", value.asInstanceOf[js.Any])
  }
}
