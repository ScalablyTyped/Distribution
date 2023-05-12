package typings.chartJs.mod

import typings.chartJs.anon.AngleLines
import typings.chartJs.anon.AngleLinescolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scales {
  
  @JSImport("chart.js", "scales.CategoryScale")
  @js.native
  open class CategoryScale ()
    extends typings.chartJs.distMod.scales.CategoryScale
  /* static members */
  object CategoryScale {
    
    @JSImport("chart.js", "scales.CategoryScale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js", "scales.CategoryScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "scales.CategoryScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js", "scales.LinearScale")
  @js.native
  open class LinearScale ()
    extends typings.chartJs.distMod.scales.LinearScale
  /* static members */
  object LinearScale {
    
    @JSImport("chart.js", "scales.LinearScale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js", "scales.LinearScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "scales.LinearScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js", "scales.LogarithmicScale")
  @js.native
  open class LogarithmicScale ()
    extends typings.chartJs.distMod.scales.LogarithmicScale
  /* static members */
  object LogarithmicScale {
    
    @JSImport("chart.js", "scales.LogarithmicScale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js", "scales.LogarithmicScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "scales.LogarithmicScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js", "scales.RadialLinearScale")
  @js.native
  open class RadialLinearScale ()
    extends typings.chartJs.distMod.scales.RadialLinearScale
  /* static members */
  object RadialLinearScale {
    
    @JSImport("chart.js", "scales.RadialLinearScale")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js", "scales.RadialLinearScale.defaultRoutes")
    @js.native
    def defaultRoutes: AngleLinescolor = js.native
    inline def defaultRoutes_=(x: AngleLinescolor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js", "scales.RadialLinearScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "scales.RadialLinearScale.descriptors")
    @js.native
    def descriptors: AngleLines = js.native
    inline def descriptors_=(x: AngleLines): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "scales.RadialLinearScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js", "scales.TimeScale")
  @js.native
  open class TimeScale protected ()
    extends typings.chartJs.distMod.scales.TimeScale {
    /**
      * @param {object} props
      */
    def this(props: js.Object) = this()
  }
  /* static members */
  object TimeScale {
    
    @JSImport("chart.js", "scales.TimeScale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js", "scales.TimeScale.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "scales.TimeScale.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js", "scales.TimeSeriesScale")
  @js.native
  open class TimeSeriesScale ()
    extends typings.chartJs.distMod.scales.TimeSeriesScale
}
