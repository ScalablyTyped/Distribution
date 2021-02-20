package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaneLike extends StObject {
  
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
  implicit class IPlaneLikeMutableBuilder[Self <: IPlaneLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: float): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: IVector3Like): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
  }
}
