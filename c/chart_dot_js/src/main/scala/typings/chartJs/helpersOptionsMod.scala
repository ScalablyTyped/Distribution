package typings.chartJs

import typings.chartJs.anon.Bottom
import typings.chartJs.anon.Cacheable
import typings.chartJs.anon.Left
import typings.chartJs.anon.PartialFontSpec
import typings.chartJs.anon.PartialTRBL
import typings.chartJs.anon.PartialTRBLCorners
import typings.chartJs.chartJsStrings.inherit
import typings.chartJs.chartJsStrings.initial
import typings.chartJs.chartJsStrings.italic
import typings.chartJs.chartJsStrings.normal
import typings.chartJs.chartJsStrings.oblique
import typings.chartJs.geometricMod.TRBL
import typings.chartJs.geometricMod.TRBLCorners
import typings.chartJs.mod.FontSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersOptionsMod {
  
  @JSImport("chart.js/types/helpers/helpers.options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContext[P, T](parentContext: P, context: T): (P & T) | T = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(parentContext.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[(P & T) | T]
  
  inline def resolve[T, C](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: C): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: C, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: C, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: C, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: Unit, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: Unit, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: T, context: Unit, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: C): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: C, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: C, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: C, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: Unit, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: Unit, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Array[T], context: Unit, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: C): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: C, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: C, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: C, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: Unit, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: Unit, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: js.Function1[/* c */ C, T], context: Unit, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: C): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: C, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: C, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: C, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: Unit, index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: Unit, index: Double, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def resolve[T, C](inputs: Unit, context: Unit, index: Unit, info: Cacheable): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def toFont(options: PartialFontSpec): CanvasFontSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("toFont")(options.asInstanceOf[js.Any]).asInstanceOf[CanvasFontSpec]
  
  inline def toLineHeight(value: String, size: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toLineHeight")(value.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toPadding(): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")().asInstanceOf[Left]
  inline def toPadding(value: Double): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[Left]
  inline def toPadding(value: Bottom): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[Left]
  
  inline def toTRBL(value: Double): TRBL = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[TRBL]
  inline def toTRBL(value: PartialTRBL): TRBL = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[TRBL]
  
  inline def toTRBLCorners(value: Double): TRBLCorners = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[TRBLCorners]
  inline def toTRBLCorners(value: PartialTRBLCorners): TRBLCorners = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[TRBLCorners]
  
  trait CanvasFontSpec
    extends StObject
       with FontSpec {
    
    var string: String
  }
  object CanvasFontSpec {
    
    inline def apply(
      family: String,
      lineHeight: Double | String,
      size: Double,
      string: String,
      style: normal | italic | oblique | initial | inherit
    ): CanvasFontSpec = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], weight = null)
      __obj.asInstanceOf[CanvasFontSpec]
    }
    
    extension [Self <: CanvasFontSpec](x: Self) {
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
