package typings.csso.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinifyOptions extends js.Object {
  
  /**
    * Called right after compress() is run.
    */
  var afterCompress: js.UndefOr[AfterCompressFn | js.Array[AfterCompressFn]] = js.native
  
  /**
    * Called right after parse is run.
    */
  var beforeCompress: js.UndefOr[BeforeCompressFn | js.Array[BeforeCompressFn]] = js.native
  
  /**
    * Output debug information to stderr.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Filename of input CSS, uses for source map generation.
    * @default '<unknown>'
    */
  var filename: js.UndefOr[String] = js.native
  
  var restructure: js.UndefOr[Boolean] = js.native
  
  /**
    * Generate a source map when true.
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean] = js.native
}
object MinifyOptions {
  
  @scala.inline
  def apply(): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOptions]
  }
  
  @scala.inline
  implicit class MinifyOptionsOps[Self <: MinifyOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterCompressVarargs(value: AfterCompressFn*): Self = this.set("afterCompress", js.Array(value :_*))
    
    @scala.inline
    def setAfterCompressFunction2(value: (/* compressResult */ String, /* options */ CompressOptions) => Unit): Self = this.set("afterCompress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterCompress(value: AfterCompressFn | js.Array[AfterCompressFn]): Self = this.set("afterCompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterCompress: Self = this.set("afterCompress", js.undefined)
    
    @scala.inline
    def setBeforeCompressVarargs(value: BeforeCompressFn*): Self = this.set("beforeCompress", js.Array(value :_*))
    
    @scala.inline
    def setBeforeCompressFunction2(value: (/* ast */ js.Object, /* options */ CompressOptions) => Unit): Self = this.set("beforeCompress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeCompress(value: BeforeCompressFn | js.Array[BeforeCompressFn]): Self = this.set("beforeCompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeCompress: Self = this.set("beforeCompress", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setRestructure(value: Boolean): Self = this.set("restructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestructure: Self = this.set("restructure", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
  }
}
