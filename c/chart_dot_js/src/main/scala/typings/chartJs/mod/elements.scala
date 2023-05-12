package typings.chartJs.mod

import typings.chartJs.anon.Angle
import typings.chartJs.anon.BackgroundColor
import typings.chartJs.anon.BorderColor
import typings.chartJs.anon.BorderWidth
import typings.chartJs.anon.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elements {
  
  @JSImport("chart.js", "elements.ArcElement")
  @js.native
  open class ArcElement protected ()
    extends typings.chartJs.distMod.elements.ArcElement {
    def this(cfg: Any) = this()
  }
  /* static members */
  object ArcElement {
    
    @JSImport("chart.js", "elements.ArcElement")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js", "elements.ArcElement.defaultRoutes")
    @js.native
    def defaultRoutes: BackgroundColor = js.native
    inline def defaultRoutes_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "elements.ArcElement.defaults")
    @js.native
    def defaults: Angle = js.native
    inline def defaults_=(x: Angle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "elements.ArcElement.descriptors")
    @js.native
    def descriptors: Indexable = js.native
    inline def descriptors_=(x: Indexable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "elements.ArcElement.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js", "elements.BarElement")
  @js.native
  open class BarElement protected ()
    extends typings.chartJs.distMod.elements.BarElement {
    def this(cfg: Any) = this()
  }
  /* static members */
  object BarElement {
    
    @JSImport("chart.js", "elements.BarElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js", "elements.BarElement.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "elements.BarElement.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js", "elements.LineElement")
  @js.native
  open class LineElement protected ()
    extends typings.chartJs.distMod.elements.LineElement {
    def this(cfg: Any) = this()
  }
  /* static members */
  object LineElement {
    
    @JSImport("chart.js", "elements.LineElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js", "elements.LineElement.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "elements.LineElement.descriptors")
    @js.native
    def descriptors: Indexable = js.native
    inline def descriptors_=(x: Indexable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "elements.LineElement.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js", "elements.PointElement")
  @js.native
  open class PointElement protected ()
    extends typings.chartJs.distMod.elements.PointElement {
    def this(cfg: Any) = this()
  }
  /* static members */
  object PointElement {
    
    @JSImport("chart.js", "elements.PointElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js", "elements.PointElement.defaultRoutes")
    @js.native
    def defaultRoutes: BorderColor = js.native
    inline def defaultRoutes_=(x: BorderColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js", "elements.PointElement.defaults")
    @js.native
    def defaults: BorderWidth = js.native
    inline def defaults_=(x: BorderWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js", "elements.PointElement.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
