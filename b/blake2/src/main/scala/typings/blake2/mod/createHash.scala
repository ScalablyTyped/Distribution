package typings.blake2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blake2", "createHash")
@js.native
object createHash extends js.Object {
  
  def apply(algorithm: Blake2Algorithm): Hash = js.native
  def apply(algorithm: Blake2Algorithm, options: Blake2Options): Hash = js.native
}
