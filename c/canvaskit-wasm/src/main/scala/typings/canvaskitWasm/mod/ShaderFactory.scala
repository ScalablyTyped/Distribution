package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderFactory extends StObject {
  
  /**
    * Returns a shader that combines the given shaders with a BlendMode.
    * @param mode
    * @param one
    * @param two
    */
  def MakeBlend(mode: BlendMode, one: Shader, two: Shader): Shader = js.native
  
  /**
    * Returns a shader with a given color and colorspace.
    * @param color
    * @param space
    */
  def MakeColor(color: InputColor, space: ColorSpace): Shader = js.native
  
  /**
    * Returns a shader with Perlin Fractal Noise.
    * See SkPerlinNoiseShader.h for more details
    * @param baseFreqX - base frequency in the X direction; range [0.0, 1.0]
    * @param baseFreqY - base frequency in the Y direction; range [0.0, 1.0]
    * @param octaves
    * @param seed
    * @param tileW - if this and tileH are non-zero, the frequencies will be modified so that the
    *                noise will be tileable for the given size.
    * @param tileH - if this and tileW are non-zero, the frequencies will be modified so that the
    *                noise will be tileable for the given size.
    */
  def MakeFractalNoise(baseFreqX: Double, baseFreqY: Double, octaves: Double, seed: Double, tileW: Double, tileH: Double): Shader = js.native
  
  /**
    * Returns a shader that generates a linear gradient between the two specified points.
    * See SkGradientShader.h for more.
    * @param start
    * @param end
    * @param colors - colors to be distributed between start and end.
    * @param pos - May be null. The relative positions of colors. If supplied must be same length
    *              as colors.
    * @param mode
    * @param localMatrix
    * @param flags - By default gradients will interpolate their colors in unpremul space
    *                and then premultiply each of the results. By setting this to 1, the
    *                gradients will premultiply their colors first, and then interpolate
    *                between them.
    * @param colorSpace
    */
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: Unit,
    flags: Double
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: Unit,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: Unit,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeLinearGradient(start: InputPoint, end: InputPoint, colors: InputFlexibleColorArray, pos: Null, mode: TileMode): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: Unit,
    flags: Double
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: Unit,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: Unit,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeLinearGradient(
    start: InputPoint,
    end: InputPoint,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  
  /**
    * Returns a shader that generates a radial gradient given the center and radius.
    * See SkGradientShader.h for more.
    * @param center
    * @param radius
    * @param colors - colors to be distributed between the center and edge.
    * @param pos - May be null. The relative positions of colors. If supplied must be same length
    *              as colors. Range [0.0, 1.0]
    * @param mode
    * @param localMatrix
    * @param flags - 0 to interpolate colors in unpremul, 1 to interpolate colors in premul.
    * @param colorSpace
    */
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: Unit,
    flags: Double
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: Unit,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: Unit,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeRadialGradient(center: InputPoint, radius: Double, colors: InputFlexibleColorArray, pos: Null, mode: TileMode): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: Unit,
    flags: Double
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: Unit,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: Unit,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeRadialGradient(
    center: InputPoint,
    radius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  
  /**
    * Returns a shader that generates a sweep gradient given a center.
    * See SkGradientShader.h for more.
    * @param cx
    * @param cy
    * @param colors - colors to be distributed around the center, within the provided angles.
    * @param pos - May be null. The relative positions of colors. If supplied must be same length
    *              as colors. Range [0.0, 1.0]
    * @param mode
    * @param localMatrix
    * @param flags - 0 to interpolate colors in unpremul, 1 to interpolate colors in premul.
    * @param startAngle - angle corresponding to 0.0. Defaults to 0 degrees.
    * @param endAngle - angle corresponding to 1.0. Defaults to 360 degrees.
    * @param colorSpace
    */
  def MakeSweepGradient(
    cx: Double,
    cy: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double] | Null,
    mode: TileMode,
    localMatrix: js.UndefOr[InputMatrix | Null],
    flags: js.UndefOr[Double],
    startAngle: js.UndefOr[AngleInDegrees],
    endAngle: js.UndefOr[AngleInDegrees],
    colorSpace: js.UndefOr[ColorSpace]
  ): Shader = js.native
  
  /**
    * Returns a shader with Perlin Turbulence.
    * See SkPerlinNoiseShader.h for more details
    * @param baseFreqX - base frequency in the X direction; range [0.0, 1.0]
    * @param baseFreqY - base frequency in the Y direction; range [0.0, 1.0]
    * @param octaves
    * @param seed
    * @param tileW - if this and tileH are non-zero, the frequencies will be modified so that the
    *                noise will be tileable for the given size.
    * @param tileH - if this and tileW are non-zero, the frequencies will be modified so that the
    *                noise will be tileable for the given size.
    */
  def MakeTurbulence(baseFreqX: Double, baseFreqY: Double, octaves: Double, seed: Double, tileW: Double, tileH: Double): Shader = js.native
  
  /**
    * Returns a shader that generates a conical gradient given two circles.
    * See SkGradientShader.h for more.
    * @param start
    * @param startRadius
    * @param end
    * @param endRadius
    * @param colors
    * @param pos
    * @param mode
    * @param localMatrix
    * @param flags
    * @param colorSpace
    */
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: Unit,
    flags: Double
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: Unit,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: Unit,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: js.Array[Double],
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: Unit,
    flags: Double
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: Unit,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: Unit,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Double,
    colorSpace: ColorSpace
  ): Shader = js.native
  def MakeTwoPointConicalGradient(
    start: InputPoint,
    startRadius: Double,
    end: InputPoint,
    endRadius: Double,
    colors: InputFlexibleColorArray,
    pos: Null,
    mode: TileMode,
    localMatrix: InputMatrix,
    flags: Unit,
    colorSpace: ColorSpace
  ): Shader = js.native
}
