package typings.bip174.interfacesMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WitnessUtxo extends StObject {
  
  var script: Buffer
  
  var value: Double
}
object WitnessUtxo {
  
  inline def apply(script: Buffer, value: Double): WitnessUtxo = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitnessUtxo]
  }
  
  extension [Self <: WitnessUtxo](x: Self) {
    
    inline def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
