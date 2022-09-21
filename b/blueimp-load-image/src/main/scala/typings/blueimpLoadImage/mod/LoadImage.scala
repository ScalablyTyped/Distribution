package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import typings.std.Blob
import typings.std.File
import typings.std.FileReader
import typings.std.HTMLImageElement
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
}
