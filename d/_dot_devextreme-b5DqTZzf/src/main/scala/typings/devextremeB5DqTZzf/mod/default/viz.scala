package typings.devextremeB5DqTZzf.mod.default

import typings.devextremeB5DqTZzf.anon.BackgroundColor
import typings.devextremeB5DqTZzf.anon.BaseColorSet
import typings.devextremeB5DqTZzf.anon.FileName
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.equirectangular
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.lambert
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.mercator
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.miller
import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent.Properties
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DefaultOptionsRule
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.PaletteType
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.VectorMapProjectionConfig
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxBulletOptions
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxCircularGaugeOptions
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxLinearGaugeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viz {
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.BaseChart")
  @js.native
  open class BaseChart[TProperties] ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseChart[TProperties]
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.BaseGauge")
  @js.native
  open class BaseGauge[TProperties] ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseGauge[TProperties]
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.BaseSparkline")
  @js.native
  open class BaseSparkline[TProperties] ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseSparkline[TProperties]
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.BaseWidget")
  @js.native
  open class BaseWidget[TProperties] ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseWidget[TProperties]
  /* static members */
  object BaseWidget {
    
    @JSImport(".devextreme-b5DqTZzf", "default.viz.BaseWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Specifies the device-dependent default configuration properties for this component.
      * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
      */
    inline def defaultOptions[TProperties](rule: DefaultOptionsRule[TProperties]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")(rule.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def currentPalette(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentPalette")().asInstanceOf[String]
  inline def currentPalette(paletteName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("currentPalette")(paletteName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def currentTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentTheme")().asInstanceOf[String]
  inline def currentTheme(platform: String, colorScheme: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("currentTheme")(platform.asInstanceOf[js.Any], colorScheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def currentTheme(theme: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("currentTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxBarGauge")
  @js.native
  open class dxBarGauge ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxBarGauge
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxBullet")
  @js.native
  open class dxBullet ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseSparkline[dxBulletOptions]
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxChart")
  @js.native
  open class dxChart ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxChart
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxCircularGauge")
  @js.native
  open class dxCircularGauge ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseGauge[dxCircularGaugeOptions]
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxFunnel")
  @js.native
  open class dxFunnel ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxFunnel
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxLinearGauge")
  @js.native
  open class dxLinearGauge ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseGauge[dxLinearGaugeOptions]
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxPieChart")
  @js.native
  open class dxPieChart ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxPieChart
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxPolarChart")
  @js.native
  open class dxPolarChart ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxPolarChart
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxRangeSelector")
  @js.native
  open class dxRangeSelector ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxRangeSelector
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxSankey")
  @js.native
  open class dxSankey ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxSankey
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxSparkline")
  @js.native
  open class dxSparkline ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxSparkline
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxTreeMap")
  @js.native
  open class dxTreeMap ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxTreeMap
  
  @JSImport(".devextreme-b5DqTZzf", "default.viz.dxVectorMap")
  @js.native
  open class dxVectorMap ()
    extends StObject
       with typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxVectorMap
  
  inline def exportFromMarkup(markup: String, options: BackgroundColor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportFromMarkup")(markup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exportWidgets(
    widgetInstances: js.Array[js.Array[typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent[Properties]]]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exportWidgets")(widgetInstances.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exportWidgets(
    widgetInstances: js.Array[js.Array[typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent[Properties]]],
    options: FileName
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportWidgets")(widgetInstances.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generateColors(palette: js.Array[String], count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def generateColors(palette: PaletteType, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getMarkup(widgetInstances: js.Array[typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponent[Properties]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMarkup")(widgetInstances.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPalette(paletteName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPalette")(paletteName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getTheme(theme: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object map {
    
    object projection {
      
      inline def apply(data: VectorMapProjectionConfig): Any = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      @JSImport(".devextreme-b5DqTZzf", "default.viz.map.projection")
      @js.native
      val ^ : js.Any = js.native
      
      inline def add(name: String, projection: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /**
        * Adds a new projection to the internal projection storage.
        */
      inline def add(name: String, projection: VectorMapProjectionConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def get(name: equirectangular | lambert | mercator | miller): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
      /**
        * Gets a predefined or custom projection from the projection storage.
        */
      inline def get(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
  }
  
  inline def refreshPaths(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshPaths")().asInstanceOf[Unit]
  
  inline def refreshTheme(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshTheme")().asInstanceOf[Unit]
  
  inline def registerPalette(paletteName: String, palette: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPalette")(paletteName.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerTheme(customTheme: Any, baseTheme: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(customTheme.asInstanceOf[js.Any], baseTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
