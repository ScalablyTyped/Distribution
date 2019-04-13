package typings
package cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Core extends js.Object {
  def load(source: Source): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: java.lang.String): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: java.lang.String, trace: java.lang.String): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: java.lang.String, trace: java.lang.String, pathFetcher: PathFetcher): js.Promise[Result] = js.native
}

