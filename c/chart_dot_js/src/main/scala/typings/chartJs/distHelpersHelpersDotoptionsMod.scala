package typings.chartJs

import typings.chartJs.anon.Cacheable
import typings.chartJs.anon.LineHeight
import typings.chartJs.anon.Max
import typings.chartJs.anon.PartialFontSpec
import typings.chartJs.anon.Recordlefttopbottomrightn
import typings.chartJs.anon.RecordtopLefttopRightbott
import typings.chartJs.distTypesGeometricMod.ChartArea
import typings.chartJs.distTypesGeometricMod.Point
import typings.chartJs.distTypesGeometricMod.TRBL
import typings.chartJs.distTypesGeometricMod.TRBLCorners
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotoptionsMod {
  
  @JSImport("chart.js/dist/helpers/helpers.options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addGrace(minmax: Max, grace: String, beginAtZero: Boolean): Max = (^.asInstanceOf[js.Dynamic].applyDynamic("_addGrace")(minmax.asInstanceOf[js.Any], grace.asInstanceOf[js.Any], beginAtZero.asInstanceOf[js.Any])).asInstanceOf[Max]
  inline def addGrace(minmax: Max, grace: Double, beginAtZero: Boolean): Max = (^.asInstanceOf[js.Dynamic].applyDynamic("_addGrace")(minmax.asInstanceOf[js.Any], grace.asInstanceOf[js.Any], beginAtZero.asInstanceOf[js.Any])).asInstanceOf[Max]
  
  inline def createContext[T /* <: js.Object */](parentContext: Null, context: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(parentContext.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createContext[T /* <: js.Object */, P /* <: T */](parentContext: P, context: T): P & T = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(parentContext.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[P & T]
  
  inline def readValueToProps[K /* <: String */](value: Double, props: js.Array[K]): Record[K, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_readValueToProps")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Record[K, Double]]
  inline def readValueToProps[K /* <: String */](value: Record[K, Double], props: js.Array[K]): Record[K, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_readValueToProps")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Record[K, Double]]
  inline def readValueToProps[K /* <: String */, T /* <: String */](value: Double, props: Record[T, K]): Record[T, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_readValueToProps")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Record[T, Double]]
  inline def readValueToProps[K /* <: String */, T /* <: String */](value: Record[K & T, Double], props: Record[T, K]): Record[T, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_readValueToProps")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Record[T, Double]]
  
  inline def resolve(inputs: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object, index: Double, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object, index: Unit, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: Unit, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: Unit, index: Double, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: Unit, index: Unit, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toFont(options: PartialFontSpec): LineHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("toFont")(options.asInstanceOf[js.Any]).asInstanceOf[LineHeight]
  inline def toFont(options: PartialFontSpec, fallback: PartialFontSpec): LineHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("toFont")(options.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[LineHeight]
  
  inline def toLineHeight(value: String, size: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toLineHeight")(value.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def toLineHeight(value: Double, size: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toLineHeight")(value.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toPadding(): ChartArea = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")().asInstanceOf[ChartArea]
  inline def toPadding(value: Double): ChartArea = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[ChartArea]
  inline def toPadding(value: TRBL): ChartArea = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[ChartArea]
  
  inline def toTRBL(value: Double): Recordlefttopbottomrightn = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[Recordlefttopbottomrightn]
  inline def toTRBL(value: Point): Recordlefttopbottomrightn = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[Recordlefttopbottomrightn]
  inline def toTRBL(value: TRBL): Recordlefttopbottomrightn = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[Recordlefttopbottomrightn]
  
  inline def toTRBLCorners(value: Double): RecordtopLefttopRightbott = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[RecordtopLefttopRightbott]
  inline def toTRBLCorners(value: TRBLCorners): RecordtopLefttopRightbott = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[RecordtopLefttopRightbott]
}
