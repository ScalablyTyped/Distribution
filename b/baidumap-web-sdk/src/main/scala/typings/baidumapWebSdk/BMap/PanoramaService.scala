package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaService extends StObject {
  
  def getPanoramaById(id: String, callback: js.Function1[/* data */ PanoramaData, Unit]): Unit = js.native
  
  def getPanoramaByLocation(point: Point): Unit = js.native
  def getPanoramaByLocation(point: Point, radius: Double): Unit = js.native
  def getPanoramaByLocation(point: Point, radius: Double, callback: js.Function1[/* data */ PanoramaData, Unit]): Unit = js.native
  def getPanoramaByLocation(point: Point, radius: Unit, callback: js.Function1[/* data */ PanoramaData, Unit]): Unit = js.native
}
