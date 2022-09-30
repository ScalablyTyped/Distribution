package typings.bizcharts

import typings.antvCoord.anon.PartialOptions
import typings.antvG2.animationMod.Animation
import typings.antvG2.anon.StartAngle
import typings.antvG2.anon.X
import typings.antvG2.anon.namestringvaluestringMark
import typings.antvG2.controllerBaseMod.ControllerCtor
import typings.antvG2.dependentsMod.Attribute
import typings.antvG2.dependentsMod.IG
import typings.antvG2.elementMod.ElementCfg
import typings.antvG2.geometryBaseMod.GeometryCfg
import typings.antvG2.geometryBaseMod.default
import typings.antvG2.grammarInteractionMod.InteractionSteps
import typings.antvG2.interactionInteractionMod.InteractionConstructor
import typings.antvG2.labelBaseMod.GeometryLabelConstructor
import typings.antvG2.labelMod.GeometryLabelsLayoutFn
import typings.antvG2.libInterfaceMod.FacetCfg
import typings.antvG2.libInterfaceMod.FacetCtor
import typings.antvG2.libInterfaceMod.FacetData
import typings.antvG2.libInterfaceMod.IInteractionContext
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.MappingDatum
import typings.antvG2.libInterfaceMod.MarkerCfg
import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.Position
import typings.antvG2.libInterfaceMod.RangePoint
import typings.antvG2.libInterfaceMod.RegisterShape
import typings.antvG2.libInterfaceMod.RegisterShapeFactory
import typings.antvG2.libInterfaceMod.Shape
import typings.antvG2.libInterfaceMod.ShapeFactory
import typings.antvG2.libInterfaceMod.ShapeInfo
import typings.antvG2.libInterfaceMod.ShapePoint
import typings.antvG2.libInterfaceMod.ShapeVertices
import typings.antvG2.libInterfaceMod.StyleSheet
import typings.antvG2.libInterfaceMod.TooltipTitle
import typings.antvG2.registerMod.ActionConstructor
import typings.antvG2.utilLegendMod.ComponentLegendItem
import typings.antvG2.viewMod.View
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.ShapeAttrs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("bizcharts/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts/lib/core", "ComponentController")
  @js.native
  abstract class ComponentController[O] protected ()
    extends typings.antvG2.coreMod.ComponentController[O] {
    def this(view: View) = this()
  }
  
  @JSImport("bizcharts/lib/core", "Coordinate")
  @js.native
  /**
    * Create a new Coordinate Object.
    * @param options Custom options
    */
  open class Coordinate ()
    extends typings.antvG2.coreMod.Coordinate {
    def this(options: PartialOptions) = this()
  }
  
  @JSImport("bizcharts/lib/core", "DIRECTION")
  @js.native
  object DIRECTION extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.antvG2.constantMod.DIRECTION & String] = js.native
    
    /* "bottom" */ val BOTTOM: typings.antvG2.constantMod.DIRECTION.BOTTOM & String = js.native
    
    /* "bottom-left" */ val BOTTOM_LEFT: typings.antvG2.constantMod.DIRECTION.BOTTOM_LEFT & String = js.native
    
    /* "bottom-right" */ val BOTTOM_RIGHT: typings.antvG2.constantMod.DIRECTION.BOTTOM_RIGHT & String = js.native
    
    /* "circle" */ val CIRCLE: typings.antvG2.constantMod.DIRECTION.CIRCLE & String = js.native
    
    /* "left" */ val LEFT: typings.antvG2.constantMod.DIRECTION.LEFT & String = js.native
    
    /* "left-bottom" */ val LEFT_BOTTOM: typings.antvG2.constantMod.DIRECTION.LEFT_BOTTOM & String = js.native
    
    /* "left-top" */ val LEFT_TOP: typings.antvG2.constantMod.DIRECTION.LEFT_TOP & String = js.native
    
    /* "none" */ val NONE: typings.antvG2.constantMod.DIRECTION.NONE & String = js.native
    
    /* "radius" */ val RADIUS: typings.antvG2.constantMod.DIRECTION.RADIUS & String = js.native
    
    /* "right" */ val RIGHT: typings.antvG2.constantMod.DIRECTION.RIGHT & String = js.native
    
    /* "right-bottom" */ val RIGHT_BOTTOM: typings.antvG2.constantMod.DIRECTION.RIGHT_BOTTOM & String = js.native
    
    /* "right-top" */ val RIGHT_TOP: typings.antvG2.constantMod.DIRECTION.RIGHT_TOP & String = js.native
    
    /* "top" */ val TOP: typings.antvG2.constantMod.DIRECTION.TOP & String = js.native
    
    /* "top-left" */ val TOP_LEFT: typings.antvG2.constantMod.DIRECTION.TOP_LEFT & String = js.native
    
    /* "top-right" */ val TOP_RIGHT: typings.antvG2.constantMod.DIRECTION.TOP_RIGHT & String = js.native
  }
  
  @JSImport("bizcharts/lib/core", "Element")
  @js.native
  open class Element protected ()
    extends typings.antvG2.coreMod.Element {
    def this(cfg: ElementCfg) = this()
  }
  
  @JSImport("bizcharts/lib/core", "Facet")
  @js.native
  abstract class Facet[C /* <: FacetCfg[FacetData] */, F /* <: FacetData */] protected ()
    extends typings.antvG2.coreMod.Facet[C, F] {
    def this(view: View, cfg: C) = this()
  }
  
  object GLOBAL {
    
    @JSImport("bizcharts/lib/core", "GLOBAL")
    @js.native
    val ^ : js.Any = js.native
    
    /** 全局语言 */
    @JSImport("bizcharts/lib/core", "GLOBAL.locale")
    @js.native
    def locale: String = js.native
    inline def locale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bizcharts/lib/core", "Geometry")
  @js.native
  open class Geometry[S /* <: ShapePoint */] protected ()
    extends typings.antvG2.coreMod.Geometry[S] {
    /**
      * 创建 Geometry 实例。
      * @param cfg
      */
    def this(cfg: GeometryCfg) = this()
  }
  
  @JSImport("bizcharts/lib/core", "GeometryLabel")
  @js.native
  open class GeometryLabel protected ()
    extends typings.antvG2.coreMod.GeometryLabel {
    def this(geometry: default[ShapePoint]) = this()
  }
  
  /**
    * Action 的基类
    */
  @JSImport("bizcharts/lib/core", "InteractionAction")
  @js.native
  abstract class InteractionAction[T] protected ()
    extends typings.antvG2.coreMod.InteractionAction[T] {
    def this(context: IInteractionContext) = this()
    def this(context: IInteractionContext, cfg: T) = this()
  }
  
  @JSImport("bizcharts/lib/core", "LAYER")
  @js.native
  object LAYER extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.antvG2.constantMod.LAYER & String] = js.native
    
    /* "bg" */ val BG: typings.antvG2.constantMod.LAYER.BG & String = js.native
    
    /* "fore" */ val FORE: typings.antvG2.constantMod.LAYER.FORE & String = js.native
    
    /* "mid" */ val MID: typings.antvG2.constantMod.LAYER.MID & String = js.native
  }
  
  @JSImport("bizcharts/lib/core", "TooltipController")
  @js.native
  open class TooltipController ()
    extends typings.antvG2.coreMod.TooltipController
  
  object Util {
    
    @JSImport("bizcharts/lib/core", "Util")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bizcharts/lib/core", "Util.getAngle")
    @js.native
    def getAngle: js.Function2[
        /* shapeModel */ ShapeInfo, 
        /* coordinate */ typings.antvG2.dependentsMod.Coordinate, 
        StartAngle
      ] = js.native
    inline def getAngle(shapeModel: ShapeInfo, coordinate: typings.antvG2.dependentsMod.Coordinate): StartAngle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(shapeModel.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[StartAngle]
    inline def getAngle_=(
      x: js.Function2[
          /* shapeModel */ ShapeInfo, 
          /* coordinate */ typings.antvG2.dependentsMod.Coordinate, 
          StartAngle
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "Util.getDelegationObject")
    @js.native
    def getDelegationObject: js.Function1[/* context */ IInteractionContext, LooseObject] = js.native
    inline def getDelegationObject(context: IInteractionContext): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getDelegationObject")(context.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
    inline def getDelegationObject_=(x: js.Function1[/* context */ IInteractionContext, LooseObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDelegationObject")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "Util.getLegendItems")
    @js.native
    def getLegendItems: js.Function5[
        /* view */ View, 
        /* geometry */ default[ShapePoint], 
        /* attr */ Attribute, 
        /* themeMarker */ js.Object, 
        /* userMarker */ js.UndefOr[
          MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
        ], 
        js.Array[ComponentLegendItem]
      ] = js.native
    inline def getLegendItems(view: View, geometry: default[ShapePoint], attr: Attribute, themeMarker: js.Object): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
    inline def getLegendItems(
      view: View,
      geometry: default[ShapePoint],
      attr: Attribute,
      themeMarker: js.Object,
      userMarker: js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg]
    ): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any], userMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
    inline def getLegendItems(
      view: View,
      geometry: default[ShapePoint],
      attr: Attribute,
      themeMarker: js.Object,
      userMarker: MarkerCfg
    ): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any], userMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
    inline def getLegendItems_=(
      x: js.Function5[
          /* view */ View, 
          /* geometry */ default[ShapePoint], 
          /* attr */ Attribute, 
          /* themeMarker */ js.Object, 
          /* userMarker */ js.UndefOr[
            MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
          ], 
          js.Array[ComponentLegendItem]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLegendItems")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "Util.getMappingValue")
    @js.native
    def getMappingValue: js.Function3[/* attr */ Attribute, /* value */ Any, /* def */ String, String] = js.native
    inline def getMappingValue(attr: Attribute, value: Any, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMappingValue")(attr.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getMappingValue_=(x: js.Function3[/* attr */ Attribute, /* value */ Any, /* def */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMappingValue")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "Util.getPath")
    @js.native
    def getPath: js.Function6[
        /* points */ js.Array[Point | RangePoint], 
        /* isInCircle */ Boolean, 
        /* isStack */ js.UndefOr[Boolean], 
        /* smooth */ js.UndefOr[Boolean], 
        /* constraint */ js.UndefOr[js.Array[Position]], 
        /* style */ js.UndefOr[ShapeAttrs], 
        Any
      ] = js.native
    inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean, isStack: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean, isStack: Boolean, smooth: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Boolean,
      constraint: js.Array[Position]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Boolean,
      constraint: js.Array[Position],
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Boolean,
      constraint: Unit,
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Unit,
      constraint: js.Array[Position]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Unit,
      constraint: js.Array[Position],
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Unit,
      constraint: Unit,
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean, isStack: Unit, smooth: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Boolean,
      constraint: js.Array[Position]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Boolean,
      constraint: js.Array[Position],
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Boolean,
      constraint: Unit,
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Unit,
      constraint: js.Array[Position]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Unit,
      constraint: js.Array[Position],
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Unit,
      constraint: Unit,
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("bizcharts/lib/core", "Util.getPathPoints")
    @js.native
    def getPathPoints: js.Function3[
        /* points */ ShapeVertices, 
        /* connectNulls */ js.UndefOr[Boolean], 
        /* showSinglePoint */ js.UndefOr[Boolean], 
        js.Array[Any]
      ] = js.native
    inline def getPathPoints(points: ShapeVertices): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def getPathPoints(points: ShapeVertices, connectNulls: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getPathPoints(points: ShapeVertices, connectNulls: Boolean, showSinglePoint: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any], showSinglePoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getPathPoints(points: ShapeVertices, connectNulls: Unit, showSinglePoint: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any], showSinglePoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getPathPoints_=(
      x: js.Function3[
          /* points */ ShapeVertices, 
          /* connectNulls */ js.UndefOr[Boolean], 
          /* showSinglePoint */ js.UndefOr[Boolean], 
          js.Array[Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPathPoints")(x.asInstanceOf[js.Any])
    
    inline def getPath_=(
      x: js.Function6[
          /* points */ js.Array[Point | RangePoint], 
          /* isInCircle */ Boolean, 
          /* isStack */ js.UndefOr[Boolean], 
          /* smooth */ js.UndefOr[Boolean], 
          /* constraint */ js.UndefOr[js.Array[Position]], 
          /* style */ js.UndefOr[ShapeAttrs], 
          Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPath")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "Util.getSectorPath")
    @js.native
    def getSectorPath: js.Function6[
        /* centerX */ Double, 
        /* centerY */ Double, 
        /* radius */ Double, 
        /* startAngleInRadian */ Double, 
        /* endAngleInRadian */ Double, 
        /* innerRadius */ js.UndefOr[Double], 
        js.Array[js.Array[String | Double]]
      ] = js.native
    inline def getSectorPath(
      centerX: Double,
      centerY: Double,
      radius: Double,
      startAngleInRadian: Double,
      endAngleInRadian: Double
    ): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectorPath")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngleInRadian.asInstanceOf[js.Any], endAngleInRadian.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
    inline def getSectorPath(
      centerX: Double,
      centerY: Double,
      radius: Double,
      startAngleInRadian: Double,
      endAngleInRadian: Double,
      innerRadius: Double
    ): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectorPath")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngleInRadian.asInstanceOf[js.Any], endAngleInRadian.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
    inline def getSectorPath_=(
      x: js.Function6[
          /* centerX */ Double, 
          /* centerY */ Double, 
          /* radius */ Double, 
          /* startAngleInRadian */ Double, 
          /* endAngleInRadian */ Double, 
          /* innerRadius */ js.UndefOr[Double], 
          js.Array[js.Array[String | Double]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSectorPath")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "Util.getTooltipItems")
    @js.native
    def getTooltipItems: js.Function4[
        /* data */ MappingDatum, 
        /* geometry */ default[ShapePoint], 
        /* title */ js.UndefOr[TooltipTitle], 
        /* showNil */ js.UndefOr[Boolean], 
        js.Array[Any]
      ] = js.native
    inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: Unit, showNil: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showNil.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: TooltipTitle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: TooltipTitle, showNil: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showNil.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getTooltipItems_=(
      x: js.Function4[
          /* data */ MappingDatum, 
          /* geometry */ default[ShapePoint], 
          /* title */ js.UndefOr[TooltipTitle], 
          /* showNil */ js.UndefOr[Boolean], 
          js.Array[Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTooltipItems")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "Util.polarToCartesian")
    @js.native
    def polarToCartesian: js.Function4[
        /* centerX */ Double, 
        /* centerY */ Double, 
        /* radius */ Double, 
        /* angleInRadian */ Double, 
        X
      ] = js.native
    inline def polarToCartesian(centerX: Double, centerY: Double, radius: Double, angleInRadian: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("polarToCartesian")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], angleInRadian.asInstanceOf[js.Any])).asInstanceOf[X]
    inline def polarToCartesian_=(
      x: js.Function4[
          /* centerX */ Double, 
          /* centerY */ Double, 
          /* radius */ Double, 
          /* angleInRadian */ Double, 
          X
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polarToCartesian")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "Util.rotate")
    @js.native
    def rotate: js.Function2[/* element */ IGroup | IShape, /* rotateRadian */ Double, Unit] = js.native
    inline def rotate(element: IGroup, rotateRadian: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(element.asInstanceOf[js.Any], rotateRadian.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate(element: IShape, rotateRadian: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(element.asInstanceOf[js.Any], rotateRadian.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate_=(x: js.Function2[/* element */ IGroup | IShape, /* rotateRadian */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotate")(x.asInstanceOf[js.Any])
    
    inline def transform(m: js.Array[Double], actions: js.Array[js.Array[Any]]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    @JSImport("bizcharts/lib/core", "Util.translate")
    @js.native
    def translate: js.Function3[/* element */ IGroup | IShape, /* x */ Double, /* y */ Double, Unit] = js.native
    inline def translate(element: IGroup, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def translate(element: IShape, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def translate_=(x: js.Function3[/* element */ IGroup | IShape, /* x */ Double, /* y */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "Util.zoom")
    @js.native
    def zoom: js.Function2[/* element */ IGroup | IShape, /* ratio */ Double, Unit] = js.native
    inline def zoom(element: IGroup, ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(element.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def zoom(element: IShape, ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(element.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def zoom_=(x: js.Function2[/* element */ IGroup | IShape, /* ratio */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoom")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bizcharts/lib/core", "VERSION")
  @js.native
  val VERSION: /* "4.1.20" */ String = js.native
  
  object antvDark {
    
    @JSImport("bizcharts/lib/core", "antvDark")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationArcBorder")
    @js.native
    def annotationArcBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationArcBorderColor")
    @js.native
    def annotationArcBorderColor: String = js.native
    inline def annotationArcBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationArcBorderColor")(x.asInstanceOf[js.Any])
    
    inline def annotationArcBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationArcBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationDataMarkerLineLength")
    @js.native
    def annotationDataMarkerLineLength: Double = js.native
    inline def annotationDataMarkerLineLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationDataMarkerLineLength")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationLineBorder")
    @js.native
    def annotationLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationLineBorderColor")
    @js.native
    def annotationLineBorderColor: String = js.native
    inline def annotationLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def annotationLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationLineDash")
    @js.native
    def annotationLineDash: Any = js.native
    inline def annotationLineDash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationLineDash")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationRegionBorder")
    @js.native
    def annotationRegionBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationRegionBorderColor")
    @js.native
    def annotationRegionBorderColor: Any = js.native
    inline def annotationRegionBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationRegionBorderColor")(x.asInstanceOf[js.Any])
    
    inline def annotationRegionBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationRegionBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationRegionFillColor")
    @js.native
    def annotationRegionFillColor: String = js.native
    inline def annotationRegionFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationRegionFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationRegionFillOpacity")
    @js.native
    def annotationRegionFillOpacity: Double = js.native
    inline def annotationRegionFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationRegionFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationTextBorder")
    @js.native
    def annotationTextBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationTextBorderColor")
    @js.native
    def annotationTextBorderColor: Any = js.native
    inline def annotationTextBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextBorderColor")(x.asInstanceOf[js.Any])
    
    inline def annotationTextBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationTextFillColor")
    @js.native
    def annotationTextFillColor: String = js.native
    inline def annotationTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationTextFontSize")
    @js.native
    def annotationTextFontSize: Double = js.native
    inline def annotationTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationTextFontWeight")
    @js.native
    def annotationTextFontWeight: String | Double = js.native
    inline def annotationTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.annotationTextLineHeight")
    @js.native
    def annotationTextLineHeight: Double = js.native
    inline def annotationTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaActiveBorder")
    @js.native
    def areaActiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.areaActiveBorderColor")
    @js.native
    def areaActiveBorderColor: js.UndefOr[String] = js.native
    inline def areaActiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaActiveBorderOpacity")
    @js.native
    def areaActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def areaActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def areaActiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaActiveFillColor")
    @js.native
    def areaActiveFillColor: String = js.native
    inline def areaActiveFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaActiveFillOpacity")
    @js.native
    def areaActiveFillOpacity: Double = js.native
    inline def areaActiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaBorder")
    @js.native
    def areaBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.areaBorderColor")
    @js.native
    def areaBorderColor: js.UndefOr[String] = js.native
    inline def areaBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaBorderOpacity")
    @js.native
    def areaBorderOpacity: js.UndefOr[Double] = js.native
    inline def areaBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def areaBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaFillColor")
    @js.native
    def areaFillColor: String = js.native
    inline def areaFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaFillOpacity")
    @js.native
    def areaFillOpacity: Double = js.native
    inline def areaFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaInactiveBorder")
    @js.native
    def areaInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.areaInactiveBorderColor")
    @js.native
    def areaInactiveBorderColor: js.UndefOr[String] = js.native
    inline def areaInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaInactiveBorderOpacity")
    @js.native
    def areaInactiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def areaInactiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def areaInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaInactiveFillColor")
    @js.native
    def areaInactiveFillColor: js.UndefOr[String] = js.native
    inline def areaInactiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaInactiveFillOpacity")
    @js.native
    def areaInactiveFillOpacity: Double = js.native
    inline def areaInactiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaSelectedBorder")
    @js.native
    def areaSelectedBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.areaSelectedBorderColor")
    @js.native
    def areaSelectedBorderColor: js.UndefOr[String] = js.native
    inline def areaSelectedBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaSelectedBorderOpacity")
    @js.native
    def areaSelectedBorderOpacity: js.UndefOr[Double] = js.native
    inline def areaSelectedBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def areaSelectedBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaSelectedFillColor")
    @js.native
    def areaSelectedFillColor: String = js.native
    inline def areaSelectedFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.areaSelectedFillOpacity")
    @js.native
    def areaSelectedFillOpacity: Double = js.native
    inline def areaSelectedFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisDescriptionIconFillColor")
    @js.native
    def axisDescriptionIconFillColor: String = js.native
    inline def axisDescriptionIconFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisDescriptionIconFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisGridBorder")
    @js.native
    def axisGridBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.axisGridBorderColor")
    @js.native
    def axisGridBorderColor: String = js.native
    inline def axisGridBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisGridBorderColor")(x.asInstanceOf[js.Any])
    
    inline def axisGridBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisGridBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisGridLineDash")
    @js.native
    def axisGridLineDash: Any = js.native
    inline def axisGridLineDash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisGridLineDash")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisLabelFillColor")
    @js.native
    def axisLabelFillColor: String = js.native
    inline def axisLabelFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisLabelFontSize")
    @js.native
    def axisLabelFontSize: Double = js.native
    inline def axisLabelFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisLabelFontWeight")
    @js.native
    def axisLabelFontWeight: String | Double = js.native
    inline def axisLabelFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisLabelLineHeight")
    @js.native
    def axisLabelLineHeight: Double = js.native
    inline def axisLabelLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisLabelOffset")
    @js.native
    def axisLabelOffset: Double = js.native
    inline def axisLabelOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisLineBorder")
    @js.native
    def axisLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.axisLineBorderColor")
    @js.native
    def axisLineBorderColor: String = js.native
    inline def axisLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def axisLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisLineDash")
    @js.native
    def axisLineDash: Any = js.native
    inline def axisLineDash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLineDash")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisSubTickLineBorder")
    @js.native
    def axisSubTickLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.axisSubTickLineBorderColor")
    @js.native
    def axisSubTickLineBorderColor: String = js.native
    inline def axisSubTickLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisSubTickLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def axisSubTickLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisSubTickLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisSubTickLineLength")
    @js.native
    def axisSubTickLineLength: Double = js.native
    inline def axisSubTickLineLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisSubTickLineLength")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisTickLineBorder")
    @js.native
    def axisTickLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.axisTickLineBorderColor")
    @js.native
    def axisTickLineBorderColor: String = js.native
    inline def axisTickLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTickLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def axisTickLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTickLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisTickLineLength")
    @js.native
    def axisTickLineLength: Double = js.native
    inline def axisTickLineLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTickLineLength")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisTitleSpacing")
    @js.native
    def axisTitleSpacing: Double = js.native
    inline def axisTitleSpacing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisTitleTextFillColor")
    @js.native
    def axisTitleTextFillColor: String = js.native
    inline def axisTitleTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisTitleTextFontSize")
    @js.native
    def axisTitleTextFontSize: Double = js.native
    inline def axisTitleTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisTitleTextFontWeight")
    @js.native
    def axisTitleTextFontWeight: String | Double = js.native
    inline def axisTitleTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.axisTitleTextLineHeight")
    @js.native
    def axisTitleTextLineHeight: Double = js.native
    inline def axisTitleTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.backgroundColor")
    @js.native
    def backgroundColor: String = js.native
    inline def backgroundColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.brandColor")
    @js.native
    def brandColor: String = js.native
    inline def brandColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brandColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderBackgroundFillColor")
    @js.native
    def cSliderBackgroundFillColor: String = js.native
    inline def cSliderBackgroundFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderBackgroundFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderBackgroundFillOpacity")
    @js.native
    def cSliderBackgroundFillOpacity: Double = js.native
    inline def cSliderBackgroundFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderBackgroundFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderForegroundFillColor")
    @js.native
    def cSliderForegroundFillColor: String = js.native
    inline def cSliderForegroundFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderForegroundFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderForegroundFillOpacity")
    @js.native
    def cSliderForegroundFillOpacity: Double = js.native
    inline def cSliderForegroundFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderForegroundFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderHandlerBorder")
    @js.native
    def cSliderHandlerBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderHandlerBorderColor")
    @js.native
    def cSliderHandlerBorderColor: String = js.native
    inline def cSliderHandlerBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderHandlerBorderRadius")
    @js.native
    def cSliderHandlerBorderRadius: Double = js.native
    inline def cSliderHandlerBorderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerBorderRadius")(x.asInstanceOf[js.Any])
    
    inline def cSliderHandlerBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderHandlerFillColor")
    @js.native
    def cSliderHandlerFillColor: String = js.native
    inline def cSliderHandlerFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderHandlerFillOpacity")
    @js.native
    def cSliderHandlerFillOpacity: Double = js.native
    inline def cSliderHandlerFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderHandlerHeight")
    @js.native
    def cSliderHandlerHeight: Double = js.native
    inline def cSliderHandlerHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderHandlerHighlightFillColor")
    @js.native
    def cSliderHandlerHighlightFillColor: String = js.native
    inline def cSliderHandlerHighlightFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerHighlightFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderHandlerWidth")
    @js.native
    def cSliderHandlerWidth: Double = js.native
    inline def cSliderHandlerWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderRailHieght")
    @js.native
    def cSliderRailHieght: Double = js.native
    inline def cSliderRailHieght_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderRailHieght")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderTextBorder")
    @js.native
    def cSliderTextBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderTextBorderColor")
    @js.native
    def cSliderTextBorderColor: Any = js.native
    inline def cSliderTextBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextBorderColor")(x.asInstanceOf[js.Any])
    
    inline def cSliderTextBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderTextFillColor")
    @js.native
    def cSliderTextFillColor: String = js.native
    inline def cSliderTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderTextFillOpacity")
    @js.native
    def cSliderTextFillOpacity: Double = js.native
    inline def cSliderTextFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderTextFontSize")
    @js.native
    def cSliderTextFontSize: Double = js.native
    inline def cSliderTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderTextFontWeight")
    @js.native
    def cSliderTextFontWeight: String | Double = js.native
    inline def cSliderTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.cSliderTextLineHeight")
    @js.native
    def cSliderTextLineHeight: Double = js.native
    inline def cSliderTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.fontFamily")
    @js.native
    def fontFamily: String = js.native
    inline def fontFamily_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaActiveBorder")
    @js.native
    def hollowAreaActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaActiveBorderColor")
    @js.native
    def hollowAreaActiveBorderColor: String = js.native
    inline def hollowAreaActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaActiveBorderOpacity")
    @js.native
    def hollowAreaActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def hollowAreaActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowAreaActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaBorder")
    @js.native
    def hollowAreaBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaBorderColor")
    @js.native
    def hollowAreaBorderColor: String = js.native
    inline def hollowAreaBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaBorderOpacity")
    @js.native
    def hollowAreaBorderOpacity: Double = js.native
    inline def hollowAreaBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowAreaBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaInactiveBorder")
    @js.native
    def hollowAreaInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaInactiveBorderColor")
    @js.native
    def hollowAreaInactiveBorderColor: js.UndefOr[String] = js.native
    inline def hollowAreaInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaInactiveBorderOpacity")
    @js.native
    def hollowAreaInactiveBorderOpacity: Double = js.native
    inline def hollowAreaInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowAreaInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaSelectedBorder")
    @js.native
    def hollowAreaSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaSelectedBorderColor")
    @js.native
    def hollowAreaSelectedBorderColor: String = js.native
    inline def hollowAreaSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowAreaSelectedBorderOpacity")
    @js.native
    def hollowAreaSelectedBorderOpacity: js.UndefOr[Double] = js.native
    inline def hollowAreaSelectedBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowAreaSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalActiveBorder")
    @js.native
    def hollowIntervalActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalActiveBorderColor")
    @js.native
    def hollowIntervalActiveBorderColor: String = js.native
    inline def hollowIntervalActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalActiveBorderOpacity")
    @js.native
    def hollowIntervalActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def hollowIntervalActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowIntervalActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalBorder")
    @js.native
    def hollowIntervalBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalBorderColor")
    @js.native
    def hollowIntervalBorderColor: String = js.native
    inline def hollowIntervalBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalBorderOpacity")
    @js.native
    def hollowIntervalBorderOpacity: Double = js.native
    inline def hollowIntervalBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowIntervalBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalFillColor")
    @js.native
    def hollowIntervalFillColor: String = js.native
    inline def hollowIntervalFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalFillOpacity")
    @js.native
    def hollowIntervalFillOpacity: js.UndefOr[Double] = js.native
    inline def hollowIntervalFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalInactiveBorder")
    @js.native
    def hollowIntervalInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalInactiveBorderColor")
    @js.native
    def hollowIntervalInactiveBorderColor: js.UndefOr[String] = js.native
    inline def hollowIntervalInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalInactiveBorderOpacity")
    @js.native
    def hollowIntervalInactiveBorderOpacity: Double = js.native
    inline def hollowIntervalInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowIntervalInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalSelectedBorder")
    @js.native
    def hollowIntervalSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalSelectedBorderColor")
    @js.native
    def hollowIntervalSelectedBorderColor: String = js.native
    inline def hollowIntervalSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowIntervalSelectedBorderOpacity")
    @js.native
    def hollowIntervalSelectedBorderOpacity: Double = js.native
    inline def hollowIntervalSelectedBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowIntervalSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointActiveBorder")
    @js.native
    def hollowPointActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointActiveBorderColor")
    @js.native
    def hollowPointActiveBorderColor: String = js.native
    inline def hollowPointActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointActiveBorderOpacity")
    @js.native
    def hollowPointActiveBorderOpacity: Double = js.native
    inline def hollowPointActiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowPointActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointActiveSize")
    @js.native
    def hollowPointActiveSize: js.UndefOr[Double] = js.native
    inline def hollowPointActiveSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointActiveSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointBorder")
    @js.native
    def hollowPointBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointBorderColor")
    @js.native
    def hollowPointBorderColor: String = js.native
    inline def hollowPointBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointBorderOpacity")
    @js.native
    def hollowPointBorderOpacity: Double = js.native
    inline def hollowPointBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowPointBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointFillColor")
    @js.native
    def hollowPointFillColor: String = js.native
    inline def hollowPointFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointFillOpacity")
    @js.native
    def hollowPointFillOpacity: js.UndefOr[Double] = js.native
    inline def hollowPointFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointInactiveBorder")
    @js.native
    def hollowPointInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointInactiveBorderColor")
    @js.native
    def hollowPointInactiveBorderColor: js.UndefOr[String] = js.native
    inline def hollowPointInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointInactiveBorderOpacity")
    @js.native
    def hollowPointInactiveBorderOpacity: Double = js.native
    inline def hollowPointInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowPointInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointInactiveSize")
    @js.native
    def hollowPointInactiveSize: js.UndefOr[Double] = js.native
    inline def hollowPointInactiveSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointInactiveSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointSelectedBorder")
    @js.native
    def hollowPointSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointSelectedBorderColor")
    @js.native
    def hollowPointSelectedBorderColor: String = js.native
    inline def hollowPointSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointSelectedBorderOpacity")
    @js.native
    def hollowPointSelectedBorderOpacity: Double = js.native
    inline def hollowPointSelectedBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowPointSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointSelectedSize")
    @js.native
    def hollowPointSelectedSize: js.UndefOr[Double] = js.native
    inline def hollowPointSelectedSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSelectedSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.hollowPointSize")
    @js.native
    def hollowPointSize: Double = js.native
    inline def hollowPointSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.innerLabelBorder")
    @js.native
    def innerLabelBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.innerLabelBorderColor")
    @js.native
    def innerLabelBorderColor: Any = js.native
    inline def innerLabelBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelBorderColor")(x.asInstanceOf[js.Any])
    
    inline def innerLabelBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.innerLabelFillColor")
    @js.native
    def innerLabelFillColor: String = js.native
    inline def innerLabelFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.innerLabelFontSize")
    @js.native
    def innerLabelFontSize: Double = js.native
    inline def innerLabelFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.innerLabelFontWeight")
    @js.native
    def innerLabelFontWeight: String | Double = js.native
    inline def innerLabelFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.innerLabelLineHeight")
    @js.native
    def innerLabelLineHeight: Double = js.native
    inline def innerLabelLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalActiveBorder")
    @js.native
    def intervalActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalActiveBorderColor")
    @js.native
    def intervalActiveBorderColor: String = js.native
    inline def intervalActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalActiveBorderOpacity")
    @js.native
    def intervalActiveBorderOpacity: Double = js.native
    inline def intervalActiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def intervalActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalActiveFillColor")
    @js.native
    def intervalActiveFillColor: js.UndefOr[String] = js.native
    inline def intervalActiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalActiveFillOpacity")
    @js.native
    def intervalActiveFillOpacity: js.UndefOr[Double] = js.native
    inline def intervalActiveFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalBorder")
    @js.native
    def intervalBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalBorderColor")
    @js.native
    def intervalBorderColor: js.UndefOr[String] = js.native
    inline def intervalBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalBorderOpacity")
    @js.native
    def intervalBorderOpacity: js.UndefOr[Double] = js.native
    inline def intervalBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def intervalBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalFillColor")
    @js.native
    def intervalFillColor: String = js.native
    inline def intervalFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalFillOpacity")
    @js.native
    def intervalFillOpacity: Double = js.native
    inline def intervalFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalInactiveBorder")
    @js.native
    def intervalInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalInactiveBorderColor")
    @js.native
    def intervalInactiveBorderColor: js.UndefOr[String] = js.native
    inline def intervalInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalInactiveBorderOpacity")
    @js.native
    def intervalInactiveBorderOpacity: Double = js.native
    inline def intervalInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def intervalInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalInactiveFillColor")
    @js.native
    def intervalInactiveFillColor: js.UndefOr[String] = js.native
    inline def intervalInactiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalInactiveFillOpacity")
    @js.native
    def intervalInactiveFillOpacity: Double = js.native
    inline def intervalInactiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalSelectedBorder")
    @js.native
    def intervalSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalSelectedBorderColor")
    @js.native
    def intervalSelectedBorderColor: String = js.native
    inline def intervalSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalSelectedBorderOpacity")
    @js.native
    def intervalSelectedBorderOpacity: Double = js.native
    inline def intervalSelectedBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def intervalSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalSelectedFillColor")
    @js.native
    def intervalSelectedFillColor: js.UndefOr[String] = js.native
    inline def intervalSelectedFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.intervalSelectedFillOpacity")
    @js.native
    def intervalSelectedFillOpacity: js.UndefOr[Double] = js.native
    inline def intervalSelectedFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.labelBorder")
    @js.native
    def labelBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.labelBorderColor")
    @js.native
    def labelBorderColor: Any = js.native
    inline def labelBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBorderColor")(x.asInstanceOf[js.Any])
    
    inline def labelBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.labelFillColor")
    @js.native
    def labelFillColor: String = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.labelFillColorDark")
    @js.native
    def labelFillColorDark: String = js.native
    inline def labelFillColorDark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFillColorDark")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.labelFillColorLight")
    @js.native
    def labelFillColorLight: String = js.native
    inline def labelFillColorLight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFillColorLight")(x.asInstanceOf[js.Any])
    
    inline def labelFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.labelFontSize")
    @js.native
    def labelFontSize: Double = js.native
    inline def labelFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.labelFontWeight")
    @js.native
    def labelFontWeight: String | Double = js.native
    inline def labelFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.labelLineBorder")
    @js.native
    def labelLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.labelLineBorderColor")
    @js.native
    def labelLineBorderColor: String = js.native
    inline def labelLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def labelLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.labelLineHeight")
    @js.native
    def labelLineHeight: Double = js.native
    inline def labelLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendCircleMarkerSize")
    @js.native
    def legendCircleMarkerSize: Double = js.native
    inline def legendCircleMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendCircleMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendHorizontalPadding")
    @js.native
    def legendHorizontalPadding: js.Array[Double] = js.native
    inline def legendHorizontalPadding_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendHorizontalPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendItemMarginBottom")
    @js.native
    def legendItemMarginBottom: Double = js.native
    inline def legendItemMarginBottom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemMarginBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendItemNameFillColor")
    @js.native
    def legendItemNameFillColor: String = js.native
    inline def legendItemNameFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemNameFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendItemNameFontSize")
    @js.native
    def legendItemNameFontSize: Double = js.native
    inline def legendItemNameFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemNameFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendItemNameFontWeight")
    @js.native
    def legendItemNameFontWeight: String | Double = js.native
    inline def legendItemNameFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemNameFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendItemNameLineHeight")
    @js.native
    def legendItemNameLineHeight: Double = js.native
    inline def legendItemNameLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemNameLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendItemSpacing")
    @js.native
    def legendItemSpacing: Double = js.native
    inline def legendItemSpacing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendLineMarkerSize")
    @js.native
    def legendLineMarkerSize: Double = js.native
    inline def legendLineMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendLineMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendMarkerColor")
    @js.native
    def legendMarkerColor: String = js.native
    inline def legendMarkerColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendMarkerSize")
    @js.native
    def legendMarkerSize: Double = js.native
    inline def legendMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendMarkerSpacing")
    @js.native
    def legendMarkerSpacing: Double = js.native
    inline def legendMarkerSpacing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendPadding")
    @js.native
    def legendPadding: js.Array[Double] = js.native
    inline def legendPadding_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendPageNavigatorMarkerFillColor")
    @js.native
    def legendPageNavigatorMarkerFillColor: String = js.native
    inline def legendPageNavigatorMarkerFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendPageNavigatorMarkerFillOpacity")
    @js.native
    def legendPageNavigatorMarkerFillOpacity: Double = js.native
    inline def legendPageNavigatorMarkerFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendPageNavigatorMarkerInactiveFillColor")
    @js.native
    def legendPageNavigatorMarkerInactiveFillColor: String = js.native
    inline def legendPageNavigatorMarkerInactiveFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerInactiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendPageNavigatorMarkerInactiveFillOpacity")
    @js.native
    def legendPageNavigatorMarkerInactiveFillOpacity: Double = js.native
    inline def legendPageNavigatorMarkerInactiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerInactiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendPageNavigatorMarkerSize")
    @js.native
    def legendPageNavigatorMarkerSize: Double = js.native
    inline def legendPageNavigatorMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendPageNavigatorTextFillColor")
    @js.native
    def legendPageNavigatorTextFillColor: String = js.native
    inline def legendPageNavigatorTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendPageNavigatorTextFontSize")
    @js.native
    def legendPageNavigatorTextFontSize: Double = js.native
    inline def legendPageNavigatorTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorTextFontSize")(x.asInstanceOf[js.Any])
    
    /** 图例与图表绘图区域的偏移距离  */
    @JSImport("bizcharts/lib/core", "antvDark.legendSpacing")
    @js.native
    def legendSpacing: Double = js.native
    inline def legendSpacing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendSquareMarkerSize")
    @js.native
    def legendSquareMarkerSize: Double = js.native
    inline def legendSquareMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendSquareMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendTitleTextFillColor")
    @js.native
    def legendTitleTextFillColor: String = js.native
    inline def legendTitleTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendTitleTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendTitleTextFontSize")
    @js.native
    def legendTitleTextFontSize: Double = js.native
    inline def legendTitleTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendTitleTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendTitleTextFontWeight")
    @js.native
    def legendTitleTextFontWeight: String | Double = js.native
    inline def legendTitleTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendTitleTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendTitleTextLineHeight")
    @js.native
    def legendTitleTextLineHeight: Double = js.native
    inline def legendTitleTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendTitleTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.legendVerticalPadding")
    @js.native
    def legendVerticalPadding: js.Array[Double] = js.native
    inline def legendVerticalPadding_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendVerticalPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.lineActiveBorder")
    @js.native
    def lineActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.lineActiveBorderColor")
    @js.native
    def lineActiveBorderColor: js.UndefOr[String] = js.native
    inline def lineActiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.lineActiveBorderOpacity")
    @js.native
    def lineActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def lineActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def lineActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.lineBorder")
    @js.native
    def lineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.lineBorderColor")
    @js.native
    def lineBorderColor: String = js.native
    inline def lineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.lineBorderOpacity")
    @js.native
    def lineBorderOpacity: Double = js.native
    inline def lineBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def lineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.lineInactiveBorder")
    @js.native
    def lineInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.lineInactiveBorderColor")
    @js.native
    def lineInactiveBorderColor: js.UndefOr[String] = js.native
    inline def lineInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.lineInactiveBorderOpacity")
    @js.native
    def lineInactiveBorderOpacity: Double = js.native
    inline def lineInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def lineInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.lineSelectedBorder")
    @js.native
    def lineSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.lineSelectedBorderColor")
    @js.native
    def lineSelectedBorderColor: js.UndefOr[String] = js.native
    inline def lineSelectedBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.lineSelectedBorderOpacity")
    @js.native
    def lineSelectedBorderOpacity: js.UndefOr[Double] = js.native
    inline def lineSelectedBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def lineSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.overflowLabelBorder")
    @js.native
    def overflowLabelBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.overflowLabelBorderColor")
    @js.native
    def overflowLabelBorderColor: String = js.native
    inline def overflowLabelBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelBorderColor")(x.asInstanceOf[js.Any])
    
    inline def overflowLabelBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.overflowLabelFillColor")
    @js.native
    def overflowLabelFillColor: String = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.overflowLabelFillColorDark")
    @js.native
    def overflowLabelFillColorDark: String = js.native
    inline def overflowLabelFillColorDark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFillColorDark")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.overflowLabelFillColorLight")
    @js.native
    def overflowLabelFillColorLight: String = js.native
    inline def overflowLabelFillColorLight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFillColorLight")(x.asInstanceOf[js.Any])
    
    inline def overflowLabelFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.overflowLabelFontSize")
    @js.native
    def overflowLabelFontSize: Double = js.native
    inline def overflowLabelFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.overflowLabelFontWeight")
    @js.native
    def overflowLabelFontWeight: String | Double = js.native
    inline def overflowLabelFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.overflowLabelLineHeight")
    @js.native
    def overflowLabelLineHeight: Double = js.native
    inline def overflowLabelLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.paletteQualitative10")
    @js.native
    def paletteQualitative10: js.Array[String] = js.native
    inline def paletteQualitative10_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteQualitative10")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.paletteQualitative20")
    @js.native
    def paletteQualitative20: js.Array[String] = js.native
    inline def paletteQualitative20_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteQualitative20")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.paletteSemanticGreen")
    @js.native
    def paletteSemanticGreen: String = js.native
    inline def paletteSemanticGreen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteSemanticGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.paletteSemanticRed")
    @js.native
    def paletteSemanticRed: String = js.native
    inline def paletteSemanticRed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteSemanticRed")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.paletteSemanticYellow")
    @js.native
    def paletteSemanticYellow: String = js.native
    inline def paletteSemanticYellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteSemanticYellow")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.paletteSequence")
    @js.native
    def paletteSequence: js.Array[String] = js.native
    inline def paletteSequence_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteSequence")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointActiveBorder")
    @js.native
    def pointActiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.pointActiveBorderColor")
    @js.native
    def pointActiveBorderColor: String = js.native
    inline def pointActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointActiveBorderOpacity")
    @js.native
    def pointActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def pointActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def pointActiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointActiveFillColor")
    @js.native
    def pointActiveFillColor: js.UndefOr[String] = js.native
    inline def pointActiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointActiveFillOpacity")
    @js.native
    def pointActiveFillOpacity: js.UndefOr[Double] = js.native
    inline def pointActiveFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointActiveSize")
    @js.native
    def pointActiveSize: js.UndefOr[Double] = js.native
    inline def pointActiveSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointBorder")
    @js.native
    def pointBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.pointBorderColor")
    @js.native
    def pointBorderColor: String = js.native
    inline def pointBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointBorderOpacity")
    @js.native
    def pointBorderOpacity: Double = js.native
    inline def pointBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def pointBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointFillColor")
    @js.native
    def pointFillColor: String = js.native
    inline def pointFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointFillOpacity")
    @js.native
    def pointFillOpacity: Double = js.native
    inline def pointFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointInactiveBorder")
    @js.native
    def pointInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.pointInactiveBorderColor")
    @js.native
    def pointInactiveBorderColor: js.UndefOr[String] = js.native
    inline def pointInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointInactiveBorderOpacity")
    @js.native
    def pointInactiveBorderOpacity: Double = js.native
    inline def pointInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def pointInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointInactiveFillColor")
    @js.native
    def pointInactiveFillColor: js.UndefOr[String] = js.native
    inline def pointInactiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointInactiveFillOpacity")
    @js.native
    def pointInactiveFillOpacity: Double = js.native
    inline def pointInactiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointInactiveSize")
    @js.native
    def pointInactiveSize: js.UndefOr[Double] = js.native
    inline def pointInactiveSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointSelectedBorder")
    @js.native
    def pointSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.pointSelectedBorderColor")
    @js.native
    def pointSelectedBorderColor: String = js.native
    inline def pointSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointSelectedBorderOpacity")
    @js.native
    def pointSelectedBorderOpacity: js.UndefOr[Double] = js.native
    inline def pointSelectedBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def pointSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointSelectedFillColor")
    @js.native
    def pointSelectedFillColor: js.UndefOr[String] = js.native
    inline def pointSelectedFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointSelectedFillOpacity")
    @js.native
    def pointSelectedFillOpacity: js.UndefOr[Double] = js.native
    inline def pointSelectedFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointSelectedSize")
    @js.native
    def pointSelectedSize: js.UndefOr[Double] = js.native
    inline def pointSelectedSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.pointSize")
    @js.native
    def pointSize: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.pointSizeRange")
    @js.native
    def pointSizeRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    inline def pointSizeRange_=(x: js.UndefOr[js.Tuple2[Double, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSizeRange")(x.asInstanceOf[js.Any])
    
    inline def pointSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.scrollbarThumbFillColor")
    @js.native
    def scrollbarThumbFillColor: String = js.native
    inline def scrollbarThumbFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarThumbFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.scrollbarThumbHighlightFillColor")
    @js.native
    def scrollbarThumbHighlightFillColor: String = js.native
    inline def scrollbarThumbHighlightFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarThumbHighlightFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.scrollbarTrackFillColor")
    @js.native
    def scrollbarTrackFillColor: String = js.native
    inline def scrollbarTrackFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarTrackFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderHandlerBorder")
    @js.native
    def sliderHandlerBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderHandlerBorderColor")
    @js.native
    def sliderHandlerBorderColor: String = js.native
    inline def sliderHandlerBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerBorderColor")(x.asInstanceOf[js.Any])
    
    inline def sliderHandlerBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderHandlerFillColor")
    @js.native
    def sliderHandlerFillColor: String = js.native
    inline def sliderHandlerFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderHandlerHeight")
    @js.native
    def sliderHandlerHeight: Double = js.native
    inline def sliderHandlerHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderHandlerWidth")
    @js.native
    def sliderHandlerWidth: Double = js.native
    inline def sliderHandlerWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderLabelTextFillColor")
    @js.native
    def sliderLabelTextFillColor: String = js.native
    inline def sliderLabelTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderLabelTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderLabelTextFontSize")
    @js.native
    def sliderLabelTextFontSize: Double = js.native
    inline def sliderLabelTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderLabelTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderLabelTextFontWeight")
    @js.native
    def sliderLabelTextFontWeight: String | Double = js.native
    inline def sliderLabelTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderLabelTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderLabelTextLineHeight")
    @js.native
    def sliderLabelTextLineHeight: Double = js.native
    inline def sliderLabelTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderLabelTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderRailBorder")
    @js.native
    def sliderRailBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderRailBorderColor")
    @js.native
    def sliderRailBorderColor: Any = js.native
    inline def sliderRailBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailBorderColor")(x.asInstanceOf[js.Any])
    
    inline def sliderRailBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderRailFillColor")
    @js.native
    def sliderRailFillColor: String = js.native
    inline def sliderRailFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderRailHeight")
    @js.native
    def sliderRailHeight: Double = js.native
    inline def sliderRailHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.sliderRailWidth")
    @js.native
    def sliderRailWidth: Double = js.native
    inline def sliderRailWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.subColor")
    @js.native
    def subColor: String = js.native
    inline def subColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipContainerBorderRadius")
    @js.native
    def tooltipContainerBorderRadius: Double = js.native
    inline def tooltipContainerBorderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainerBorderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipContainerFillColor")
    @js.native
    def tooltipContainerFillColor: String = js.native
    inline def tooltipContainerFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainerFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipContainerFillOpacity")
    @js.native
    def tooltipContainerFillOpacity: Double = js.native
    inline def tooltipContainerFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainerFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipContainerShadow")
    @js.native
    def tooltipContainerShadow: String = js.native
    inline def tooltipContainerShadow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainerShadow")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipCrosshairsBorder")
    @js.native
    def tooltipCrosshairsBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipCrosshairsBorderColor")
    @js.native
    def tooltipCrosshairsBorderColor: String = js.native
    inline def tooltipCrosshairsBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipCrosshairsBorderColor")(x.asInstanceOf[js.Any])
    
    inline def tooltipCrosshairsBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipCrosshairsBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipCrosshairsLineDash")
    @js.native
    def tooltipCrosshairsLineDash: Any = js.native
    inline def tooltipCrosshairsLineDash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipCrosshairsLineDash")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipTextFillColor")
    @js.native
    def tooltipTextFillColor: String = js.native
    inline def tooltipTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipTextFontSize")
    @js.native
    def tooltipTextFontSize: Double = js.native
    inline def tooltipTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipTextFontWeight")
    @js.native
    def tooltipTextFontWeight: String | Double = js.native
    inline def tooltipTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvDark.tooltipTextLineHeight")
    @js.native
    def tooltipTextLineHeight: Double = js.native
    inline def tooltipTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipTextLineHeight")(x.asInstanceOf[js.Any])
  }
  
  object antvLight {
    
    @JSImport("bizcharts/lib/core", "antvLight")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationArcBorder")
    @js.native
    def annotationArcBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationArcBorderColor")
    @js.native
    def annotationArcBorderColor: String = js.native
    inline def annotationArcBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationArcBorderColor")(x.asInstanceOf[js.Any])
    
    inline def annotationArcBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationArcBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationDataMarkerLineLength")
    @js.native
    def annotationDataMarkerLineLength: Double = js.native
    inline def annotationDataMarkerLineLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationDataMarkerLineLength")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationLineBorder")
    @js.native
    def annotationLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationLineBorderColor")
    @js.native
    def annotationLineBorderColor: String = js.native
    inline def annotationLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def annotationLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationLineDash")
    @js.native
    def annotationLineDash: Any = js.native
    inline def annotationLineDash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationLineDash")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationRegionBorder")
    @js.native
    def annotationRegionBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationRegionBorderColor")
    @js.native
    def annotationRegionBorderColor: Any = js.native
    inline def annotationRegionBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationRegionBorderColor")(x.asInstanceOf[js.Any])
    
    inline def annotationRegionBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationRegionBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationRegionFillColor")
    @js.native
    def annotationRegionFillColor: String = js.native
    inline def annotationRegionFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationRegionFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationRegionFillOpacity")
    @js.native
    def annotationRegionFillOpacity: Double = js.native
    inline def annotationRegionFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationRegionFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationTextBorder")
    @js.native
    def annotationTextBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationTextBorderColor")
    @js.native
    def annotationTextBorderColor: Any = js.native
    inline def annotationTextBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextBorderColor")(x.asInstanceOf[js.Any])
    
    inline def annotationTextBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationTextFillColor")
    @js.native
    def annotationTextFillColor: String = js.native
    inline def annotationTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationTextFontSize")
    @js.native
    def annotationTextFontSize: Double = js.native
    inline def annotationTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationTextFontWeight")
    @js.native
    def annotationTextFontWeight: String | Double = js.native
    inline def annotationTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.annotationTextLineHeight")
    @js.native
    def annotationTextLineHeight: Double = js.native
    inline def annotationTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotationTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaActiveBorder")
    @js.native
    def areaActiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.areaActiveBorderColor")
    @js.native
    def areaActiveBorderColor: js.UndefOr[String] = js.native
    inline def areaActiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaActiveBorderOpacity")
    @js.native
    def areaActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def areaActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def areaActiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaActiveFillColor")
    @js.native
    def areaActiveFillColor: String = js.native
    inline def areaActiveFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaActiveFillOpacity")
    @js.native
    def areaActiveFillOpacity: Double = js.native
    inline def areaActiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaActiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaBorder")
    @js.native
    def areaBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.areaBorderColor")
    @js.native
    def areaBorderColor: js.UndefOr[String] = js.native
    inline def areaBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaBorderOpacity")
    @js.native
    def areaBorderOpacity: js.UndefOr[Double] = js.native
    inline def areaBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def areaBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaFillColor")
    @js.native
    def areaFillColor: String = js.native
    inline def areaFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaFillOpacity")
    @js.native
    def areaFillOpacity: Double = js.native
    inline def areaFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaInactiveBorder")
    @js.native
    def areaInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.areaInactiveBorderColor")
    @js.native
    def areaInactiveBorderColor: js.UndefOr[String] = js.native
    inline def areaInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaInactiveBorderOpacity")
    @js.native
    def areaInactiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def areaInactiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def areaInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaInactiveFillColor")
    @js.native
    def areaInactiveFillColor: js.UndefOr[String] = js.native
    inline def areaInactiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaInactiveFillOpacity")
    @js.native
    def areaInactiveFillOpacity: Double = js.native
    inline def areaInactiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaInactiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaSelectedBorder")
    @js.native
    def areaSelectedBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.areaSelectedBorderColor")
    @js.native
    def areaSelectedBorderColor: js.UndefOr[String] = js.native
    inline def areaSelectedBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaSelectedBorderOpacity")
    @js.native
    def areaSelectedBorderOpacity: js.UndefOr[Double] = js.native
    inline def areaSelectedBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def areaSelectedBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaSelectedFillColor")
    @js.native
    def areaSelectedFillColor: String = js.native
    inline def areaSelectedFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.areaSelectedFillOpacity")
    @js.native
    def areaSelectedFillOpacity: Double = js.native
    inline def areaSelectedFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaSelectedFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisDescriptionIconFillColor")
    @js.native
    def axisDescriptionIconFillColor: String = js.native
    inline def axisDescriptionIconFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisDescriptionIconFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisGridBorder")
    @js.native
    def axisGridBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.axisGridBorderColor")
    @js.native
    def axisGridBorderColor: String = js.native
    inline def axisGridBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisGridBorderColor")(x.asInstanceOf[js.Any])
    
    inline def axisGridBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisGridBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisGridLineDash")
    @js.native
    def axisGridLineDash: Any = js.native
    inline def axisGridLineDash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisGridLineDash")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisLabelFillColor")
    @js.native
    def axisLabelFillColor: String = js.native
    inline def axisLabelFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisLabelFontSize")
    @js.native
    def axisLabelFontSize: Double = js.native
    inline def axisLabelFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisLabelFontWeight")
    @js.native
    def axisLabelFontWeight: String | Double = js.native
    inline def axisLabelFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisLabelLineHeight")
    @js.native
    def axisLabelLineHeight: Double = js.native
    inline def axisLabelLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisLabelOffset")
    @js.native
    def axisLabelOffset: Double = js.native
    inline def axisLabelOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLabelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisLineBorder")
    @js.native
    def axisLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.axisLineBorderColor")
    @js.native
    def axisLineBorderColor: String = js.native
    inline def axisLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def axisLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisLineDash")
    @js.native
    def axisLineDash: Any = js.native
    inline def axisLineDash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisLineDash")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisSubTickLineBorder")
    @js.native
    def axisSubTickLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.axisSubTickLineBorderColor")
    @js.native
    def axisSubTickLineBorderColor: String = js.native
    inline def axisSubTickLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisSubTickLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def axisSubTickLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisSubTickLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisSubTickLineLength")
    @js.native
    def axisSubTickLineLength: Double = js.native
    inline def axisSubTickLineLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisSubTickLineLength")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisTickLineBorder")
    @js.native
    def axisTickLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.axisTickLineBorderColor")
    @js.native
    def axisTickLineBorderColor: String = js.native
    inline def axisTickLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTickLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def axisTickLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTickLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisTickLineLength")
    @js.native
    def axisTickLineLength: Double = js.native
    inline def axisTickLineLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTickLineLength")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisTitleSpacing")
    @js.native
    def axisTitleSpacing: Double = js.native
    inline def axisTitleSpacing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisTitleTextFillColor")
    @js.native
    def axisTitleTextFillColor: String = js.native
    inline def axisTitleTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisTitleTextFontSize")
    @js.native
    def axisTitleTextFontSize: Double = js.native
    inline def axisTitleTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisTitleTextFontWeight")
    @js.native
    def axisTitleTextFontWeight: String | Double = js.native
    inline def axisTitleTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.axisTitleTextLineHeight")
    @js.native
    def axisTitleTextLineHeight: Double = js.native
    inline def axisTitleTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("axisTitleTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.backgroundColor")
    @js.native
    def backgroundColor: String = js.native
    inline def backgroundColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.brandColor")
    @js.native
    def brandColor: String = js.native
    inline def brandColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brandColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderBackgroundFillColor")
    @js.native
    def cSliderBackgroundFillColor: String = js.native
    inline def cSliderBackgroundFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderBackgroundFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderBackgroundFillOpacity")
    @js.native
    def cSliderBackgroundFillOpacity: Double = js.native
    inline def cSliderBackgroundFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderBackgroundFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderForegroundFillColor")
    @js.native
    def cSliderForegroundFillColor: String = js.native
    inline def cSliderForegroundFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderForegroundFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderForegroundFillOpacity")
    @js.native
    def cSliderForegroundFillOpacity: Double = js.native
    inline def cSliderForegroundFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderForegroundFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderHandlerBorder")
    @js.native
    def cSliderHandlerBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderHandlerBorderColor")
    @js.native
    def cSliderHandlerBorderColor: String = js.native
    inline def cSliderHandlerBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderHandlerBorderRadius")
    @js.native
    def cSliderHandlerBorderRadius: Double = js.native
    inline def cSliderHandlerBorderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerBorderRadius")(x.asInstanceOf[js.Any])
    
    inline def cSliderHandlerBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderHandlerFillColor")
    @js.native
    def cSliderHandlerFillColor: String = js.native
    inline def cSliderHandlerFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderHandlerFillOpacity")
    @js.native
    def cSliderHandlerFillOpacity: Double = js.native
    inline def cSliderHandlerFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderHandlerHeight")
    @js.native
    def cSliderHandlerHeight: Double = js.native
    inline def cSliderHandlerHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderHandlerHighlightFillColor")
    @js.native
    def cSliderHandlerHighlightFillColor: String = js.native
    inline def cSliderHandlerHighlightFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerHighlightFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderHandlerWidth")
    @js.native
    def cSliderHandlerWidth: Double = js.native
    inline def cSliderHandlerWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderHandlerWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderRailHieght")
    @js.native
    def cSliderRailHieght: Double = js.native
    inline def cSliderRailHieght_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderRailHieght")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderTextBorder")
    @js.native
    def cSliderTextBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderTextBorderColor")
    @js.native
    def cSliderTextBorderColor: Any = js.native
    inline def cSliderTextBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextBorderColor")(x.asInstanceOf[js.Any])
    
    inline def cSliderTextBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderTextFillColor")
    @js.native
    def cSliderTextFillColor: String = js.native
    inline def cSliderTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderTextFillOpacity")
    @js.native
    def cSliderTextFillOpacity: Double = js.native
    inline def cSliderTextFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderTextFontSize")
    @js.native
    def cSliderTextFontSize: Double = js.native
    inline def cSliderTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderTextFontWeight")
    @js.native
    def cSliderTextFontWeight: String | Double = js.native
    inline def cSliderTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.cSliderTextLineHeight")
    @js.native
    def cSliderTextLineHeight: Double = js.native
    inline def cSliderTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cSliderTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.fontFamily")
    @js.native
    def fontFamily: String = js.native
    inline def fontFamily_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaActiveBorder")
    @js.native
    def hollowAreaActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaActiveBorderColor")
    @js.native
    def hollowAreaActiveBorderColor: String = js.native
    inline def hollowAreaActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaActiveBorderOpacity")
    @js.native
    def hollowAreaActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def hollowAreaActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowAreaActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaBorder")
    @js.native
    def hollowAreaBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaBorderColor")
    @js.native
    def hollowAreaBorderColor: String = js.native
    inline def hollowAreaBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaBorderOpacity")
    @js.native
    def hollowAreaBorderOpacity: Double = js.native
    inline def hollowAreaBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowAreaBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaInactiveBorder")
    @js.native
    def hollowAreaInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaInactiveBorderColor")
    @js.native
    def hollowAreaInactiveBorderColor: js.UndefOr[String] = js.native
    inline def hollowAreaInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaInactiveBorderOpacity")
    @js.native
    def hollowAreaInactiveBorderOpacity: Double = js.native
    inline def hollowAreaInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowAreaInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaSelectedBorder")
    @js.native
    def hollowAreaSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaSelectedBorderColor")
    @js.native
    def hollowAreaSelectedBorderColor: String = js.native
    inline def hollowAreaSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowAreaSelectedBorderOpacity")
    @js.native
    def hollowAreaSelectedBorderOpacity: js.UndefOr[Double] = js.native
    inline def hollowAreaSelectedBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowAreaSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowAreaSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalActiveBorder")
    @js.native
    def hollowIntervalActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalActiveBorderColor")
    @js.native
    def hollowIntervalActiveBorderColor: String = js.native
    inline def hollowIntervalActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalActiveBorderOpacity")
    @js.native
    def hollowIntervalActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def hollowIntervalActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowIntervalActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalBorder")
    @js.native
    def hollowIntervalBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalBorderColor")
    @js.native
    def hollowIntervalBorderColor: String = js.native
    inline def hollowIntervalBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalBorderOpacity")
    @js.native
    def hollowIntervalBorderOpacity: Double = js.native
    inline def hollowIntervalBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowIntervalBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalFillColor")
    @js.native
    def hollowIntervalFillColor: String = js.native
    inline def hollowIntervalFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalFillOpacity")
    @js.native
    def hollowIntervalFillOpacity: js.UndefOr[Double] = js.native
    inline def hollowIntervalFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalInactiveBorder")
    @js.native
    def hollowIntervalInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalInactiveBorderColor")
    @js.native
    def hollowIntervalInactiveBorderColor: js.UndefOr[String] = js.native
    inline def hollowIntervalInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalInactiveBorderOpacity")
    @js.native
    def hollowIntervalInactiveBorderOpacity: Double = js.native
    inline def hollowIntervalInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowIntervalInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalSelectedBorder")
    @js.native
    def hollowIntervalSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalSelectedBorderColor")
    @js.native
    def hollowIntervalSelectedBorderColor: String = js.native
    inline def hollowIntervalSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowIntervalSelectedBorderOpacity")
    @js.native
    def hollowIntervalSelectedBorderOpacity: Double = js.native
    inline def hollowIntervalSelectedBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowIntervalSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowIntervalSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointActiveBorder")
    @js.native
    def hollowPointActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointActiveBorderColor")
    @js.native
    def hollowPointActiveBorderColor: String = js.native
    inline def hollowPointActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointActiveBorderOpacity")
    @js.native
    def hollowPointActiveBorderOpacity: Double = js.native
    inline def hollowPointActiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowPointActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointActiveSize")
    @js.native
    def hollowPointActiveSize: js.UndefOr[Double] = js.native
    inline def hollowPointActiveSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointActiveSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointBorder")
    @js.native
    def hollowPointBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointBorderColor")
    @js.native
    def hollowPointBorderColor: String = js.native
    inline def hollowPointBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointBorderOpacity")
    @js.native
    def hollowPointBorderOpacity: Double = js.native
    inline def hollowPointBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowPointBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointFillColor")
    @js.native
    def hollowPointFillColor: String = js.native
    inline def hollowPointFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointFillOpacity")
    @js.native
    def hollowPointFillOpacity: js.UndefOr[Double] = js.native
    inline def hollowPointFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointInactiveBorder")
    @js.native
    def hollowPointInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointInactiveBorderColor")
    @js.native
    def hollowPointInactiveBorderColor: js.UndefOr[String] = js.native
    inline def hollowPointInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointInactiveBorderOpacity")
    @js.native
    def hollowPointInactiveBorderOpacity: Double = js.native
    inline def hollowPointInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowPointInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointInactiveSize")
    @js.native
    def hollowPointInactiveSize: js.UndefOr[Double] = js.native
    inline def hollowPointInactiveSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointInactiveSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointSelectedBorder")
    @js.native
    def hollowPointSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointSelectedBorderColor")
    @js.native
    def hollowPointSelectedBorderColor: String = js.native
    inline def hollowPointSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointSelectedBorderOpacity")
    @js.native
    def hollowPointSelectedBorderOpacity: Double = js.native
    inline def hollowPointSelectedBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def hollowPointSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointSelectedSize")
    @js.native
    def hollowPointSelectedSize: js.UndefOr[Double] = js.native
    inline def hollowPointSelectedSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSelectedSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.hollowPointSize")
    @js.native
    def hollowPointSize: Double = js.native
    inline def hollowPointSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hollowPointSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.innerLabelBorder")
    @js.native
    def innerLabelBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.innerLabelBorderColor")
    @js.native
    def innerLabelBorderColor: Any = js.native
    inline def innerLabelBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelBorderColor")(x.asInstanceOf[js.Any])
    
    inline def innerLabelBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.innerLabelFillColor")
    @js.native
    def innerLabelFillColor: String = js.native
    inline def innerLabelFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.innerLabelFontSize")
    @js.native
    def innerLabelFontSize: Double = js.native
    inline def innerLabelFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.innerLabelFontWeight")
    @js.native
    def innerLabelFontWeight: String | Double = js.native
    inline def innerLabelFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.innerLabelLineHeight")
    @js.native
    def innerLabelLineHeight: Double = js.native
    inline def innerLabelLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerLabelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalActiveBorder")
    @js.native
    def intervalActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalActiveBorderColor")
    @js.native
    def intervalActiveBorderColor: String = js.native
    inline def intervalActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalActiveBorderOpacity")
    @js.native
    def intervalActiveBorderOpacity: Double = js.native
    inline def intervalActiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def intervalActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalActiveFillColor")
    @js.native
    def intervalActiveFillColor: js.UndefOr[String] = js.native
    inline def intervalActiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalActiveFillOpacity")
    @js.native
    def intervalActiveFillOpacity: js.UndefOr[Double] = js.native
    inline def intervalActiveFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalActiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalBorder")
    @js.native
    def intervalBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalBorderColor")
    @js.native
    def intervalBorderColor: js.UndefOr[String] = js.native
    inline def intervalBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalBorderOpacity")
    @js.native
    def intervalBorderOpacity: js.UndefOr[Double] = js.native
    inline def intervalBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def intervalBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalFillColor")
    @js.native
    def intervalFillColor: String = js.native
    inline def intervalFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalFillOpacity")
    @js.native
    def intervalFillOpacity: Double = js.native
    inline def intervalFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalInactiveBorder")
    @js.native
    def intervalInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalInactiveBorderColor")
    @js.native
    def intervalInactiveBorderColor: js.UndefOr[String] = js.native
    inline def intervalInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalInactiveBorderOpacity")
    @js.native
    def intervalInactiveBorderOpacity: Double = js.native
    inline def intervalInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def intervalInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalInactiveFillColor")
    @js.native
    def intervalInactiveFillColor: js.UndefOr[String] = js.native
    inline def intervalInactiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalInactiveFillOpacity")
    @js.native
    def intervalInactiveFillOpacity: Double = js.native
    inline def intervalInactiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalInactiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalSelectedBorder")
    @js.native
    def intervalSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalSelectedBorderColor")
    @js.native
    def intervalSelectedBorderColor: String = js.native
    inline def intervalSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalSelectedBorderOpacity")
    @js.native
    def intervalSelectedBorderOpacity: Double = js.native
    inline def intervalSelectedBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def intervalSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalSelectedFillColor")
    @js.native
    def intervalSelectedFillColor: js.UndefOr[String] = js.native
    inline def intervalSelectedFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.intervalSelectedFillOpacity")
    @js.native
    def intervalSelectedFillOpacity: js.UndefOr[Double] = js.native
    inline def intervalSelectedFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalSelectedFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.labelBorder")
    @js.native
    def labelBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.labelBorderColor")
    @js.native
    def labelBorderColor: Any = js.native
    inline def labelBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBorderColor")(x.asInstanceOf[js.Any])
    
    inline def labelBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.labelFillColor")
    @js.native
    def labelFillColor: String = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.labelFillColorDark")
    @js.native
    def labelFillColorDark: String = js.native
    inline def labelFillColorDark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFillColorDark")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.labelFillColorLight")
    @js.native
    def labelFillColorLight: String = js.native
    inline def labelFillColorLight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFillColorLight")(x.asInstanceOf[js.Any])
    
    inline def labelFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.labelFontSize")
    @js.native
    def labelFontSize: Double = js.native
    inline def labelFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.labelFontWeight")
    @js.native
    def labelFontWeight: String | Double = js.native
    inline def labelFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.labelLineBorder")
    @js.native
    def labelLineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.labelLineBorderColor")
    @js.native
    def labelLineBorderColor: String = js.native
    inline def labelLineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineBorderColor")(x.asInstanceOf[js.Any])
    
    inline def labelLineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.labelLineHeight")
    @js.native
    def labelLineHeight: Double = js.native
    inline def labelLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendCircleMarkerSize")
    @js.native
    def legendCircleMarkerSize: Double = js.native
    inline def legendCircleMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendCircleMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendHorizontalPadding")
    @js.native
    def legendHorizontalPadding: js.Array[Double] = js.native
    inline def legendHorizontalPadding_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendHorizontalPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendItemMarginBottom")
    @js.native
    def legendItemMarginBottom: Double = js.native
    inline def legendItemMarginBottom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemMarginBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendItemNameFillColor")
    @js.native
    def legendItemNameFillColor: String = js.native
    inline def legendItemNameFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemNameFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendItemNameFontSize")
    @js.native
    def legendItemNameFontSize: Double = js.native
    inline def legendItemNameFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemNameFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendItemNameFontWeight")
    @js.native
    def legendItemNameFontWeight: String | Double = js.native
    inline def legendItemNameFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemNameFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendItemNameLineHeight")
    @js.native
    def legendItemNameLineHeight: Double = js.native
    inline def legendItemNameLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemNameLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendItemSpacing")
    @js.native
    def legendItemSpacing: Double = js.native
    inline def legendItemSpacing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendItemSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendLineMarkerSize")
    @js.native
    def legendLineMarkerSize: Double = js.native
    inline def legendLineMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendLineMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendMarkerColor")
    @js.native
    def legendMarkerColor: String = js.native
    inline def legendMarkerColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendMarkerSize")
    @js.native
    def legendMarkerSize: Double = js.native
    inline def legendMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendMarkerSpacing")
    @js.native
    def legendMarkerSpacing: Double = js.native
    inline def legendMarkerSpacing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendPadding")
    @js.native
    def legendPadding: js.Array[Double] = js.native
    inline def legendPadding_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendPageNavigatorMarkerFillColor")
    @js.native
    def legendPageNavigatorMarkerFillColor: String = js.native
    inline def legendPageNavigatorMarkerFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendPageNavigatorMarkerFillOpacity")
    @js.native
    def legendPageNavigatorMarkerFillOpacity: Double = js.native
    inline def legendPageNavigatorMarkerFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendPageNavigatorMarkerInactiveFillColor")
    @js.native
    def legendPageNavigatorMarkerInactiveFillColor: String = js.native
    inline def legendPageNavigatorMarkerInactiveFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerInactiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendPageNavigatorMarkerInactiveFillOpacity")
    @js.native
    def legendPageNavigatorMarkerInactiveFillOpacity: Double = js.native
    inline def legendPageNavigatorMarkerInactiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerInactiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendPageNavigatorMarkerSize")
    @js.native
    def legendPageNavigatorMarkerSize: Double = js.native
    inline def legendPageNavigatorMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendPageNavigatorTextFillColor")
    @js.native
    def legendPageNavigatorTextFillColor: String = js.native
    inline def legendPageNavigatorTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendPageNavigatorTextFontSize")
    @js.native
    def legendPageNavigatorTextFontSize: Double = js.native
    inline def legendPageNavigatorTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendPageNavigatorTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendSquareMarkerSize")
    @js.native
    def legendSquareMarkerSize: Double = js.native
    inline def legendSquareMarkerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendSquareMarkerSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendTitleTextFillColor")
    @js.native
    def legendTitleTextFillColor: String = js.native
    inline def legendTitleTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendTitleTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendTitleTextFontSize")
    @js.native
    def legendTitleTextFontSize: Double = js.native
    inline def legendTitleTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendTitleTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendTitleTextFontWeight")
    @js.native
    def legendTitleTextFontWeight: String | Double = js.native
    inline def legendTitleTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendTitleTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendTitleTextLineHeight")
    @js.native
    def legendTitleTextLineHeight: Double = js.native
    inline def legendTitleTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendTitleTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.legendVerticalPadding")
    @js.native
    def legendVerticalPadding: js.Array[Double] = js.native
    inline def legendVerticalPadding_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendVerticalPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.lineActiveBorder")
    @js.native
    def lineActiveBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.lineActiveBorderColor")
    @js.native
    def lineActiveBorderColor: js.UndefOr[String] = js.native
    inline def lineActiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.lineActiveBorderOpacity")
    @js.native
    def lineActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def lineActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def lineActiveBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.lineBorder")
    @js.native
    def lineBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.lineBorderColor")
    @js.native
    def lineBorderColor: String = js.native
    inline def lineBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.lineBorderOpacity")
    @js.native
    def lineBorderOpacity: Double = js.native
    inline def lineBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def lineBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.lineInactiveBorder")
    @js.native
    def lineInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.lineInactiveBorderColor")
    @js.native
    def lineInactiveBorderColor: js.UndefOr[String] = js.native
    inline def lineInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.lineInactiveBorderOpacity")
    @js.native
    def lineInactiveBorderOpacity: Double = js.native
    inline def lineInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def lineInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.lineSelectedBorder")
    @js.native
    def lineSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.lineSelectedBorderColor")
    @js.native
    def lineSelectedBorderColor: js.UndefOr[String] = js.native
    inline def lineSelectedBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.lineSelectedBorderOpacity")
    @js.native
    def lineSelectedBorderOpacity: js.UndefOr[Double] = js.native
    inline def lineSelectedBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def lineSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.overflowLabelBorder")
    @js.native
    def overflowLabelBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.overflowLabelBorderColor")
    @js.native
    def overflowLabelBorderColor: String = js.native
    inline def overflowLabelBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelBorderColor")(x.asInstanceOf[js.Any])
    
    inline def overflowLabelBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.overflowLabelFillColor")
    @js.native
    def overflowLabelFillColor: String = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.overflowLabelFillColorDark")
    @js.native
    def overflowLabelFillColorDark: js.UndefOr[String] = js.native
    inline def overflowLabelFillColorDark_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFillColorDark")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.overflowLabelFillColorLight")
    @js.native
    def overflowLabelFillColorLight: js.UndefOr[String] = js.native
    inline def overflowLabelFillColorLight_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFillColorLight")(x.asInstanceOf[js.Any])
    
    inline def overflowLabelFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.overflowLabelFontSize")
    @js.native
    def overflowLabelFontSize: Double = js.native
    inline def overflowLabelFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.overflowLabelFontWeight")
    @js.native
    def overflowLabelFontWeight: String | Double = js.native
    inline def overflowLabelFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.overflowLabelLineHeight")
    @js.native
    def overflowLabelLineHeight: Double = js.native
    inline def overflowLabelLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowLabelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.paletteQualitative10")
    @js.native
    def paletteQualitative10: js.Array[String] = js.native
    inline def paletteQualitative10_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteQualitative10")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.paletteQualitative20")
    @js.native
    def paletteQualitative20: js.Array[String] = js.native
    inline def paletteQualitative20_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteQualitative20")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.paletteSemanticGreen")
    @js.native
    def paletteSemanticGreen: String = js.native
    inline def paletteSemanticGreen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteSemanticGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.paletteSemanticRed")
    @js.native
    def paletteSemanticRed: String = js.native
    inline def paletteSemanticRed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteSemanticRed")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.paletteSemanticYellow")
    @js.native
    def paletteSemanticYellow: String = js.native
    inline def paletteSemanticYellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteSemanticYellow")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.paletteSequence")
    @js.native
    def paletteSequence: js.Array[String] = js.native
    inline def paletteSequence_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paletteSequence")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointActiveBorder")
    @js.native
    def pointActiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.pointActiveBorderColor")
    @js.native
    def pointActiveBorderColor: String = js.native
    inline def pointActiveBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointActiveBorderOpacity")
    @js.native
    def pointActiveBorderOpacity: js.UndefOr[Double] = js.native
    inline def pointActiveBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def pointActiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointActiveFillColor")
    @js.native
    def pointActiveFillColor: js.UndefOr[String] = js.native
    inline def pointActiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointActiveFillOpacity")
    @js.native
    def pointActiveFillOpacity: js.UndefOr[Double] = js.native
    inline def pointActiveFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointActiveSize")
    @js.native
    def pointActiveSize: js.UndefOr[Double] = js.native
    inline def pointActiveSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointBorder")
    @js.native
    def pointBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.pointBorderColor")
    @js.native
    def pointBorderColor: String = js.native
    inline def pointBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointBorderOpacity")
    @js.native
    def pointBorderOpacity: Double = js.native
    inline def pointBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def pointBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointFillColor")
    @js.native
    def pointFillColor: String = js.native
    inline def pointFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointFillOpacity")
    @js.native
    def pointFillOpacity: Double = js.native
    inline def pointFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointInactiveBorder")
    @js.native
    def pointInactiveBorder: js.UndefOr[Double] = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.pointInactiveBorderColor")
    @js.native
    def pointInactiveBorderColor: js.UndefOr[String] = js.native
    inline def pointInactiveBorderColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointInactiveBorderOpacity")
    @js.native
    def pointInactiveBorderOpacity: Double = js.native
    inline def pointInactiveBorderOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def pointInactiveBorder_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointInactiveFillColor")
    @js.native
    def pointInactiveFillColor: js.UndefOr[String] = js.native
    inline def pointInactiveFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointInactiveFillOpacity")
    @js.native
    def pointInactiveFillOpacity: Double = js.native
    inline def pointInactiveFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointInactiveSize")
    @js.native
    def pointInactiveSize: js.UndefOr[Double] = js.native
    inline def pointInactiveSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointInactiveSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointSelectedBorder")
    @js.native
    def pointSelectedBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.pointSelectedBorderColor")
    @js.native
    def pointSelectedBorderColor: String = js.native
    inline def pointSelectedBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointSelectedBorderOpacity")
    @js.native
    def pointSelectedBorderOpacity: js.UndefOr[Double] = js.native
    inline def pointSelectedBorderOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedBorderOpacity")(x.asInstanceOf[js.Any])
    
    inline def pointSelectedBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointSelectedFillColor")
    @js.native
    def pointSelectedFillColor: js.UndefOr[String] = js.native
    inline def pointSelectedFillColor_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointSelectedFillOpacity")
    @js.native
    def pointSelectedFillOpacity: js.UndefOr[Double] = js.native
    inline def pointSelectedFillOpacity_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointSelectedSize")
    @js.native
    def pointSelectedSize: js.UndefOr[Double] = js.native
    inline def pointSelectedSize_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSelectedSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.pointSize")
    @js.native
    def pointSize: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.pointSizeRange")
    @js.native
    def pointSizeRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    inline def pointSizeRange_=(x: js.UndefOr[js.Tuple2[Double, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSizeRange")(x.asInstanceOf[js.Any])
    
    inline def pointSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.scrollbarThumbFillColor")
    @js.native
    def scrollbarThumbFillColor: String = js.native
    inline def scrollbarThumbFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarThumbFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.scrollbarThumbHighlightFillColor")
    @js.native
    def scrollbarThumbHighlightFillColor: String = js.native
    inline def scrollbarThumbHighlightFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarThumbHighlightFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.scrollbarTrackFillColor")
    @js.native
    def scrollbarTrackFillColor: String = js.native
    inline def scrollbarTrackFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarTrackFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderHandlerBorder")
    @js.native
    def sliderHandlerBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderHandlerBorderColor")
    @js.native
    def sliderHandlerBorderColor: String = js.native
    inline def sliderHandlerBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerBorderColor")(x.asInstanceOf[js.Any])
    
    inline def sliderHandlerBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderHandlerFillColor")
    @js.native
    def sliderHandlerFillColor: String = js.native
    inline def sliderHandlerFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderHandlerHeight")
    @js.native
    def sliderHandlerHeight: Double = js.native
    inline def sliderHandlerHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderHandlerWidth")
    @js.native
    def sliderHandlerWidth: Double = js.native
    inline def sliderHandlerWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderHandlerWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderLabelTextFillColor")
    @js.native
    def sliderLabelTextFillColor: String = js.native
    inline def sliderLabelTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderLabelTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderLabelTextFontSize")
    @js.native
    def sliderLabelTextFontSize: Double = js.native
    inline def sliderLabelTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderLabelTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderLabelTextFontWeight")
    @js.native
    def sliderLabelTextFontWeight: String | Double = js.native
    inline def sliderLabelTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderLabelTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderLabelTextLineHeight")
    @js.native
    def sliderLabelTextLineHeight: Double = js.native
    inline def sliderLabelTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderLabelTextLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderRailBorder")
    @js.native
    def sliderRailBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderRailBorderColor")
    @js.native
    def sliderRailBorderColor: Any = js.native
    inline def sliderRailBorderColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailBorderColor")(x.asInstanceOf[js.Any])
    
    inline def sliderRailBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderRailFillColor")
    @js.native
    def sliderRailFillColor: String = js.native
    inline def sliderRailFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderRailHeight")
    @js.native
    def sliderRailHeight: Double = js.native
    inline def sliderRailHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.sliderRailWidth")
    @js.native
    def sliderRailWidth: Double = js.native
    inline def sliderRailWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sliderRailWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.subColor")
    @js.native
    def subColor: String = js.native
    inline def subColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipContainerBorderRadius")
    @js.native
    def tooltipContainerBorderRadius: Double = js.native
    inline def tooltipContainerBorderRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainerBorderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipContainerFillColor")
    @js.native
    def tooltipContainerFillColor: String = js.native
    inline def tooltipContainerFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainerFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipContainerFillOpacity")
    @js.native
    def tooltipContainerFillOpacity: Double = js.native
    inline def tooltipContainerFillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainerFillOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipContainerShadow")
    @js.native
    def tooltipContainerShadow: String = js.native
    inline def tooltipContainerShadow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainerShadow")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipCrosshairsBorder")
    @js.native
    def tooltipCrosshairsBorder: Double = js.native
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipCrosshairsBorderColor")
    @js.native
    def tooltipCrosshairsBorderColor: String = js.native
    inline def tooltipCrosshairsBorderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipCrosshairsBorderColor")(x.asInstanceOf[js.Any])
    
    inline def tooltipCrosshairsBorder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipCrosshairsBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipCrosshairsLineDash")
    @js.native
    def tooltipCrosshairsLineDash: Any = js.native
    inline def tooltipCrosshairsLineDash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipCrosshairsLineDash")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipTextFillColor")
    @js.native
    def tooltipTextFillColor: String = js.native
    inline def tooltipTextFillColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipTextFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipTextFontSize")
    @js.native
    def tooltipTextFontSize: Double = js.native
    inline def tooltipTextFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipTextFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipTextFontWeight")
    @js.native
    def tooltipTextFontWeight: String | Double = js.native
    inline def tooltipTextFontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipTextFontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts/lib/core", "antvLight.tooltipTextLineHeight")
    @js.native
    def tooltipTextLineHeight: Double = js.native
    inline def tooltipTextLineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipTextLineHeight")(x.asInstanceOf[js.Any])
  }
  
  inline def createThemeByStyleSheet(styleSheet: StyleSheet): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createThemeByStyleSheet")(styleSheet.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
  
  inline def getActionClass(actionName: String): ActionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionClass")(actionName.asInstanceOf[js.Any]).asInstanceOf[ActionConstructor]
  
  inline def getAnimation(`type`: String): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimation")(`type`.asInstanceOf[js.Any]).asInstanceOf[Animation]
  
  inline def getEngine(name: String): IG = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")(name.asInstanceOf[js.Any]).asInstanceOf[IG]
  
  inline def getFacet(`type`: String): FacetCtor = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacet")(`type`.asInstanceOf[js.Any]).asInstanceOf[FacetCtor]
  
  inline def getGeometryLabel(`type`: String): GeometryLabelConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryLabel")(`type`.asInstanceOf[js.Any]).asInstanceOf[GeometryLabelConstructor]
  
  inline def getGeometryLabelLayout(`type`: String): GeometryLabelsLayoutFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryLabelLayout")(`type`.asInstanceOf[js.Any]).asInstanceOf[GeometryLabelsLayoutFn]
  
  inline def getInteraction(name: String): InteractionSteps | InteractionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteraction")(name.asInstanceOf[js.Any]).asInstanceOf[InteractionSteps | InteractionConstructor]
  
  inline def getShapeFactory(factoryName: String): ShapeFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("getShapeFactory")(factoryName.asInstanceOf[js.Any]).asInstanceOf[ShapeFactory]
  
  inline def getTheme(): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[LooseObject]
  inline def getTheme(theme: String): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
  
  inline def registerAction(actionName: String, ActionClass: ActionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerAction(actionName: String, ActionClass: ActionConstructor, cfg: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerAnimation(`type`: String, animation: Animation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(`type`.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerComponentController(name: String, plugin: ControllerCtor[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponentController")(name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerEngine(name: String, engine: IG): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEngine")(name.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerFacet(`type`: String, ctor: FacetCtor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFacet")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerGeometry(name: String, Ctor: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometry")(name.asInstanceOf[js.Any], Ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerGeometryLabel(`type`: String, ctor: GeometryLabelConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometryLabel")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerGeometryLabelLayout(`type`: String, layoutFn: GeometryLabelsLayoutFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometryLabelLayout")(`type`.asInstanceOf[js.Any], layoutFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerInteraction(name: String, interaction: InteractionSteps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInteraction")(name.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerInteraction(name: String, interaction: InteractionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInteraction")(name.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerShape(factoryName: String, shapeType: String, cfg: RegisterShape): Shape = (^.asInstanceOf[js.Dynamic].applyDynamic("registerShape")(factoryName.asInstanceOf[js.Any], shapeType.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Shape]
  
  inline def registerShapeFactory(factoryName: String, cfg: RegisterShapeFactory): ShapeFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("registerShapeFactory")(factoryName.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[ShapeFactory]
  
  inline def registerTheme(theme: String, value: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(theme.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultErrorFallback(CustComponents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultErrorFallback")(CustComponents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGlobal(datum: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(datum.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
