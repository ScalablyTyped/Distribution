package typings
package cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css-modules-loader-core", JSImport.Namespace)
@js.native
class ^ () extends Core {
  def this(plugins: js.Array[postcssLib.postcssMod.Plugin[_]]) = this()
}

@JSImport("css-modules-loader-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultPlugins: js.Array[postcssLib.postcssMod.Plugin[js.Object]] = js.native
  @JSName("extractImports")
  var extractImports_Original: postcssLib.postcssMod.Plugin[js.Object] = js.native
  @JSName("localByDefault")
  var localByDefault_Original: postcssLib.postcssMod.Plugin[js.Object] = js.native
  @JSName("scope")
  var scope_Original: postcssLib.postcssMod.Plugin[js.Object] = js.native
  @JSName("values")
  var values_Original: postcssLib.postcssMod.Plugin[js.Object] = js.native
  def extractImports(): postcssLib.postcssMod.Transformer = js.native
  def extractImports(opts: js.Object): postcssLib.postcssMod.Transformer = js.native
  def localByDefault(): postcssLib.postcssMod.Transformer = js.native
  def localByDefault(opts: js.Object): postcssLib.postcssMod.Transformer = js.native
  def scope(): postcssLib.postcssMod.Transformer = js.native
  def scope(opts: js.Object): postcssLib.postcssMod.Transformer = js.native
  def values(): postcssLib.postcssMod.Transformer = js.native
  def values(opts: js.Object): postcssLib.postcssMod.Transformer = js.native
}

