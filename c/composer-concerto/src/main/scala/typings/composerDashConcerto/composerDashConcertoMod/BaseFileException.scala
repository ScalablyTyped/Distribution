package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "BaseFileException")
@js.native
class BaseFileException protected () extends BaseException {
  /**
    * Create an BaseFileException
    */
  def this(message: String) = this()
  def this(message: String, fileLocation: String) = this()
  def this(message: String, fileLocation: String, fullMessage: String) = this()
  def this(message: String, fileLocation: String, fullMessage: String, fileName: String) = this()
  def this(message: String, fileLocation: String, fullMessage: String, fileName: String, component: String) = this()
  /**
    * Returns the file location associated with the exception or null
    */
  def getFileLocation(): String | Null = js.native
  /**
    * Returns the fileName for the error
    */
  def getFileName(): String | Null = js.native
  /**
    * Returns the error message without the location of the error
    */
  def getShortMessage(): String = js.native
}

