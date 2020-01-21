package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectInput extends js.Object {
  /**
    * The name of the build project.
    */
  var name: NonEmptyString = js.native
}

object DeleteProjectInput {
  @scala.inline
  def apply(name: NonEmptyString): DeleteProjectInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProjectInput]
  }
}

