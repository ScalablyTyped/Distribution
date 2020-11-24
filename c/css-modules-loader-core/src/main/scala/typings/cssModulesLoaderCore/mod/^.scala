package typings.cssModulesLoaderCore.mod

import typings.postcss.mod.Plugin_
import typings.postcss.mod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-modules-loader-core", JSImport.Namespace)
@js.native
class ^ () extends Core {
  def this(plugins: js.Array[Plugin_[_]]) = this()
}
@JSImport("css-modules-loader-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var defaultPlugins: js.Array[Plugin_[js.Object]] = js.native
  
  def extractImports(): Transformer = js.native
  def extractImports(opts: js.Object): Transformer = js.native
  @JSName("extractImports")
  var extractImports_Original: Plugin_[js.Object] = js.native
  
  def localByDefault(): Transformer = js.native
  def localByDefault(opts: js.Object): Transformer = js.native
  @JSName("localByDefault")
  var localByDefault_Original: Plugin_[js.Object] = js.native
  
  def scope(): Transformer = js.native
  def scope(opts: js.Object): Transformer = js.native
  @JSName("scope")
  var scope_Original: Plugin_[js.Object] = js.native
  
  def values(): Transformer = js.native
  def values(opts: js.Object): Transformer = js.native
  @JSName("values")
  var values_Original: Plugin_[js.Object] = js.native
}
