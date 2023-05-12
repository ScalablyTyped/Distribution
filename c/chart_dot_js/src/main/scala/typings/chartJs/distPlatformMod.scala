package typings.chartJs

import org.scalablytyped.runtime.Instantiable0
import typings.chartJs.distPlatformPlatformDotbaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformMod {
  
  @JSImport("chart.js/dist/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js/dist/platform", "BasePlatform")
  @js.native
  open class BasePlatform () extends default
  
  @JSImport("chart.js/dist/platform", "BasicPlatform")
  @js.native
  open class BasicPlatform ()
    extends typings.chartJs.distPlatformPlatformDotbasicMod.default
  
  @JSImport("chart.js/dist/platform", "DomPlatform")
  @js.native
  open class DomPlatform ()
    extends typings.chartJs.distPlatformPlatformDotdomMod.default
  
  inline def detectPlatform(canvas: Any): Instantiable0[
    typings.chartJs.distPlatformPlatformDotbasicMod.default | typings.chartJs.distPlatformPlatformDotdomMod.default
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("_detectPlatform")(canvas.asInstanceOf[js.Any]).asInstanceOf[Instantiable0[
    typings.chartJs.distPlatformPlatformDotbasicMod.default | typings.chartJs.distPlatformPlatformDotdomMod.default
  ]]
}
