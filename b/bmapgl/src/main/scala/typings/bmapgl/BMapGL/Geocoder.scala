package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geocoder extends StObject {
  
  def getLocation(point: Point, callback: js.Function1[/* result */ GeocoderResult, Unit]): Unit = js.native
  def getLocation(point: Point, callback: js.Function1[/* result */ GeocoderResult, Unit], opts: LocationOptions): Unit = js.native
  
  def getPoint(address: String, callback: js.Function1[/* point */ Point, Unit], city: String): Unit = js.native
}
