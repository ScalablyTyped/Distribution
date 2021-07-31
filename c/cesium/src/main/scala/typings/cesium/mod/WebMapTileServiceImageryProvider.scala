package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WebMapTileServiceImageryProvider")
@js.native
class WebMapTileServiceImageryProvider protected () extends ImageryProvider {
  def this(options: typings.cesium.anon.Clock) = this()
  
  var clock: Clock = js.native
  
  var dimensions: js.Any = js.native
  
  val format: String = js.native
  
  var times: TimeIntervalCollection = js.native
  
  val url: String = js.native
}
