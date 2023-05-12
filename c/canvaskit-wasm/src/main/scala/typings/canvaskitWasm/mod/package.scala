package typings.canvaskitWasm.mod

import typings.canvaskitWasm.mod.^
import typings.std.CanvasRenderingContext2D
import typings.std.DOMMatrix
import typings.std.Float32ArrayConstructor
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Path2D
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default(): js.Promise[CanvasKit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[CanvasKit]]
inline def default(opts: CanvasKitInitOptions): js.Promise[CanvasKit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CanvasKit]]

type Affinity = EmbindEnumEntity

type AlphaType = EmbindEnumEntity

type AngleInDegrees = Double

type AngleInRadians = Double

type BlendMode = EmbindEnumEntity

type BlurStyle = EmbindEnumEntity

type ClipOp = EmbindEnumEntity

type Color = js.typedarray.Float32Array

type ColorChannel = EmbindEnumEntity

type ColorInt = Double

type ColorIntArray = MallocObj | js.typedarray.Uint32Array | js.Array[Double]

type ColorMatrix = js.typedarray.Float32Array

type ColorType = EmbindEnumEntity

type DecorationStyle = EmbindEnumEntity

type EmulatedCanvas2DContext = CanvasRenderingContext2D

type EmulatedImageData = ImageData

type EmulatedPath2D = Path2D

type EncodedImageFormat = EmbindEnumEntity

type FillType = EmbindEnumEntity

type FilterMode = EmbindEnumEntity

type FlattenedPointArray = js.typedarray.Float32Array

type FlattenedRectangleArray = js.typedarray.Float32Array

type FontEdging = EmbindEnumEntity

type FontHinting = EmbindEnumEntity

type FontSlant = EmbindEnumEntity

type FontWeight = EmbindEnumEntity

type FontWidth = EmbindEnumEntity

type GlyphIDArray = js.typedarray.Uint16Array

type IRect = js.typedarray.Int32Array

type InputBidiRegions = MallocObj | js.typedarray.Uint32Array | js.Array[Double]

type InputColor = MallocObj | js.typedarray.Float32Array | js.Array[Double]

type InputColorMatrix = MallocObj | js.typedarray.Float32Array | js.Array[Double]

type InputCommands = MallocObj | js.typedarray.Float32Array | js.Array[Double]

type InputFlattenedPointArray = MallocObj | js.typedarray.Float32Array | js.Array[Double]

type InputFlattenedRSXFormArray = MallocObj | js.typedarray.Float32Array | js.Array[Double]

type InputFlattenedRectangleArray = MallocObj | js.typedarray.Float32Array | js.Array[Double]

type InputFlexibleColorArray = js.typedarray.Float32Array | js.typedarray.Uint32Array | js.Array[js.typedarray.Float32Array]

type InputGlyphIDArray = MallocObj | js.typedarray.Uint16Array | js.Array[Double]

type InputGraphemes = MallocObj | js.typedarray.Uint32Array | js.Array[Double]

type InputIRect = MallocObj | js.typedarray.Int32Array | js.Array[Double]

type InputLineBreaks = MallocObj | js.typedarray.Uint32Array | js.Array[Double]

type InputMatrix = MallocObj | js.typedarray.Float32Array | DOMMatrix | js.Array[Double]

type InputPoint = js.typedarray.Float32Array | js.Array[Double]

type InputRRect = MallocObj | js.typedarray.Float32Array | js.Array[Double]

type InputRect = MallocObj | js.typedarray.Float32Array | js.Array[Double]

type InputVector2 = InputPoint

type InputVector3 = MallocObj | Vector3 | js.typedarray.Float32Array

type InputWords = MallocObj | js.typedarray.Uint32Array | js.Array[Double]

type LineBreakType = EmbindEnumEntity

type Matrix3x2 = js.typedarray.Float32Array

type Matrix3x3 = js.typedarray.Float32Array

type Matrix4x4 = js.typedarray.Float32Array

type MipmapMode = EmbindEnumEntity

type PaintStyle = EmbindEnumEntity

type Path1DEffectStyle = EmbindEnumEntity

type PathOp = EmbindEnumEntity

type PlaceholderAlignment = EmbindEnumEntity

type Point = js.typedarray.Float32Array

type PointMode = EmbindEnumEntity

type PosTan = js.typedarray.Float32Array

type RRect = js.typedarray.Float32Array

type Rect = js.typedarray.Float32Array

type RectHeightStyle = EmbindEnumEntity

type RectWidthStyle = EmbindEnumEntity

type SaveLayerFlag = Double

type StrokeCap = EmbindEnumEntity

type StrokeJoin = EmbindEnumEntity

type TextAlign = EmbindEnumEntity

type TextBaseline = EmbindEnumEntity

type TextDirection = EmbindEnumEntity

type TextHeightBehavior = EmbindEnumEntity

type TextureSource = TypedArray | HTMLImageElement | HTMLVideoElement | ImageData | ImageBitmap

type TileMode = EmbindEnumEntity

type TypedArray = js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Int16Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Uint16Array | js.typedarray.Uint8Array

type TypedArrayConstructor = Float32ArrayConstructor | Int32ArrayConstructor | Int16ArrayConstructor | Int8ArrayConstructor | Uint32ArrayConstructor | Uint16ArrayConstructor | Uint8ArrayConstructor

type Vector2 = js.typedarray.Float32Array

type Vector3 = js.Array[Double]

type VectorN = js.Array[Double]

type VerbList = MallocObj | js.typedarray.Uint8Array | js.Array[Double]

type VertexMode = EmbindEnumEntity

type WebGLContextHandle = Double

type WebGPUDeviceContext = GrDirectContext

type WeightList = MallocObj | js.typedarray.Float32Array | js.Array[Double]
