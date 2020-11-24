package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonMatch extends js.Object {
  
  /**
    * Information about the faces in the input collection that match the face of a person in the video.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.native
  
  /**
    * Information about the matched person.
    */
  var Person: js.UndefOr[PersonDetail] = js.native
  
  /**
    * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}
object PersonMatch {
  
  @scala.inline
  def apply(): PersonMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonMatch]
  }
  
  @scala.inline
  implicit class PersonMatchOps[Self <: PersonMatch] (val x: Self) extends AnyVal {
    
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
    def setFaceMatchesVarargs(value: FaceMatch*): Self = this.set("FaceMatches", js.Array(value :_*))
    
    @scala.inline
    def setFaceMatches(value: FaceMatchList): Self = this.set("FaceMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceMatches: Self = this.set("FaceMatches", js.undefined)
    
    @scala.inline
    def setPerson(value: PersonDetail): Self = this.set("Person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerson: Self = this.set("Person", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
