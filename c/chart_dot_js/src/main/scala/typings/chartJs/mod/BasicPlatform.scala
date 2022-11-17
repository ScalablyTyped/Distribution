package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Platform class for charts without access to the DOM or to many element properties
  * This platform is used by default for any chart passed an OffscreenCanvas.
  * @extends BasePlatform
  */
@js.native
trait BasicPlatform
  extends StObject
     with BasePlatform {
  
  def acquireContext(item: Any): Any = js.native
  
  def updateConfig(config: Any): scala.Unit = js.native
}
