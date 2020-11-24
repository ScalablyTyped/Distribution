package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompareFacesMatch extends js.Object {
  
  /**
    * Provides face metadata (bounding box and confidence that the bounding box actually contains a face).
    */
  var Face: js.UndefOr[ComparedFace] = js.native
  
  /**
    * Level of confidence that the faces match.
    */
  var Similarity: js.UndefOr[Percent] = js.native
}
object CompareFacesMatch {
  
  @scala.inline
  def apply(): CompareFacesMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareFacesMatch]
  }
  
  @scala.inline
  implicit class CompareFacesMatchOps[Self <: CompareFacesMatch] (val x: Self) extends AnyVal {
    
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
    def setFace(value: ComparedFace): Self = this.set("Face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFace: Self = this.set("Face", js.undefined)
    
    @scala.inline
    def setSimilarity(value: Percent): Self = this.set("Similarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimilarity: Self = this.set("Similarity", js.undefined)
  }
}
