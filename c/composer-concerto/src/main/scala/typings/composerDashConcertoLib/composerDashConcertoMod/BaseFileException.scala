package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "BaseFileException")
@js.native
class BaseFileException protected () extends BaseException {
  /**
    * Create an BaseFileException
    */
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, fileLocation: java.lang.String) = this()
  def this(message: java.lang.String, fileLocation: java.lang.String, fullMessage: java.lang.String) = this()
  def this(message: java.lang.String, fileLocation: java.lang.String, fullMessage: java.lang.String, fileName: java.lang.String) = this()
  def this(message: java.lang.String, fileLocation: java.lang.String, fullMessage: java.lang.String, fileName: java.lang.String, component: java.lang.String) = this()
  /**
    * Returns the file location associated with the exception or null
    */
  def getFileLocation(): java.lang.String | scala.Null = js.native
  /**
    * Returns the fileName for the error
    */
  def getFileName(): java.lang.String | scala.Null = js.native
  /**
    * Returns the error message without the location of the error
    */
  def getShortMessage(): java.lang.String = js.native
}

