package typings.bunyanDebugStream

import typings.bunyanDebugStream.mod.BunyanDebugStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Consumed extends StObject {
    
    var consumed: js.UndefOr[js.Array[String]] = js.undefined
    
    var replaceMessage: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object Consumed {
    
    inline def apply(value: String): Consumed = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consumed]
    }
    
    extension [Self <: Consumed](x: Self) {
      
      inline def setConsumed(value: js.Array[String]): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
      
      inline def setConsumedUndefined: Self = StObject.set(x, "consumed", js.undefined)
      
      inline def setConsumedVarargs(value: String*): Self = StObject.set(x, "consumed", js.Array(value*))
      
      inline def setReplaceMessage(value: Boolean): Self = StObject.set(x, "replaceMessage", value.asInstanceOf[js.Any])
      
      inline def setReplaceMessageUndefined: Self = StObject.set(x, "replaceMessage", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DebugStream extends StObject {
    
    var debugStream: BunyanDebugStream
    
    var entry: Any
    
    var useColor: Boolean
  }
  object DebugStream {
    
    inline def apply(debugStream: BunyanDebugStream, entry: Any, useColor: Boolean): DebugStream = {
      val __obj = js.Dynamic.literal(debugStream = debugStream.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], useColor = useColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugStream]
    }
    
    extension [Self <: DebugStream](x: Self) {
      
      inline def setDebugStream(value: BunyanDebugStream): Self = StObject.set(x, "debugStream", value.asInstanceOf[js.Any])
      
      inline def setEntry(value: Any): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setUseColor(value: Boolean): Self = StObject.set(x, "useColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var file: String
    
    var func: String
    
    var line: Double
  }
  object File {
    
    inline def apply(file: String, func: String, line: Double): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFunc(value: String): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
