package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofextensionTypes extends js.Object {
  
  /**
    * Internal interfaces, not to be used directly
    * @private
    * @internal
    */
  val _internal_ : js.Any = js.native
}
object TypeofextensionTypes {
  
  @scala.inline
  def apply(_internal_ : js.Any): TypeofextensionTypes = {
    val __obj = js.Dynamic.literal(_internal_ = _internal_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofextensionTypes]
  }
  
  @scala.inline
  implicit class TypeofextensionTypesOps[Self <: TypeofextensionTypes] (val x: Self) extends AnyVal {
    
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
    def set_internal_(value: js.Any): Self = this.set("_internal_", value.asInstanceOf[js.Any])
  }
}
