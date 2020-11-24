package typings.bbcodeToReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Linkify extends js.Object {
  
  var linkify: Boolean = js.native
}
object Linkify {
  
  @scala.inline
  def apply(linkify: Boolean): Linkify = {
    val __obj = js.Dynamic.literal(linkify = linkify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linkify]
  }
  
  @scala.inline
  implicit class LinkifyOps[Self <: Linkify] (val x: Self) extends AnyVal {
    
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
    def setLinkify(value: Boolean): Self = this.set("linkify", value.asInstanceOf[js.Any])
  }
}
