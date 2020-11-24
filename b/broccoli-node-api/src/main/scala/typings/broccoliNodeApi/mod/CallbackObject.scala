package typings.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackObject extends js.Object {
  
  def build(): js.Promise[Unit] | Unit = js.native
  def build(buildChangeObject: BuildChangeObject): js.Promise[Unit] | Unit = js.native
}
