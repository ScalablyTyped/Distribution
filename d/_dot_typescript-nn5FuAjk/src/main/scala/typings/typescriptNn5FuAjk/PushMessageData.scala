package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Push API interface provides methods which let you retrieve the push data sent by a server in various formats.
  * Available only in secure contexts.
  */
trait PushMessageData extends StObject {
  
  def arrayBuffer(): ArrayBuffer
  
  def blob(): Blob
  
  def json(): Any
  
  def text(): java.lang.String
}
object PushMessageData {
  
  inline def apply(arrayBuffer: () => ArrayBuffer, blob: () => Blob, json: () => Any, text: () => java.lang.String): PushMessageData = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[PushMessageData]
  }
  
  extension [Self <: PushMessageData](x: Self) {
    
    inline def setArrayBuffer(value: () => ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    inline def setBlob(value: () => Blob): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    inline def setJson(value: () => Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setText(value: () => java.lang.String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
