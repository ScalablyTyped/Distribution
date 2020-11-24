package typings.contentfulManagement.snapshotMod

import typings.axios.mod.AxiosInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/snapshot", "wrapSnapshot")
@js.native
object wrapSnapshot extends js.Object {
  
  def apply[T](_http: AxiosInstance, data: SnapshotProps[T]): Snapshot[T] = js.native
}
