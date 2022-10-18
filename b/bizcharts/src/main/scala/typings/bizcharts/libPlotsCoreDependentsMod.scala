package typings.bizcharts

import org.scalablytyped.runtime.Instantiable0
import typings.antvAdjust.anon.AdjustCfgdimValuesMapDimV
import typings.antvAdjust.libAdjustsAdjustMod.AdjustConstructor
import typings.antvAttr.libInterfaceMod.AttributeCfg
import typings.antvComponent.libTypesMod.ComponentCfg
import typings.antvComponent.libTypesMod.CrosshairBaseCfg
import typings.antvComponent.libTypesMod.GroupComponentCfg
import typings.antvComponent.libTypesMod.HtmlCrossHairCfg
import typings.antvComponent.libTypesMod.TooltipCfg
import typings.antvComponent.mod.Axis.Circle
import typings.antvComponent.mod.Axis.Line
import typings.antvComponent.mod.Legend.Category
import typings.antvComponent.mod.Legend.Continuous
import typings.antvComponent.mod.Tooltip.Html
import typings.antvCoord.anon.PartialOptions
import typings.antvGBase.libTypesMod.ShapeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsCoreDependentsMod {
  
  @JSImport("bizcharts/lib/plots/core/dependents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("bizcharts/lib/plots/core/dependents", "AbstractGroup")
  @js.native
  open class AbstractGroup ()
    extends typings.antvGBase.mod.AbstractGroup
  
  /* note: abstract class */ @JSImport("bizcharts/lib/plots/core/dependents", "AbstractShape")
  @js.native
  open class AbstractShape protected ()
    extends typings.antvGBase.mod.AbstractShape {
    def this(cfg: ShapeCfg) = this()
  }
  
  /* note: abstract class */ @JSImport("bizcharts/lib/plots/core/dependents", "Adjust")
  @js.native
  open class Adjust protected ()
    extends typings.antvAdjust.libFactoryMod.Adjust {
    def this(cfg: AdjustCfgdimValuesMapDimV) = this()
  }
  
  object Annotation {
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.Arc")
    @js.native
    open class Arc ()
      extends typings.antvComponent.mod.Annotation.Arc
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.DataMarker")
    @js.native
    open class DataMarker ()
      extends typings.antvComponent.mod.Annotation.DataMarker
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.DataRegion")
    @js.native
    open class DataRegion ()
      extends typings.antvComponent.mod.Annotation.DataRegion
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.Html")
    @js.native
    open class Html ()
      extends typings.antvComponent.mod.Annotation.Html
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.Image")
    @js.native
    open class Image ()
      extends typings.antvComponent.mod.Annotation.Image
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.Line")
    @js.native
    open class Line ()
      extends typings.antvComponent.mod.Annotation.Line
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.Region")
    @js.native
    open class Region ()
      extends typings.antvComponent.mod.Annotation.Region
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.RegionFilter")
    @js.native
    open class RegionFilter ()
      extends typings.antvComponent.mod.Annotation.RegionFilter
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.Shape")
    @js.native
    open class Shape ()
      extends typings.antvComponent.mod.Annotation.Shape
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Annotation.Text")
    @js.native
    open class Text ()
      extends typings.antvComponent.mod.Annotation.Text
  }
  
  @JSImport("bizcharts/lib/plots/core/dependents", "Attribute")
  @js.native
  open class Attribute protected ()
    extends typings.antvAttr.libFactoryMod.Attribute {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("bizcharts/lib/plots/core/dependents", "Color")
  @js.native
  open class Color protected ()
    extends typings.antvAttr.mod.Color {
    def this(cfg: AttributeCfg) = this()
  }
  
  /* note: abstract class */ @JSImport("bizcharts/lib/plots/core/dependents", "Component")
  @js.native
  open class Component[T /* <: ComponentCfg */] protected ()
    extends typings.antvComponent.mod.Component[T] {
    def this(cfg: T) = this()
  }
  
  @JSImport("bizcharts/lib/plots/core/dependents", "Coordinate")
  @js.native
  /**
    * Create a new Coordinate Object.
    * @param options Custom options
    */
  open class Coordinate ()
    extends typings.antvCoord.mod.Coordinate {
    def this(options: PartialOptions) = this()
  }
  
  object Crosshair {
    
    /* note: abstract class */ @JSImport("bizcharts/lib/plots/core/dependents", "Crosshair.Base")
    @js.native
    open class Base[T /* <: CrosshairBaseCfg */] ()
      extends typings.antvComponent.mod.Crosshair.Base[T]
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Crosshair.Circle")
    @js.native
    open class Circle ()
      extends typings.antvComponent.mod.Crosshair.Circle
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Crosshair.Html")
    @js.native
    open class Html[T /* <: HtmlCrossHairCfg */] ()
      extends typings.antvComponent.mod.Crosshair.Html[T]
    
    @JSImport("bizcharts/lib/plots/core/dependents", "Crosshair.Line")
    @js.native
    open class Line ()
      extends typings.antvComponent.mod.Crosshair.Line
  }
  
  @JSImport("bizcharts/lib/plots/core/dependents", "Event")
  @js.native
  open class Event protected ()
    extends typings.antvGBase.mod.Event {
    def this(`type`: Any, event: Any) = this()
  }
  
  /* note: abstract class */ @JSImport("bizcharts/lib/plots/core/dependents", "GroupComponent")
  @js.native
  open class GroupComponent[T /* <: GroupComponentCfg */] ()
    extends typings.antvComponent.mod.GroupComponent[T]
  
  /* note: abstract class */ @JSImport("bizcharts/lib/plots/core/dependents", "HtmlComponent")
  @js.native
  open class HtmlComponent[T /* <: ComponentCfg */] ()
    extends typings.antvComponent.mod.HtmlComponent[T]
  
  @JSImport("bizcharts/lib/plots/core/dependents", "Scrollbar")
  @js.native
  open class Scrollbar ()
    extends typings.antvComponent.mod.Scrollbar
  
  @JSImport("bizcharts/lib/plots/core/dependents", "Slider")
  @js.native
  open class Slider ()
    extends typings.antvComponent.mod.Slider
  
  /**
    * 根据类型获取 Adjust 类
    * @param type
    */
  inline def getAdjust(`type`: String): AdjustConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjust")(`type`.asInstanceOf[js.Any]).asInstanceOf[AdjustConstructor]
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  inline def getAttribute(`type`: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * 注册自定义 Adjust
    * @param type
    * @param ctor
    */
  inline def registerAdjust(`type`: String, ctor: AdjustConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdjust")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CategoryLegend = Instantiable0[Category]
  
  type CircleAxis = Instantiable0[Circle]
  
  type CircleGrid = Instantiable0[typings.antvComponent.mod.Grid.Circle]
  
  type ContinuousLegend = Instantiable0[Continuous]
  
  type HtmlTooltip = Instantiable0[Html[TooltipCfg]]
  
  type IG = Any
  
  type LineAxis = Instantiable0[Line]
  
  type LineGrid = Instantiable0[typings.antvComponent.mod.Grid.Line]
}
