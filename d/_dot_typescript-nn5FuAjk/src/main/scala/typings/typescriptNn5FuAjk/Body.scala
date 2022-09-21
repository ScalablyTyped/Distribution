package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  def arrayBuffer(): Promise[ArrayBuffer]
  
  def blob(): Promise[Blob]
  
  val body: ReadableStream[Uint8Array] | Null
  
  val bodyUsed: scala.Boolean
  
  def formData(): Promise[FormData]
  
  def json(): Promise[Any]
  
  def text(): Promise[java.lang.String]
}
object Body {
  
  inline def apply(
    arrayBuffer: () => Promise[ArrayBuffer],
    blob: () => Promise[Blob],
    bodyUsed: scala.Boolean,
    formData: () => Promise[FormData],
    json: () => Promise[Any],
    text: () => Promise[java.lang.String]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text), body = null)
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setArrayBuffer(value: () => Promise[ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    inline def setBlob(value: () => Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    inline def setBody(value: ReadableStream[Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUsed(value: scala.Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: () => Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
    
    inline def setJson(value: () => Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setText(value: () => Promise[java.lang.String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
