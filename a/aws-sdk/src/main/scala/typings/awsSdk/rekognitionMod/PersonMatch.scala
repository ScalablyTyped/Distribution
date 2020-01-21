package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(FaceMatches: FaceMatchList = null, Person: PersonDetail = null, Timestamp: Int | Double = null): PersonMatch = {
    val __obj = js.Dynamic.literal()
    if (FaceMatches != null) __obj.updateDynamic("FaceMatches")(FaceMatches.asInstanceOf[js.Any])
    if (Person != null) __obj.updateDynamic("Person")(Person.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonMatch]
  }
}

