package typings.bson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculateObjectSizeOptions extends js.Object {
  
  /** {default:true}, ignore undefined fields. */
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  
  /** {default:false}, serialize the javascript functions */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
}
object CalculateObjectSizeOptions {
  
  @scala.inline
  def apply(): CalculateObjectSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculateObjectSizeOptions]
  }
  
  @scala.inline
  implicit class CalculateObjectSizeOptionsOps[Self <: CalculateObjectSizeOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreUndefined(value: Boolean): Self = this.set("ignoreUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUndefined: Self = this.set("ignoreUndefined", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = this.set("serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializeFunctions: Self = this.set("serializeFunctions", js.undefined)
  }
}
