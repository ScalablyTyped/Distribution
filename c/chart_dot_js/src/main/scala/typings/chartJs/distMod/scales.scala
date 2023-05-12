package typings.chartJs.distMod

import typings.chartJs.anon.AngleLines
import typings.chartJs.anon.AngleLinescolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scales {
  
  @JSImport("chart.js/dist", "scales.CategoryScale")
  @js.native
  open class CategoryScale ()
    extends typings.chartJs.distScalesMod.CategoryScale
  /* static members */
  object CategoryScale {
    
    @JSImport("chart.js/dist", "scales.CategoryScale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist", "scales.CategoryScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist", "scales.CategoryScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js/dist", "scales.LinearScale")
  @js.native
  open class LinearScale ()
    extends typings.chartJs.distScalesMod.LinearScale
  /* static members */
  object LinearScale {
    
    @JSImport("chart.js/dist", "scales.LinearScale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist", "scales.LinearScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist", "scales.LinearScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js/dist", "scales.LogarithmicScale")
  @js.native
  open class LogarithmicScale ()
    extends typings.chartJs.distScalesMod.LogarithmicScale
  /* static members */
  object LogarithmicScale {
    
    @JSImport("chart.js/dist", "scales.LogarithmicScale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist", "scales.LogarithmicScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist", "scales.LogarithmicScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js/dist", "scales.RadialLinearScale")
  @js.native
  open class RadialLinearScale ()
    extends typings.chartJs.distScalesMod.RadialLinearScale
  /* static members */
  object RadialLinearScale {
    
    @JSImport("chart.js/dist", "scales.RadialLinearScale")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist", "scales.RadialLinearScale.defaultRoutes")
    @js.native
    def defaultRoutes: AngleLinescolor = js.native
    inline def defaultRoutes_=(x: AngleLinescolor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist", "scales.RadialLinearScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist", "scales.RadialLinearScale.descriptors")
    @js.native
    def descriptors: AngleLines = js.native
    inline def descriptors_=(x: AngleLines): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist", "scales.RadialLinearScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js/dist", "scales.TimeScale")
  @js.native
  open class TimeScale protected ()
    extends typings.chartJs.distScalesMod.TimeScale {
    /**
      * @param {object} props
      */
    def this(props: js.Object) = this()
  }
  /* static members */
  object TimeScale {
    
    @JSImport("chart.js/dist", "scales.TimeScale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist", "scales.TimeScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist", "scales.TimeScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js/dist", "scales.TimeSeriesScale")
  @js.native
  open class TimeSeriesScale ()
    extends typings.chartJs.distScalesMod.TimeSeriesScale
}
