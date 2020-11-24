package typings.builderUtil.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util/out/fs", "walk")
@js.native
object walk extends js.Object {
  
  def apply(initialDirPath: String): js.Promise[js.Array[String]] = js.native
  def apply(initialDirPath: String, filter: js.UndefOr[scala.Nothing], consumer: FileConsumer): js.Promise[js.Array[String]] = js.native
  def apply(initialDirPath: String, filter: Null, consumer: FileConsumer): js.Promise[js.Array[String]] = js.native
  def apply(initialDirPath: String, filter: Filter): js.Promise[js.Array[String]] = js.native
  def apply(initialDirPath: String, filter: Filter, consumer: FileConsumer): js.Promise[js.Array[String]] = js.native
}
