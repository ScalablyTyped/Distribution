package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "ParseException")
@js.native
class ParseException protected () extends BaseFileException {
  /**
    * Create an ParseException
    */
  def this(message: String) = this()
  def this(message: String, fileLocation: String) = this()
  def this(message: String, fileLocation: String, fileName: String) = this()
  def this(message: String, fileLocation: String, fileName: String, fullMessageOverride: String) = this()
  def this(
    message: String,
    fileLocation: String,
    fileName: String,
    fullMessageOverride: String,
    component: String
  ) = this()
}

