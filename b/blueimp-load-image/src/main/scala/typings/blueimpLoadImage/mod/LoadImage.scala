package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import typings.std.Blob
import typings.std.File
import typings.std.FileReader
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// loadImage is implemented as a callable object.
@js.native
trait LoadImage extends StObject {
  
  def apply(file: String, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def apply(file: String, options: LoadImageOptions): js.Promise[LoadImageResult] = js.native
  def apply(file: Blob, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def apply(file: Blob, options: LoadImageOptions): js.Promise[LoadImageResult] = js.native
  def apply(file: File, callback: LoadImageCallback, options: LoadImageOptions): HTMLImageElement | FileReader | `false` = js.native
  def apply(file: File, options: LoadImageOptions): js.Promise[LoadImageResult] = js.native
  
  // Parses image meta data and calls the callback/returns the promise with the image head
  def blobSlice(): Blob = js.native
  def blobSlice(start: Double): Blob = js.native
  def blobSlice(start: Double, end: Double): Blob = js.native
  def blobSlice(start: Unit, end: Double): Blob = js.native
  
  def createObjectURL(blob: Blob): String | `false` = js.native
  
  def fetchBlob(url: String, callback: js.Function0[Unit]): Unit = js.native
  
  var global: Window = js.native
  
  var isInstanceOf: Any = js.native
  
  def parseMetaData(file: String): js.Promise[MetaData] = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback): Unit = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback, options: Unit, data: ImageHead): Unit = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def parseMetaData(file: String, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  def parseMetaData(file: String, options: Unit, data: ImageHead): js.Promise[MetaData] = js.native
  def parseMetaData(file: String, options: ParseOptions): js.Promise[MetaData] = js.native
  def parseMetaData(file: String, options: ParseOptions, data: ImageHead): js.Promise[MetaData] = js.native
  def parseMetaData(file: Blob): js.Promise[MetaData] = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: Unit, data: ImageHead): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def parseMetaData(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  def parseMetaData(file: Blob, options: Unit, data: ImageHead): js.Promise[MetaData] = js.native
  def parseMetaData(file: Blob, options: ParseOptions): js.Promise[MetaData] = js.native
  def parseMetaData(file: Blob, options: ParseOptions, data: ImageHead): js.Promise[MetaData] = js.native
  def parseMetaData(file: File): js.Promise[MetaData] = js.native
  def parseMetaData(file: File, callback: ParseMetaDataCallback): Unit = js.native
  def parseMetaData(file: File, callback: ParseMetaDataCallback, options: Unit, data: ImageHead): Unit = js.native
  def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def parseMetaData(file: File, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  def parseMetaData(file: File, options: Unit, data: ImageHead): js.Promise[MetaData] = js.native
  def parseMetaData(file: File, options: ParseOptions): js.Promise[MetaData] = js.native
  def parseMetaData(file: File, options: ParseOptions, data: ImageHead): js.Promise[MetaData] = js.native
  @JSName("parseMetaData")
  var parseMetaData_Original: ParseMetadata = js.native
  
  var readFile: Any = js.native
  
  // Replaces the image head of a JPEG blob with the given one
  def replaceHead(blob: Blob, head: js.typedarray.ArrayBuffer): js.Promise[Blob | Null] = js.native
  // Replaces the image head of a JPEG blob with the given one
  def replaceHead(blob: Blob, head: js.typedarray.ArrayBuffer, callback: js.Function1[/* blob */ Blob | Null, Unit]): Unit = js.native
  def replaceHead(blob: Blob, head: js.typedarray.Uint8Array): js.Promise[Blob | Null] = js.native
  def replaceHead(blob: Blob, head: js.typedarray.Uint8Array, callback: js.Function1[/* blob */ Blob | Null, Unit]): Unit = js.native
  // Replaces the image head of a JPEG blob with the given one
  @JSName("replaceHead")
  var replaceHead_Original: ReplaceHead = js.native
  
  // Internal functions, undocumented
  def requiresMetaData(options: LoadImageOptions): Boolean = js.native
  
  def revokeObjectURL(url: String): Unit | `false` = js.native
  
  def scale[O /* <: LoadImageOptions */](image: HTMLCanvasElement): /* import warning: importer.ImportType#apply Failed type conversion: O extends blueimp-load-image.blueimp-load-image.CanvasTrueOptions ? std.HTMLCanvasElement : std.HTMLImageElement */ js.Any = js.native
  def scale[O /* <: LoadImageOptions */](image: HTMLCanvasElement, options: O): /* import warning: importer.ImportType#apply Failed type conversion: O extends blueimp-load-image.blueimp-load-image.CanvasTrueOptions ? std.HTMLCanvasElement : std.HTMLImageElement */ js.Any = js.native
  def scale[O /* <: LoadImageOptions */](image: HTMLImageElement): /* import warning: importer.ImportType#apply Failed type conversion: O extends blueimp-load-image.blueimp-load-image.CanvasTrueOptions ? std.HTMLCanvasElement : std.HTMLImageElement */ js.Any = js.native
  def scale[O /* <: LoadImageOptions */](image: HTMLImageElement, options: O): /* import warning: importer.ImportType#apply Failed type conversion: O extends blueimp-load-image.blueimp-load-image.CanvasTrueOptions ? std.HTMLCanvasElement : std.HTMLImageElement */ js.Any = js.native
  @JSName("scale")
  var scale_Original: Scale = js.native
  
  def transform(img: Any, options: Any, callback: js.Function0[Unit], file: Any, data: Any): Unit = js.native
  
  def writeExifData(buffer: js.typedarray.ArrayBuffer, data: WriteExifData, id: String, value: ExifTagValue): js.typedarray.ArrayBuffer | js.typedarray.Uint8Array = js.native
  def writeExifData(buffer: js.typedarray.ArrayBuffer, data: WriteExifData, id: Double, value: ExifTagValue): js.typedarray.ArrayBuffer | js.typedarray.Uint8Array = js.native
  def writeExifData(buffer: js.typedarray.Uint8Array, data: WriteExifData, id: String, value: ExifTagValue): js.typedarray.ArrayBuffer | js.typedarray.Uint8Array = js.native
  def writeExifData(buffer: js.typedarray.Uint8Array, data: WriteExifData, id: Double, value: ExifTagValue): js.typedarray.ArrayBuffer | js.typedarray.Uint8Array = js.native
}
