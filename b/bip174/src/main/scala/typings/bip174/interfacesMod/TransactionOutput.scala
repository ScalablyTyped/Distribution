package typings.bip174.interfacesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOutput extends StObject {
  
  var script: Buffer
  
  var value: Double
}
object TransactionOutput {
  
  inline def apply(script: Buffer, value: Double): TransactionOutput = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOutput]
  }
  
  extension [Self <: TransactionOutput](x: Self) {
    
    inline def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
