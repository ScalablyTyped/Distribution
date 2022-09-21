package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.Column
import typings.vegaLite8ozrbXDH.anon.PartialRecordExtendedChan
import typings.vegaLite8ozrbXDH.channelDTsMod.Channel
import typings.vegaLite8ozrbXDH.channelDTsMod.ExtendedChannel
import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.channelDTsMod.SingleDefChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldRefOption
import typings.vegaLite8ozrbXDH.componentDDotTsMod.LayoutSizeComponent
import typings.vegaLite8ozrbXDH.componentDDotTsMod.LayoutSizeType
import typings.vegaLite8ozrbXDH.componentDTsMod.AxisComponentIndex
import typings.vegaLite8ozrbXDH.componentDotdDottsMod.LegendComponentIndex
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.dataDTsMod.Data
import typings.vegaLite8ozrbXDH.dataDTsMod.DataSourceType
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.indexDDotTsMod.SelectionComponent
import typings.vegaLite8ozrbXDH.indexDTsMod.DataComponent
import typings.vegaLite8ozrbXDH.projectionComponentDTsMod.ProjectionComponent
import typings.vegaLite8ozrbXDH.resolveDotDTsMod.Resolve
import typings.vegaLite8ozrbXDH.scaleComponentDTsMod.ScaleComponent
import typings.vegaLite8ozrbXDH.scaleComponentDTsMod.ScaleComponentIndex
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionType
import typings.vegaLite8ozrbXDH.specBaseDTsMod.GenericCompositionLayoutWithColumns
import typings.vegaLite8ozrbXDH.specBaseDTsMod.LayoutSizeMixins
import typings.vegaLite8ozrbXDH.specBaseDTsMod.SpecType
import typings.vegaLite8ozrbXDH.specBaseDTsMod.ViewBackground
import typings.vegaLite8ozrbXDH.specIndexDTsMod.NormalizedSpec
import typings.vegaLite8ozrbXDH.titleDTsMod.TitleParams
import typings.vegaLite8ozrbXDH.transformDTsMod.Transform
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgData
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgEncodeEntry
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgLayout
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgMarkGroup
import typings.vegaTypings.axisMod.Axis
import typings.vegaTypings.legendMod.Legend
import typings.vegaTypings.projectionMod.Projection
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.signalMod.Signal
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/model.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/model.d.ts", "Model")
  @js.native
  abstract class Model protected () extends StObject {
    def this(
      spec: NormalizedSpec,
      `type`: SpecType,
      parent: Model,
      parentGivenName: String,
      config: Config[SignalRef],
      resolve: Resolve
    ) = this()
    def this(
      spec: NormalizedSpec,
      `type`: SpecType,
      parent: Model,
      parentGivenName: String,
      config: Config[SignalRef],
      resolve: Resolve,
      view: ViewBackground[ExprRef | SignalRef]
    ) = this()
    
    def assembleAxes(): js.Array[Axis] = js.native
    
    /* protected */ def assembleDefaultLayout(): VgLayout = js.native
    
    /* private */ var assembleEncodeFromView: Any = js.native
    
    /**
      * Assemble the mark group for this model. We accept optional `signals` so that we can include concat top-level signals with the top-level model's local signals.
      */
    def assembleGroup(): Any = js.native
    def assembleGroup(signals: js.Array[Signal]): Any = js.native
    
    def assembleGroupEncodeEntry(isTopLevel: Boolean): VgEncodeEntry = js.native
    
    def assembleGroupStyle(): String | js.Array[String] = js.native
    
    def assembleHeaderMarks(): js.Array[VgMarkGroup] = js.native
    
    def assembleLayout(): VgLayout = js.native
    
    def assembleLayoutSignals(): js.Array[NewSignal] = js.native
    
    def assembleLegends(): js.Array[Legend] = js.native
    
    def assembleMarks(): js.Array[VgMarkGroup] = js.native
    
    def assembleProjections(): js.Array[Projection] = js.native
    
    def assembleSelectionData(data: js.Array[VgData]): js.Array[VgData] = js.native
    
    def assembleSelectionTopLevelSignals(signals: js.Array[NewSignal]): js.Array[NewSignal] = js.native
    
    def assembleSignals(): js.Array[NewSignal] = js.native
    
    def assembleTitle(): Title = js.native
    
    val children: js.Array[Model] = js.native
    
    val component: Component = js.native
    
    val config: Config[SignalRef] = js.native
    
    /**
      * Corrects the data references in marks after assemble.
      */
    def correctDataNames(mark: VgMarkGroup): Any = js.native
    
    val data: Data | Null = js.native
    
    val description: String = js.native
    
    def getDataName(`type`: DataSourceType): String = js.native
    
    def getName(text: String): String = js.native
    
    /**
      * Traverse a model's hierarchy to get the scale component for a particular channel.
      */
    def getScaleComponent(channel: ScaleChannel): ScaleComponent = js.native
    
    /**
      * Traverse a model's hierarchy to get a particular selection component.
      */
    def getSelectionComponent(variableName: String, origName: String): SelectionComponent[SelectionType] = js.native
    
    def getSignalName(oldSignalName: String): String = js.native
    
    def getSizeSignalRef(layoutSizeType: LayoutSizeType): SignalRef = js.native
    
    /**
      * Returns true if the model has a signalRef for an axis orient.
      */
    def hasAxisOrientSignalRef(): Boolean = js.native
    
    def height: SignalRef = js.native
    
    val layout: GenericCompositionLayoutWithColumns = js.native
    
    /**
      * Lookup the name of the datasource for an output node. You probably want to call this in assemble.
      */
    def lookupDataSource(name: String): String = js.native
    
    val name: String = js.native
    
    val parent: Model = js.native
    
    def parse(): Unit = js.native
    
    def parseAxesAndHeaders(): Unit = js.native
    
    def parseData(): Unit = js.native
    
    def parseLayoutSize(): Unit = js.native
    
    def parseLegends(): Unit = js.native
    
    def parseMarkGroup(): Unit = js.native
    
    def parseProjection(): Unit = js.native
    
    def parseScale(): Unit = js.native
    
    def parseSelections(): Unit = js.native
    
    /**
      * @return projection name after the projection has been parsed and named.
      */
    def projectionName(): String = js.native
    def projectionName(parse: Boolean): String = js.native
    
    /** Name map for projections, which can be renamed by a model's parent. */
    /* protected */ var projectionNameMap: NameMapInterface = js.native
    
    def renameProjection(oldName: String, newName: String): Unit = js.native
    
    def renameScale(oldName: String, newName: String): Unit = js.native
    
    def renameSignal(oldName: String, newName: String): Unit = js.native
    
    /**
      * Rename top-level spec's size to be just width / height, ignoring model name.
      * This essentially merges the top-level spec's width/height signals with the width/height signals
      * to help us reduce redundant signals declaration.
      */
    /* private */ var renameTopLevelLayoutSizeSignal: Any = js.native
    
    /**
      * Request a data source name for the given data source type and mark that data source as required.
      * This method should be called in parse, so that all used data source can be correctly instantiated in assembleData().
      * You can lookup the correct dataset name in assemble with `lookupDataSource`.
      */
    def requestDataName(name: DataSourceType): String = js.native
    
    def scaleName(originalScaleName: String): String = js.native
    def scaleName(originalScaleName: String, parse: Boolean): String = js.native
    /**
      * @return scale name for a given channel after the scale has been parsed and named.
      */
    def scaleName(originalScaleName: ScaleChannel): String = js.native
    def scaleName(originalScaleName: ScaleChannel, parse: Boolean): String = js.native
    
    /** Name map for scales, which can be renamed by a model's parent. */
    /* protected */ var scaleNameMap: NameMapInterface = js.native
    
    /** Name map for signals, which can be renamed by a model's parent. */
    /* protected */ var signalNameMap: NameMapInterface = js.native
    
    var size: LayoutSizeMixins = js.native
    
    val title: TitleParams[SignalRef] = js.native
    
    val transforms: js.Array[Transform] = js.native
    
    val `type`: SpecType = js.native
    
    val view: js.UndefOr[ViewBackground[SignalRef]] = js.native
    
    def width: SignalRef = js.native
  }
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/model.d.ts", "ModelWithField")
  @js.native
  abstract class ModelWithField protected () extends Model {
    def this(
      spec: NormalizedSpec,
      `type`: SpecType,
      parent: Model,
      parentGivenName: String,
      config: Config[SignalRef],
      resolve: Resolve
    ) = this()
    def this(
      spec: NormalizedSpec,
      `type`: SpecType,
      parent: Model,
      parentGivenName: String,
      config: Config[SignalRef],
      resolve: Resolve,
      view: ViewBackground[ExprRef | SignalRef]
    ) = this()
    
    def channelHasField(channel: Channel): Boolean = js.native
    
    def fieldDef(channel: SingleDefChannel): FieldDef[Any, Any] = js.native
    
    def forEachFieldDef(f: js.Function2[/* fd */ FieldDef[String, Any], /* c */ ExtendedChannel, Unit]): Unit = js.native
    def forEachFieldDef(f: js.Function2[/* fd */ FieldDef[String, Any], /* c */ ExtendedChannel, Unit], t: Any): Unit = js.native
    
    /* protected */ def getMapping(): PartialRecordExtendedChan = js.native
    
    def reduceFieldDef[T, U](f: js.Function3[/* acc */ U, /* fd */ FieldDef[String, Any], /* c */ Channel, U], init: T): T = js.native
    
    /** Get "field" reference for Vega */
    def vgField(channel: SingleDefChannel): String = js.native
    def vgField(channel: SingleDefChannel, opt: FieldRefOption): String = js.native
  }
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/model.d.ts", "NameMap")
  @js.native
  open class NameMap ()
    extends StObject
       with NameMapInterface {
    
    /* CompleteClass */
    override def get(name: String): String = js.native
    
    /* CompleteClass */
    override def has(name: String): Boolean = js.native
    
    /* private */ var nameMap: Any = js.native
    
    /* CompleteClass */
    override def rename(oldname: String, newName: String): Unit = js.native
  }
  
  inline def isConcatModel(model: Model): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/concat.d.ts.ConcatModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConcatModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/concat.d.ts.ConcatModel */ Boolean]
  
  inline def isFacetModel(model: Model): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/facet.d.ts.FacetModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacetModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/facet.d.ts.FacetModel */ Boolean]
  
  inline def isLayerModel(model: Model): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/layer.d.ts.LayerModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayerModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/layer.d.ts.LayerModel */ Boolean]
  
  inline def isUnitModel(model: Model): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/unit.d.ts.UnitModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnitModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/unit.d.ts.UnitModel */ Boolean]
  
  trait Component extends StObject {
    
    /** Dictionary mapping channel to VgAxis definition */
    var axes: AxisComponentIndex
    
    var data: DataComponent
    
    var layoutHeaders: Column
    
    var layoutSize: LayoutSizeComponent
    
    /** Dictionary mapping channel to VgLegend definition */
    var legends: LegendComponentIndex
    
    var mark: js.Array[VgMarkGroup]
    
    var projection: ProjectionComponent
    
    var resolve: Resolve
    
    var scales: ScaleComponentIndex
    
    var selection: Dict[SelectionComponent[SelectionType]]
  }
  object Component {
    
    inline def apply(
      axes: AxisComponentIndex,
      data: DataComponent,
      layoutHeaders: Column,
      layoutSize: LayoutSizeComponent,
      legends: LegendComponentIndex,
      mark: js.Array[VgMarkGroup],
      projection: ProjectionComponent,
      resolve: Resolve,
      scales: ScaleComponentIndex,
      selection: Dict[SelectionComponent[SelectionType]]
    ): Component = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], layoutHeaders = layoutHeaders.asInstanceOf[js.Any], layoutSize = layoutSize.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    extension [Self <: Component](x: Self) {
      
      inline def setAxes(value: AxisComponentIndex): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataComponent): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLayoutHeaders(value: Column): Self = StObject.set(x, "layoutHeaders", value.asInstanceOf[js.Any])
      
      inline def setLayoutSize(value: LayoutSizeComponent): Self = StObject.set(x, "layoutSize", value.asInstanceOf[js.Any])
      
      inline def setLegends(value: LegendComponentIndex): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setMark(value: js.Array[VgMarkGroup]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkVarargs(value: VgMarkGroup*): Self = StObject.set(x, "mark", js.Array(value*))
      
      inline def setProjection(value: ProjectionComponent): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setScales(value: ScaleComponentIndex): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Dict[SelectionComponent[SelectionType]]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  trait NameMapInterface extends StObject {
    
    def get(name: String): String
    
    def has(name: String): Boolean
    
    def rename(oldname: String, newName: String): Unit
  }
  object NameMapInterface {
    
    inline def apply(get: String => String, has: String => Boolean, rename: (String, String) => Unit): NameMapInterface = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), rename = js.Any.fromFunction2(rename))
      __obj.asInstanceOf[NameMapInterface]
    }
    
    extension [Self <: NameMapInterface](x: Self) {
      
      inline def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setRename(value: (String, String) => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction2(value))
    }
  }
}
