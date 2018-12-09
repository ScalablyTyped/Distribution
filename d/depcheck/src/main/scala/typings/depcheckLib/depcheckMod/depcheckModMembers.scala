package typings
package depcheckLib.depcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("depcheck", JSImport.Namespace)
@js.native
object depcheckModMembers extends js.Object {
  val detector: depcheckLib.Anon_GruntLoadTaskCallExpression = js.native
  val parser: depcheckLib.Anon_Jsx = js.native
  val special: depcheckLib.Anon_Commitizen = js.native
  def apply(rootDir: java.lang.String, options: depcheckLib.depcheckMod.depcheckNs.Options): js.Promise[depcheckLib.depcheckMod.depcheckNs.Results] = js.native
  def apply[T](
    rootDir: java.lang.String,
    options: depcheckLib.depcheckMod.depcheckNs.Options,
    callback: js.Function1[/* results */ depcheckLib.depcheckMod.depcheckNs.Results, T]
  ): js.Promise[T] = js.native
}

