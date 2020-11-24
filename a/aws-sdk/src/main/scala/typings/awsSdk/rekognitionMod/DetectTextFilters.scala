package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectTextFilters extends js.Object {
  
  /**
    *  A Filter focusing on a certain area of the image. Uses a BoundingBox object to set the region of the image.
    */
  var RegionsOfInterest: js.UndefOr[typings.awsSdk.rekognitionMod.RegionsOfInterest] = js.native
  
  var WordFilter: js.UndefOr[DetectionFilter] = js.native
}
object DetectTextFilters {
  
  @scala.inline
  def apply(): DetectTextFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectTextFilters]
  }
  
  @scala.inline
  implicit class DetectTextFiltersOps[Self <: DetectTextFilters] (val x: Self) extends AnyVal {
    
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
    def setRegionsOfInterestVarargs(value: RegionOfInterest*): Self = this.set("RegionsOfInterest", js.Array(value :_*))
    
    @scala.inline
    def setRegionsOfInterest(value: RegionsOfInterest): Self = this.set("RegionsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionsOfInterest: Self = this.set("RegionsOfInterest", js.undefined)
    
    @scala.inline
    def setWordFilter(value: DetectionFilter): Self = this.set("WordFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordFilter: Self = this.set("WordFilter", js.undefined)
  }
}
