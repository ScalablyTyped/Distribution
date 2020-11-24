package typings.cbor.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecoderOptions extends TransformOptions {
  
  var bigint: js.UndefOr[Boolean] = js.native
  
  var max_depth: js.UndefOr[Double] = js.native
  
  var tags: js.UndefOr[NumberDictionary[js.Function1[/* v */ js.Any, _]]] = js.native
}
object DecoderOptions {
  
  @scala.inline
  def apply(): DecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecoderOptions]
  }
  
  @scala.inline
  implicit class DecoderOptionsOps[Self <: DecoderOptions] (val x: Self) extends AnyVal {
    
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
    def setBigint(value: Boolean): Self = this.set("bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigint: Self = this.set("bigint", js.undefined)
    
    @scala.inline
    def setMax_depth(value: Double): Self = this.set("max_depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_depth: Self = this.set("max_depth", js.undefined)
    
    @scala.inline
    def setTags(value: NumberDictionary[js.Function1[/* v */ js.Any, _]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
