package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushpinTool extends StObject {
  
  def close(): Boolean
  
  def getCursor(): String
  
  def getIcon(): Icon
  
  def onmarkend(event: typings.bmapgl.anon.Marker): Unit
  
  def open(): Boolean
  
  def setCursor(cursor: String): String
  
  def setIcon(icon: Icon): Icon
}
object PushpinTool {
  
  inline def apply(
    close: () => Boolean,
    getCursor: () => String,
    getIcon: () => Icon,
    onmarkend: typings.bmapgl.anon.Marker => Unit,
    open: () => Boolean,
    setCursor: String => String,
    setIcon: Icon => Icon
  ): PushpinTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getCursor = js.Any.fromFunction0(getCursor), getIcon = js.Any.fromFunction0(getIcon), onmarkend = js.Any.fromFunction1(onmarkend), open = js.Any.fromFunction0(open), setCursor = js.Any.fromFunction1(setCursor), setIcon = js.Any.fromFunction1(setIcon))
    __obj.asInstanceOf[PushpinTool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushpinTool] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Boolean): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setGetCursor(value: () => String): Self = StObject.set(x, "getCursor", js.Any.fromFunction0(value))
    
    inline def setGetIcon(value: () => Icon): Self = StObject.set(x, "getIcon", js.Any.fromFunction0(value))
    
    inline def setOnmarkend(value: typings.bmapgl.anon.Marker => Unit): Self = StObject.set(x, "onmarkend", js.Any.fromFunction1(value))
    
    inline def setOpen(value: () => Boolean): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setSetCursor(value: String => String): Self = StObject.set(x, "setCursor", js.Any.fromFunction1(value))
    
    inline def setSetIcon(value: Icon => Icon): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
  }
}
