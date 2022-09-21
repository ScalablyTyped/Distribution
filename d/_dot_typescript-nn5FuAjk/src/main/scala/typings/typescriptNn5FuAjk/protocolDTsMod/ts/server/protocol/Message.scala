package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.event_
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.request
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TypeScript Server message
  */
trait Message extends StObject {
  
  /**
    * Sequence number of the message
    */
  var seq: Double
  
  /**
    * One of "request", "response", or "event"
    */
  var `type`: request | response | event_
}
object Message {
  
  inline def apply(seq: Double, `type`: request | response | event_): Message = {
    val __obj = js.Dynamic.literal(seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setType(value: request | response | event_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
