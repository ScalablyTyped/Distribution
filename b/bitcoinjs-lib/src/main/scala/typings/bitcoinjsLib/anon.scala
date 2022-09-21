package typings.bitcoinjsLib

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FinalScriptSig extends StObject {
    
    var finalScriptSig: js.UndefOr[Buffer] = js.undefined
    
    var finalScriptWitness: js.UndefOr[Buffer] = js.undefined
  }
  object FinalScriptSig {
    
    inline def apply(): FinalScriptSig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FinalScriptSig]
    }
    
    extension [Self <: FinalScriptSig](x: Self) {
      
      inline def setFinalScriptSig(value: Buffer): Self = StObject.set(x, "finalScriptSig", value.asInstanceOf[js.Any])
      
      inline def setFinalScriptSigUndefined: Self = StObject.set(x, "finalScriptSig", js.undefined)
      
      inline def setFinalScriptWitness(value: Buffer): Self = StObject.set(x, "finalScriptWitness", value.asInstanceOf[js.Any])
      
      inline def setFinalScriptWitnessUndefined: Self = StObject.set(x, "finalScriptWitness", js.undefined)
    }
  }
  
  trait Number extends StObject {
    
    var number: Double
    
    var opcode: Double
    
    var size: Double
  }
  object Number {
    
    inline def apply(number: Double, opcode: Double, size: Double): Number = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], opcode = opcode.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Number]
    }
    
    extension [Self <: Number](x: Self) {
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setOpcode(value: Double): Self = StObject.set(x, "opcode", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait R extends StObject {
    
    var r: Buffer
    
    var s: Buffer
  }
  object R {
    
    inline def apply(r: Buffer, s: Buffer): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    extension [Self <: R](x: Self) {
      
      inline def setR(value: Buffer): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: Buffer): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
}
