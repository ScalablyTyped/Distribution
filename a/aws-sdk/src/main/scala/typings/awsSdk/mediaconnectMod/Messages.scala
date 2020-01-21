package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  /**
    * A list of errors that might have been generated from processes on this flow.
    */
  var Errors: listOfString = js.native
}

object Messages {
  @scala.inline
  def apply(Errors: listOfString): Messages = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Messages]
  }
}

