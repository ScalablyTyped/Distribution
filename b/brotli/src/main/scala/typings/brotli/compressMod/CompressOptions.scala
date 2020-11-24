package typings.brotli.compressMod

import typings.brotli.brotliNumbers.`0`
import typings.brotli.brotliNumbers.`10`
import typings.brotli.brotliNumbers.`11`
import typings.brotli.brotliNumbers.`1`
import typings.brotli.brotliNumbers.`2`
import typings.brotli.brotliNumbers.`3`
import typings.brotli.brotliNumbers.`4`
import typings.brotli.brotliNumbers.`5`
import typings.brotli.brotliNumbers.`6`
import typings.brotli.brotliNumbers.`7`
import typings.brotli.brotliNumbers.`8`
import typings.brotli.brotliNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressOptions extends js.Object {
  
  /**
    * The LZ77 window size, default is 22.
    */
  var lgwin: js.UndefOr[Double] = js.native
  
  /**
    * The Brotli compression mode. Possible modes are:
    * 0 - generic (default)
    * 1 - text (for UTF-8 format text input)
    * 2 - font (WOFF2)
    */
  var mode: js.UndefOr[`0` | `1` | `2`] = js.native
  
  /**
    * The Brotli quality level, possible levels are 0-11. The default level is 11.
    */
  var quality: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`] = js.native
}
object CompressOptions {
  
  @scala.inline
  def apply(): CompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressOptions]
  }
  
  @scala.inline
  implicit class CompressOptionsOps[Self <: CompressOptions] (val x: Self) extends AnyVal {
    
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
    def setLgwin(value: Double): Self = this.set("lgwin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLgwin: Self = this.set("lgwin", js.undefined)
    
    @scala.inline
    def setMode(value: `0` | `1` | `2`): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setQuality(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
}
