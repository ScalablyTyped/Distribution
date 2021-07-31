package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenu extends StObject {
  
  def addItem(item: MenuItem): Unit
  
  def addSeparator(): Unit
  
  def getItem(index: Double): MenuItem
  
  def onclose(event: typings.bmapgl.anon.Pixel): Unit
  
  def onopen(event: typings.bmapgl.anon.Pixel): Unit
  
  def removeItem(item: MenuItem): Unit
  
  def removeSeparator(index: Double): Unit
}
object ContextMenu {
  
  @scala.inline
  def apply(
    addItem: MenuItem => Unit,
    addSeparator: () => Unit,
    getItem: Double => MenuItem,
    onclose: typings.bmapgl.anon.Pixel => Unit,
    onopen: typings.bmapgl.anon.Pixel => Unit,
    removeItem: MenuItem => Unit,
    removeSeparator: Double => Unit
  ): ContextMenu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), addSeparator = js.Any.fromFunction0(addSeparator), getItem = js.Any.fromFunction1(getItem), onclose = js.Any.fromFunction1(onclose), onopen = js.Any.fromFunction1(onopen), removeItem = js.Any.fromFunction1(removeItem), removeSeparator = js.Any.fromFunction1(removeSeparator))
    __obj.asInstanceOf[ContextMenu]
  }
  
  @scala.inline
  implicit class ContextMenuMutableBuilder[Self <: ContextMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddItem(value: MenuItem => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSeparator(value: () => Unit): Self = StObject.set(x, "addSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => MenuItem): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclose(value: typings.bmapgl.anon.Pixel => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnopen(value: typings.bmapgl.anon.Pixel => Unit): Self = StObject.set(x, "onopen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItem(value: MenuItem => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSeparator(value: Double => Unit): Self = StObject.set(x, "removeSeparator", js.Any.fromFunction1(value))
  }
}
