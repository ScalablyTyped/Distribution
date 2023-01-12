package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StringDictionary
import typings.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label
  extends StObject
     with Overlay {
  
  def addEventListener(event: String, handler: Callback): Unit
  
  def disableMassClear(): Unit
  
  def enableMassClear(): Unit
  
  def getMap(): Map
  
  def getOffset(): Size
  
  def getPosition(): Point
  
  def getTitle(): String
  
  def onclick(event: Target): Unit
  
  def ondblclick(event: Target): Unit
  
  def onmousedown(event: Target): Unit
  
  def onmouseout(event: Target): Unit
  
  def onmouseover(event: Target): Unit
  
  def onmouseup(event: Target): Unit
  
  def onremove(event: Target): Unit
  
  def onrightclick(event: Target): Unit
  
  def removeEventListener(event: String, handler: Callback): Unit
  
  def setContent(content: String): Unit
  
  def setOffset(offset: Size): Unit
  
  def setPosition(position: Point): Unit
  
  def setStyle(styles: StringDictionary[String | Double]): Unit
  
  def setTitle(title: String): Unit
  
  def setZIndex(zIndex: Double): Unit
}
object Label {
  
  inline def apply(
    addEventListener: (String, Callback) => Unit,
    disableMassClear: () => Unit,
    enableMassClear: () => Unit,
    getMap: () => Map,
    getOffset: () => Size,
    getPosition: () => Point,
    getTitle: () => String,
    onclick: Target => Unit,
    ondblclick: Target => Unit,
    onmousedown: Target => Unit,
    onmouseout: Target => Unit,
    onmouseover: Target => Unit,
    onmouseup: Target => Unit,
    onremove: Target => Unit,
    onrightclick: Target => Unit,
    removeEventListener: (String, Callback) => Unit,
    setContent: String => Unit,
    setOffset: Size => Unit,
    setPosition: Point => Unit,
    setStyle: StringDictionary[String | Double] => Unit,
    setTitle: String => Unit,
    setZIndex: Double => Unit
  ): Label = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), disableMassClear = js.Any.fromFunction0(disableMassClear), enableMassClear = js.Any.fromFunction0(enableMassClear), getMap = js.Any.fromFunction0(getMap), getOffset = js.Any.fromFunction0(getOffset), getPosition = js.Any.fromFunction0(getPosition), getTitle = js.Any.fromFunction0(getTitle), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), onmousedown = js.Any.fromFunction1(onmousedown), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onmouseup = js.Any.fromFunction1(onmouseup), onremove = js.Any.fromFunction1(onremove), onrightclick = js.Any.fromFunction1(onrightclick), removeEventListener = js.Any.fromFunction2(removeEventListener), setContent = js.Any.fromFunction1(setContent), setOffset = js.Any.fromFunction1(setOffset), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTitle = js.Any.fromFunction1(setTitle), setZIndex = js.Any.fromFunction1(setZIndex))
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setDisableMassClear(value: () => Unit): Self = StObject.set(x, "disableMassClear", js.Any.fromFunction0(value))
    
    inline def setEnableMassClear(value: () => Unit): Self = StObject.set(x, "enableMassClear", js.Any.fromFunction0(value))
    
    inline def setGetMap(value: () => Map): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    inline def setGetOffset(value: () => Size): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setOnclick(value: Target => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    inline def setOndblclick(value: Target => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    inline def setOnmousedown(value: Target => Unit): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1(value))
    
    inline def setOnmouseout(value: Target => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    inline def setOnmouseover(value: Target => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    inline def setOnmouseup(value: Target => Unit): Self = StObject.set(x, "onmouseup", js.Any.fromFunction1(value))
    
    inline def setOnremove(value: Target => Unit): Self = StObject.set(x, "onremove", js.Any.fromFunction1(value))
    
    inline def setOnrightclick(value: Target => Unit): Self = StObject.set(x, "onrightclick", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    inline def setSetOffset(value: Size => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: Point => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setSetStyle(value: StringDictionary[String | Double] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetZIndex(value: Double => Unit): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1(value))
  }
}
