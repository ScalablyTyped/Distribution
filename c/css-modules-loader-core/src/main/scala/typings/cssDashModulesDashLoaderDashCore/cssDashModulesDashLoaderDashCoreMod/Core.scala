package typings.cssDashModulesDashLoaderDashCore.cssDashModulesDashLoaderDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Core extends js.Object {
  def load(source: Source): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: String): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: String, trace: String): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: String, trace: String, pathFetcher: PathFetcher): js.Promise[Result] = js.native
}

