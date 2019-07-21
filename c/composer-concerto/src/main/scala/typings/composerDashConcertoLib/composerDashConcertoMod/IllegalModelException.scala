package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "IllegalModelException")
@js.native
class IllegalModelException protected () extends BaseFileException {
  /**
    * Create an IllegalModelException.
    */
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, modelFile: ModelFile) = this()
  def this(message: java.lang.String, modelFile: ModelFile, fileLocation: js.Any) = this()
  def this(message: java.lang.String, modelFile: ModelFile, fileLocation: js.Any, component: java.lang.String) = this()
  /**
    * Returns the modelfile associated with the exception or null.
    */
  def getModelFile(): ModelFile | scala.Null = js.native
}

