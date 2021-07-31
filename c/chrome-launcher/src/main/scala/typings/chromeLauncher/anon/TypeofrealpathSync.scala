package typings.chromeLauncher.anon

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.BaseEncodingOptions
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofrealpathSync extends StObject {
  
  def apply(path: PathLike): String = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  def apply(path: PathLike, options: BufferEncoding): String = js.native
  def apply(path: PathLike, options: BaseEncodingOptions): String = js.native
  def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  
  def native(path: PathLike): String = js.native
  def native(path: PathLike, options: String): String | Buffer = js.native
  def native(path: PathLike, options: BufferEncoding): String = js.native
  def native(path: PathLike, options: BaseEncodingOptions): String = js.native
  def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  @JSName("native")
  def native_Union(path: PathLike): String | Buffer = js.native
  @JSName("native")
  def native_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
}
