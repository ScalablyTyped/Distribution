package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "IllegalModelException")
@js.native
class IllegalModelException protected () extends BaseFileException {
  /**
    * Create an IllegalModelException.
    */
  def this(message: String) = this()
  def this(message: String, modelFile: ModelFile) = this()
  def this(message: String, modelFile: ModelFile, fileLocation: js.Any) = this()
  def this(message: String, modelFile: ModelFile, fileLocation: js.Any, component: String) = this()
  /**
    * Returns the modelfile associated with the exception or null.
    */
  def getModelFile(): ModelFile | Null = js.native
}

