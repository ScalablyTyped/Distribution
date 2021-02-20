package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushpinTool extends StObject {
  
  def close(): Boolean = js.native
  
  def getCursor(): String = js.native
  
  def getIcon(): Icon = js.native
  
  def onmarkend(event: typings.baidumapWebSdk.anon.Marker): Unit = js.native
  
  def open(): Boolean = js.native
  
  def setCursor(cursor: String): String = js.native
  
  def setIcon(icon: Icon): Icon = js.native
}
object PushpinTool {
  
  @scala.inline
  def apply(
    close: () => Boolean,
    getCursor: () => String,
    getIcon: () => Icon,
    onmarkend: typings.baidumapWebSdk.anon.Marker => Unit,
    open: () => Boolean,
    setCursor: String => String,
    setIcon: Icon => Icon
  ): PushpinTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getCursor = js.Any.fromFunction0(getCursor), getIcon = js.Any.fromFunction0(getIcon), onmarkend = js.Any.fromFunction1(onmarkend), open = js.Any.fromFunction0(open), setCursor = js.Any.fromFunction1(setCursor), setIcon = js.Any.fromFunction1(setIcon))
    __obj.asInstanceOf[PushpinTool]
  }
  
  @scala.inline
  implicit class PushpinToolMutableBuilder[Self <: PushpinTool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Boolean): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCursor(value: () => String): Self = StObject.set(x, "getCursor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIcon(value: () => Icon): Self = StObject.set(x, "getIcon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnmarkend(value: typings.baidumapWebSdk.anon.Marker => Unit): Self = StObject.set(x, "onmarkend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: () => Boolean): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCursor(value: String => String): Self = StObject.set(x, "setCursor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIcon(value: Icon => Icon): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
  }
}
