package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/core", "transformAsync")
@js.native
object transformAsync extends js.Object {
  
  def apply(code: String): js.Promise[BabelFileResult | Null] = js.native
  def apply(code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
}
