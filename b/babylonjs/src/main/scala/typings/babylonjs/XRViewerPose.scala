package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRViewerPose extends XRPose {
  
  val views: js.Array[XRView] = js.native
}
object XRViewerPose {
  
  @scala.inline
  def apply(emulatedPosition: Boolean, transform: XRRigidTransform, views: js.Array[XRView]): XRViewerPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRViewerPose]
  }
  
  @scala.inline
  implicit class XRViewerPoseMutableBuilder[Self <: XRViewerPose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViews(value: js.Array[XRView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsVarargs(value: XRView*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
