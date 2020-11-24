package typings.compressJs.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compress extends js.Object {
  
  def attach(el: String, options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
  
  def compress(files: js.Array[File], options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
}
object Compress {
  
  @scala.inline
  def apply(
    attach: (String, CompressOptions) => js.Promise[js.Array[CompressResult]],
    compress: (js.Array[File], CompressOptions) => js.Promise[js.Array[CompressResult]]
  ): Compress = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction2(attach), compress = js.Any.fromFunction2(compress))
    __obj.asInstanceOf[Compress]
  }
  
  @scala.inline
  implicit class CompressOps[Self <: Compress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttach(value: (String, CompressOptions) => js.Promise[js.Array[CompressResult]]): Self = this.set("attach", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompress(value: (js.Array[File], CompressOptions) => js.Promise[js.Array[CompressResult]]): Self = this.set("compress", js.Any.fromFunction2(value))
  }
}
