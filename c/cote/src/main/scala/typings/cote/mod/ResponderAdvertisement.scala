package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponderAdvertisement extends Advertisement {
  
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[String] = js.native
}
object ResponderAdvertisement {
  
  @scala.inline
  def apply(name: String): ResponderAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponderAdvertisement]
  }
  
  @scala.inline
  implicit class ResponderAdvertisementOps[Self <: ResponderAdvertisement] (val x: Self) extends AnyVal {
    
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
    def setRespondsToVarargs(value: String*): Self = this.set("respondsTo", js.Array(value :_*))
    
    @scala.inline
    def setRespondsTo(value: js.Array[String]): Self = this.set("respondsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespondsTo: Self = this.set("respondsTo", js.undefined)
    
    @scala.inline
    def setSubset(value: String): Self = this.set("subset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubset: Self = this.set("subset", js.undefined)
  }
}
