package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends StObject {
  
  def getDistance(): String | Double = js.native
  def getDistance(format: Boolean): String | Double = js.native
  
  def getIndex(): Double = js.native
  
  def getNumRoutes(): Double = js.native
  
  def getPath(): js.Array[Point] = js.native
  
  def getPoints(): js.Array[Point] = js.native
  
  def getPolyline(): Polyline = js.native
  
  def getRouteType(): RouteType = js.native
  
  def getStep(i: Double): Step = js.native
}
