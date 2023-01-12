package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenu extends StObject {
  
  def addItem(item: MenuItem): Unit
  
  def addSeparator(): Unit
  
  def getItem(index: Double): MenuItem
  
  def onclose(event: typings.baidumapWebSdk.anon.Pixel): Unit
  
  def onopen(event: typings.baidumapWebSdk.anon.Pixel): Unit
  
  def removeItem(item: MenuItem): Unit
  
  def removeSeparator(index: Double): Unit
}
object ContextMenu {
  
  inline def apply(
    addItem: MenuItem => Unit,
    addSeparator: () => Unit,
    getItem: Double => MenuItem,
    onclose: typings.baidumapWebSdk.anon.Pixel => Unit,
    onopen: typings.baidumapWebSdk.anon.Pixel => Unit,
    removeItem: MenuItem => Unit,
    removeSeparator: Double => Unit
  ): ContextMenu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), addSeparator = js.Any.fromFunction0(addSeparator), getItem = js.Any.fromFunction1(getItem), onclose = js.Any.fromFunction1(onclose), onopen = js.Any.fromFunction1(onopen), removeItem = js.Any.fromFunction1(removeItem), removeSeparator = js.Any.fromFunction1(removeSeparator))
    __obj.asInstanceOf[ContextMenu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextMenu] (val x: Self) extends AnyVal {
    
    inline def setAddItem(value: MenuItem => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction1(value))
    
    inline def setAddSeparator(value: () => Unit): Self = StObject.set(x, "addSeparator", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: Double => MenuItem): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setOnclose(value: typings.baidumapWebSdk.anon.Pixel => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
    
    inline def setOnopen(value: typings.baidumapWebSdk.anon.Pixel => Unit): Self = StObject.set(x, "onopen", js.Any.fromFunction1(value))
    
    inline def setRemoveItem(value: MenuItem => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setRemoveSeparator(value: Double => Unit): Self = StObject.set(x, "removeSeparator", js.Any.fromFunction1(value))
  }
}
