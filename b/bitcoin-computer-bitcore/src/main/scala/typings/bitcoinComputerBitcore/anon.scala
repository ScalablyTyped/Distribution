package typings.bitcoinComputerBitcore

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buf extends StObject {
    
    var buf: js.UndefOr[Buffer] = js.undefined
    
    var len: js.UndefOr[Double] = js.undefined
    
    var opcodenum: js.UndefOr[Double] = js.undefined
  }
  object Buf {
    
    inline def apply(): Buf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Buf]
    }
    
    extension [Self <: Buf](x: Self) {
      
      inline def setBuf(value: Buffer): Self = StObject.set(x, "buf", value.asInstanceOf[js.Any])
      
      inline def setBufUndefined: Self = StObject.set(x, "buf", js.undefined)
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
      
      inline def setOpcodenum(value: Double): Self = StObject.set(x, "opcodenum", value.asInstanceOf[js.Any])
      
      inline def setOpcodenumUndefined: Self = StObject.set(x, "opcodenum", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var message: String
  }
  object Message {
    
    inline def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrevHash extends StObject {
    
    var prevHash: String
    
    var time: Double
  }
  object PrevHash {
    
    inline def apply(prevHash: String, time: Double): PrevHash = {
      val __obj = js.Dynamic.literal(prevHash = prevHash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevHash]
    }
    
    extension [Self <: PrevHash](x: Self) {
      
      inline def setPrevHash(value: String): Self = StObject.set(x, "prevHash", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reverse extends StObject {
    
    def reverse(a: Any): Any
  }
  object Reverse {
    
    inline def apply(reverse: Any => Any): Reverse = {
      val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
      __obj.asInstanceOf[Reverse]
    }
    
    extension [Self <: Reverse](x: Self) {
      
      inline def setReverse(value: Any => Any): Self = StObject.set(x, "reverse", js.Any.fromFunction1(value))
    }
  }
}
