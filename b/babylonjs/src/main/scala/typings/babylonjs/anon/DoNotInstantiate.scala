package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoNotInstantiate extends js.Object {
  
  var doNotInstantiate: Boolean = js.native
}
object DoNotInstantiate {
  
  @scala.inline
  def apply(doNotInstantiate: Boolean): DoNotInstantiate = {
    val __obj = js.Dynamic.literal(doNotInstantiate = doNotInstantiate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotInstantiate]
  }
  
  @scala.inline
  implicit class DoNotInstantiateOps[Self <: DoNotInstantiate] (val x: Self) extends AnyVal {
    
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
    def setDoNotInstantiate(value: Boolean): Self = this.set("doNotInstantiate", value.asInstanceOf[js.Any])
  }
}
