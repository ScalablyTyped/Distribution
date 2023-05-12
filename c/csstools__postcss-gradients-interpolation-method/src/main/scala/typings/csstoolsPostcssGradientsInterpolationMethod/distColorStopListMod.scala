package typings.csstoolsPostcssGradientsInterpolationMethod

import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.mod.TokenNode
import typings.csstoolsPostcssGradientsInterpolationMethod.csstoolsPostcssGradientsInterpolationMethodBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorStopListMod {
  
  @JSImport("@csstools/postcss-gradients-interpolation-method/dist/color-stop-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolateColorsInColorStopsList(colorStops: js.Array[ColorStop], colorSpace: TokenNode): js.Array[ComponentValue] | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColorsInColorStopsList")(colorStops.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentValue] | `false`]
  inline def interpolateColorsInColorStopsList(
    colorStops: js.Array[ColorStop],
    colorSpace: TokenNode,
    hueInterpolationMethod: Null,
    wideGamut: Boolean
  ): js.Array[ComponentValue] | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColorsInColorStopsList")(colorStops.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any], hueInterpolationMethod.asInstanceOf[js.Any], wideGamut.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentValue] | `false`]
  inline def interpolateColorsInColorStopsList(colorStops: js.Array[ColorStop], colorSpace: TokenNode, hueInterpolationMethod: TokenNode): js.Array[ComponentValue] | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColorsInColorStopsList")(colorStops.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any], hueInterpolationMethod.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentValue] | `false`]
  inline def interpolateColorsInColorStopsList(
    colorStops: js.Array[ColorStop],
    colorSpace: TokenNode,
    hueInterpolationMethod: TokenNode,
    wideGamut: Boolean
  ): js.Array[ComponentValue] | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColorsInColorStopsList")(colorStops.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any], hueInterpolationMethod.asInstanceOf[js.Any], wideGamut.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentValue] | `false`]
  
  trait ColorStop extends StObject {
    
    var color: ComponentValue
    
    var colorData: ColorData
    
    var position: ComponentValue
  }
  object ColorStop {
    
    inline def apply(color: ComponentValue, colorData: ColorData, position: ComponentValue): ColorStop = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorData = colorData.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorStop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorStop] (val x: Self) extends AnyVal {
      
      inline def setColor(value: ComponentValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorData(value: ColorData): Self = StObject.set(x, "colorData", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: ComponentValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
