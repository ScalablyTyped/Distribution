package typings.bmapgl.BMapGL

import typings.bmapgl.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundOverlay extends Overlay {
  
  def getBounds(): Bounds = js.native
  
  def getDispalyOnMaxLevel(): Double = js.native
  
  def getDisplayOnMinLevel(): Double = js.native
  
  def getImageURL(): String = js.native
  
  def getOpacity(): Double = js.native
  
  def onclick(event: Target): Unit = js.native
  
  def ondblclick(event: Target): Unit = js.native
  
  def setBounds(bounds: Bounds): Unit = js.native
  
  def setDispalyOnMaxLevel(level: Double): Unit = js.native
  
  def setDisplayOnMinLevel(level: Double): Unit = js.native
  
  def setImageURL(url: String): Unit = js.native
  
  def setOpacity(opcity: Double): Unit = js.native
}
