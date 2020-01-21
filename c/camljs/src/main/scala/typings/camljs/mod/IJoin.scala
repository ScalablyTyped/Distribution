package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJoin extends IJoinable {
  /** Select projected field for using in the main Query body
    @param remoteFieldAlias By this alias, the field can be used in the main Query body. */
  def Select(remoteFieldInternalName: String, remoteFieldAlias: String): IProjectableView = js.native
}

