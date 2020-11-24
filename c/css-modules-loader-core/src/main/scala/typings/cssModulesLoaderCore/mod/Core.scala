package typings.cssModulesLoaderCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Core extends js.Object {
  
  def load(source: Source): js.Promise[Result] = js.native
  def load(
    source: Source,
    sourcePath: js.UndefOr[scala.Nothing],
    trace: js.UndefOr[scala.Nothing],
    pathFetcher: PathFetcher
  ): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: js.UndefOr[scala.Nothing], trace: String): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: js.UndefOr[scala.Nothing], trace: String, pathFetcher: PathFetcher): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: String): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: String, trace: js.UndefOr[scala.Nothing], pathFetcher: PathFetcher): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: String, trace: String): js.Promise[Result] = js.native
  def load(source: Source, sourcePath: String, trace: String, pathFetcher: PathFetcher): js.Promise[Result] = js.native
}
