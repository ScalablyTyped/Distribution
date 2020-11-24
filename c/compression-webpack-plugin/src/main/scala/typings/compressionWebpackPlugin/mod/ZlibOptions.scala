package typings.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZlibOptions
  extends BaseOptions
     with Options[js.Any] {
  
  /**
    * The compression algorithm/function
    * @default 'gzip'
    */
  var algorithm: js.UndefOr[ZlibAlgorithm] = js.native
  
  /**
    * Compression options for algorithm
    * @default { level: 9 }
    */
  var compressionOptions: js.UndefOr[typings.node.zlibMod.ZlibOptions] = js.native
}
object ZlibOptions {
  
  @scala.inline
  def apply(): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZlibOptions]
  }
  
  @scala.inline
  implicit class ZlibOptionsOps[Self <: ZlibOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: ZlibAlgorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setCompressionOptions(value: typings.node.zlibMod.ZlibOptions): Self = this.set("compressionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionOptions: Self = this.set("compressionOptions", js.undefined)
  }
}
