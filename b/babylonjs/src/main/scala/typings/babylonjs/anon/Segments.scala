package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segments extends js.Object {
  
  var diameter: js.UndefOr[Double] = js.native
  
  var segments: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
}
object Segments {
  
  @scala.inline
  def apply(): Segments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segments]
  }
  
  @scala.inline
  implicit class SegmentsOps[Self <: Segments] (val x: Self) extends AnyVal {
    
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
    def setDiameter(value: Double): Self = this.set("diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiameter: Self = this.set("diameter", js.undefined)
    
    @scala.inline
    def setSegments(value: Double): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideOrientation: Self = this.set("sideOrientation", js.undefined)
  }
}
