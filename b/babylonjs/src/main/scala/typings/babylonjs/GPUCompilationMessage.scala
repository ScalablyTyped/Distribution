package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUCompilationMessage extends StObject {
  
  val length: Double
  
  val lineNum: Double
  
  val linePos: Double
  
  val message: String
  
  val offset: Double
  
  val `type`: GPUCompilationMessageType
}
object GPUCompilationMessage {
  
  inline def apply(
    length: Double,
    lineNum: Double,
    linePos: Double,
    message: String,
    offset: Double,
    `type`: GPUCompilationMessageType
  ): GPUCompilationMessage = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], lineNum = lineNum.asInstanceOf[js.Any], linePos = linePos.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUCompilationMessage]
  }
  
  extension [Self <: GPUCompilationMessage](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLineNum(value: Double): Self = StObject.set(x, "lineNum", value.asInstanceOf[js.Any])
    
    inline def setLinePos(value: Double): Self = StObject.set(x, "linePos", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setType(value: GPUCompilationMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
