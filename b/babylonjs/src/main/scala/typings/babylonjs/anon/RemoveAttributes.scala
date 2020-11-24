package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAttributes extends js.Object {
  
  var removeAttributes: js.UndefOr[Boolean] = js.native
  
  var removeIfDef: js.UndefOr[Boolean] = js.native
  
  var removeUniforms: js.UndefOr[Boolean] = js.native
  
  var removeVaryings: js.UndefOr[Boolean] = js.native
  
  var repeatKey: js.UndefOr[String] = js.native
  
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.native
}
object RemoveAttributes {
  
  @scala.inline
  def apply(): RemoveAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveAttributes]
  }
  
  @scala.inline
  implicit class RemoveAttributesOps[Self <: RemoveAttributes] (val x: Self) extends AnyVal {
    
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
    def setRemoveAttributes(value: Boolean): Self = this.set("removeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAttributes: Self = this.set("removeAttributes", js.undefined)
    
    @scala.inline
    def setRemoveIfDef(value: Boolean): Self = this.set("removeIfDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIfDef: Self = this.set("removeIfDef", js.undefined)
    
    @scala.inline
    def setRemoveUniforms(value: Boolean): Self = this.set("removeUniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveUniforms: Self = this.set("removeUniforms", js.undefined)
    
    @scala.inline
    def setRemoveVaryings(value: Boolean): Self = this.set("removeVaryings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveVaryings: Self = this.set("removeVaryings", js.undefined)
    
    @scala.inline
    def setRepeatKey(value: String): Self = this.set("repeatKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatKey: Self = this.set("repeatKey", js.undefined)
    
    @scala.inline
    def setReplaceStringsVarargs(value: Replace*): Self = this.set("replaceStrings", js.Array(value :_*))
    
    @scala.inline
    def setReplaceStrings(value: js.Array[Replace]): Self = this.set("replaceStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceStrings: Self = this.set("replaceStrings", js.undefined)
  }
}
