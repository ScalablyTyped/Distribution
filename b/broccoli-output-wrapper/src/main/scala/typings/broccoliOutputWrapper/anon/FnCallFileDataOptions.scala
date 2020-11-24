package typings.broccoliOutputWrapper.anon

import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallFileDataOptions extends js.Object {
  
  def apply(file: Double, data: String): Unit = js.native
  def apply(file: Double, data: String, options: WriteFileOptions): Unit = js.native
  def apply(file: Double, data: Uint8Array): Unit = js.native
  def apply(file: Double, data: Uint8Array, options: WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: String): Unit = js.native
  def apply(file: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  def apply(file: PathLike, data: Uint8Array): Unit = js.native
  def apply(file: PathLike, data: Uint8Array, options: WriteFileOptions): Unit = js.native
}
