package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blackout extends js.Object {
  var blackout: js.Array[String]
  var dimensions: Height
  var duration: Double
  var multipart: Boolean
  var name: String
  var path: String
  var pixelRatio: Double
  var size: Double
  var takenAt: String
  var testAttemptIndex: Double
}

object Blackout {
  @scala.inline
  def apply(
    blackout: js.Array[String],
    dimensions: Height,
    duration: Double,
    multipart: Boolean,
    name: String,
    path: String,
    pixelRatio: Double,
    size: Double,
    takenAt: String,
    testAttemptIndex: Double
  ): Blackout = {
    val __obj = js.Dynamic.literal(blackout = blackout.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], multipart = multipart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], takenAt = takenAt.asInstanceOf[js.Any], testAttemptIndex = testAttemptIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blackout]
  }
}

