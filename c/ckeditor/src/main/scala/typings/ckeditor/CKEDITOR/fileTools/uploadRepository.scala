package typings.ckeditor.CKEDITOR.fileTools

import typings.ckeditor.CKEDITOR.event
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uploadRepository extends event {
  val loaders: js.Array[fileLoader] = js.native
  def create(fileOrData: String, fileName: String): fileLoader = js.native
  def create(fileOrData: String, fileName: String, loaderType: js.Any): fileLoader = js.native
  def create(fileOrData: Blob, fileName: String): fileLoader = js.native
  def create(fileOrData: Blob, fileName: String, loaderType: js.Any): fileLoader = js.native
  def isFinished(): Boolean = js.native
}

