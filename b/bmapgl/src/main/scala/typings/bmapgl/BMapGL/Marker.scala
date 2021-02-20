package typings.bmapgl.BMapGL

import typings.bmapgl.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker extends Overlay {
  
  def addContextMenu(menu: ContextMenu): Unit = js.native
  
  def closeInfoWindow(): Unit = js.native
  
  def disableDragging(): Unit = js.native
  
  def disableMassClear(): Unit = js.native
  
  def enableDragging(): Unit = js.native
  
  def enableMassClear(): Unit = js.native
  
  def getIcon(): Icon = js.native
  
  def getLabel(): Label = js.native
  
  def getMap(): Map = js.native
  
  def getOffset(): Size = js.native
  
  def getPosition(): Point = js.native
  
  def getRotation(): Double = js.native
  
  def getShadow(): Unit = js.native
  
  def getTitle(): String = js.native
  
  def onclick(event: Target): Unit = js.native
  
  def ondblclick(event: typings.bmapgl.anon.Pixel): Unit = js.native
  
  def ondragend(event: typings.bmapgl.anon.Pixel): Unit = js.native
  
  def ondragging(event: typings.bmapgl.anon.Pixel): Unit = js.native
  
  def ondragstart(event: Target): Unit = js.native
  
  def oninfowindowclose(event: Target): Unit = js.native
  
  def oninfowindowopen(event: Target): Unit = js.native
  
  def onmousedown(event: typings.bmapgl.anon.Pixel): Unit = js.native
  
  def onmouseout(event: typings.bmapgl.anon.Pixel): Unit = js.native
  
  def onmouseover(event: typings.bmapgl.anon.Pixel): Unit = js.native
  
  def onmouseup(event: typings.bmapgl.anon.Pixel): Unit = js.native
  
  def onremove(event: Target): Unit = js.native
  
  def onrightclick(event: Target): Unit = js.native
  
  def openInfoWindow(infoWnd: InfoWindow): Unit = js.native
  
  def removeContextMenu(menu: ContextMenu): Unit = js.native
  
  def setAnimation(): Unit = js.native
  def setAnimation(animation: Animation): Unit = js.native
  
  def setIcon(icon: Icon): Unit = js.native
  
  def setLabel(label: Label): Unit = js.native
  
  def setOffset(offset: Size): Unit = js.native
  
  def setPosition(position: Point): Unit = js.native
  
  def setRotation(rotation: Double): Unit = js.native
  
  def setShadow(shadow: Icon): Unit = js.native
  
  def setTitle(title: String): Unit = js.native
  
  def setTop(isTop: Boolean): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
