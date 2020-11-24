package typings.blissfuljs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropertyName
  extends /* propertyName */ StringDictionary[js.Any] {
  
  var `abstract`: js.UndefOr[Boolean] = js.native
  
  var constructor: js.UndefOr[js.Function] = js.native
  
  var `extends`: js.UndefOr[js.Function] = js.native
  
  var `lazy`: js.UndefOr[js.Object] = js.native
  
  var live: js.UndefOr[js.Object] = js.native
  
  var static: js.UndefOr[js.Object] = js.native
}
object DictpropertyName {
  
  @scala.inline
  def apply(): DictpropertyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropertyName]
  }
  
  @scala.inline
  implicit class DictpropertyNameOps[Self <: DictpropertyName] (val x: Self) extends AnyVal {
    
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
    def setAbstract(value: Boolean): Self = this.set("abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbstract: Self = this.set("abstract", js.undefined)
    
    @scala.inline
    def setConstructor(value: js.Function): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    
    @scala.inline
    def setExtends(value: js.Function): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    
    @scala.inline
    def setLazy(value: js.Object): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setLive(value: js.Object): Self = this.set("live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLive: Self = this.set("live", js.undefined)
    
    @scala.inline
    def setStatic(value: js.Object): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
}
