package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distScalesScaleDotlinearMod {
  
  @JSImport("chart.js/dist/scales/scale.linear", JSImport.Default)
  @js.native
  open class default () extends LinearScale
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/scales/scale.linear", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/scales/scale.linear", "default.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/scales/scale.linear", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LinearScale
    extends typings.chartJs.distScalesScaleDotlinearbaseMod.default {
    
    def getValueForPixel(pixel: Any): Double = js.native
  }
}
