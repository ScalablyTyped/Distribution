package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "ModelFileDownloader")
@js.native
class ModelFileDownloader protected () extends js.Object {
  /**
    * Create a ModelFileDownloader and bind to a ModelFileLoader.
    */
  def this(mfl: ModelFileLoader, startDelay: scala.Double, jobDelay: scala.Double) = this()
  /**
    * Download all external dependencies for an array of model files
    */
  def downloadExternalDependencies(modelFiles: js.Array[ModelFile]): js.Promise[js.Array[ModelFile]] = js.native
  def downloadExternalDependencies(modelFiles: js.Array[ModelFile], options: js.Any): js.Promise[js.Array[ModelFile]] = js.native
  /**
    * Execute a Job
    */
  def runJob(job: js.Any): js.Promise[_] = js.native
}

