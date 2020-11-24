package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepeatKey extends js.Object {
  
  var repeatKey: js.UndefOr[String] = js.native
  
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.native
}
object RepeatKey {
  
  @scala.inline
  def apply(): RepeatKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatKey]
  }
  
  @scala.inline
  implicit class RepeatKeyOps[Self <: RepeatKey] (val x: Self) extends AnyVal {
    
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
