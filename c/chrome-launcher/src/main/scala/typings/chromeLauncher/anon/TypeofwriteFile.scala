package typings.chromeLauncher.anon

import typings.node.NodeJS.ArrayBufferView
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofwriteFile extends js.Object {
  
  def apply(path: Double, data: String, callback: NoParamCallback): Unit = js.native
  def apply(path: Double, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(path: Double, data: ArrayBufferView, callback: NoParamCallback): Unit = js.native
  def apply(path: Double, data: ArrayBufferView, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, data: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, data: ArrayBufferView, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, data: ArrayBufferView, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
}
