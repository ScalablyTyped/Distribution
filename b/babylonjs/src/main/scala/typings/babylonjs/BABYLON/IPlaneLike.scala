package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaneLike extends js.Object {
  
  var d: float = js.native
  
  var normal: IVector3Like = js.native
  
  def normalize(): Unit = js.native
}
object IPlaneLike {
  
  @scala.inline
  def apply(d: float, normal: IVector3Like, normalize: () => Unit): IPlaneLike = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize))
    __obj.asInstanceOf[IPlaneLike]
  }
  
  @scala.inline
  implicit class IPlaneLikeOps[Self <: IPlaneLike] (val x: Self) extends AnyVal {
    
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
    def setD(value: float): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: IVector3Like): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalize(value: () => Unit): Self = this.set("normalize", js.Any.fromFunction0(value))
  }
}
