package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry extends js.Object {
  
  /**
    * An axis-aligned coarse representation of the location of the recognized item on the document page.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.textractMod.BoundingBox] = js.native
  
  /**
    * Within the bounding box, a fine-grained polygon around the recognized item.
    */
  var Polygon: js.UndefOr[typings.awsSdk.textractMod.Polygon] = js.native
}
object Geometry {
  
  @scala.inline
  def apply(): Geometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = this.set("BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBox: Self = this.set("BoundingBox", js.undefined)
    
    @scala.inline
    def setPolygonVarargs(value: Point*): Self = this.set("Polygon", js.Array(value :_*))
    
    @scala.inline
    def setPolygon(value: Polygon): Self = this.set("Polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygon: Self = this.set("Polygon", js.undefined)
  }
}
