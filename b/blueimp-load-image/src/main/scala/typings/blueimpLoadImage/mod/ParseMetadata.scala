package typings.blueimpLoadImage.mod

import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseMetadata extends StObject {
  
  def apply(file: String): js.Promise[MetaData] = js.native
  def apply(file: String, callback: ParseMetaDataCallback): Unit = js.native
  def apply(file: String, callback: ParseMetaDataCallback, options: Unit, data: ImageHead): Unit = js.native
  def apply(file: String, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def apply(file: String, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  def apply(file: String, options: Unit, data: ImageHead): js.Promise[MetaData] = js.native
  def apply(file: String, options: ParseOptions): js.Promise[MetaData] = js.native
  def apply(file: String, options: ParseOptions, data: ImageHead): js.Promise[MetaData] = js.native
  def apply(file: Blob): js.Promise[MetaData] = js.native
  def apply(file: Blob, callback: ParseMetaDataCallback): Unit = js.native
  def apply(file: Blob, callback: ParseMetaDataCallback, options: Unit, data: ImageHead): Unit = js.native
  def apply(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def apply(file: Blob, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  def apply(file: Blob, options: Unit, data: ImageHead): js.Promise[MetaData] = js.native
  def apply(file: Blob, options: ParseOptions): js.Promise[MetaData] = js.native
  def apply(file: Blob, options: ParseOptions, data: ImageHead): js.Promise[MetaData] = js.native
  def apply(file: File): js.Promise[MetaData] = js.native
  def apply(file: File, callback: ParseMetaDataCallback): Unit = js.native
  def apply(file: File, callback: ParseMetaDataCallback, options: Unit, data: ImageHead): Unit = js.native
  def apply(file: File, callback: ParseMetaDataCallback, options: ParseOptions): Unit = js.native
  def apply(file: File, callback: ParseMetaDataCallback, options: ParseOptions, data: ImageHead): Unit = js.native
  def apply(file: File, options: Unit, data: ImageHead): js.Promise[MetaData] = js.native
  def apply(file: File, options: ParseOptions): js.Promise[MetaData] = js.native
  def apply(file: File, options: ParseOptions, data: ImageHead): js.Promise[MetaData] = js.native
}
