package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hotspot
  extends StObject
     with Overlay {
  
  def getPosition(): Point = js.native
  
  def getText(): String = js.native
  
  def getUserData(): Any = js.native
  
  def setPosition(position: Point): Unit = js.native
  
  def setText(text: String): Unit = js.native
  
  def setUserData(data: Any): Unit = js.native
}
