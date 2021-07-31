package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geolocation extends StObject {
  
  def getCurrentPosition(callback: js.Function1[/* result */ GeolocationResult, Unit]): Unit = js.native
  def getCurrentPosition(callback: js.Function1[/* result */ GeolocationResult, Unit], opts: PositionOptions): Unit = js.native
  
  def getStatus(): ServiceStatusCode = js.native
}
