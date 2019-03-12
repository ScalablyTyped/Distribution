package typings
package cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Core extends js.Object {
  def load(source: cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod.CoreNs.Source): js.Promise[
    cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod.CoreNs.Result
  ] = js.native
  def load(
    source: cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod.CoreNs.Source,
    sourcePath: java.lang.String
  ): js.Promise[
    cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod.CoreNs.Result
  ] = js.native
  def load(
    source: cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod.CoreNs.Source,
    sourcePath: java.lang.String,
    trace: java.lang.String
  ): js.Promise[
    cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod.CoreNs.Result
  ] = js.native
  def load(
    source: cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod.CoreNs.Source,
    sourcePath: java.lang.String,
    trace: java.lang.String,
    pathFetcher: cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod.CoreNs.PathFetcher
  ): js.Promise[
    cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod.CoreNs.Result
  ] = js.native
}

