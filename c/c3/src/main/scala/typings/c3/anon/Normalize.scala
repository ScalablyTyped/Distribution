package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Normalize extends js.Object {
  
  /**
    * Set the stacking to be normalized. Default is false.
    *
    * **Note**: For stacking, the `data.groups` option should be set and have positive values. The yAxis will be set in percentage value (0 ~ 100%).
    */
  var normalize: js.UndefOr[Boolean] = js.native
}
object Normalize {
  
  @scala.inline
  def apply(): Normalize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Normalize]
  }
  
  @scala.inline
  implicit class NormalizeOps[Self <: Normalize] (val x: Self) extends AnyVal {
    
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
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
  }
}
