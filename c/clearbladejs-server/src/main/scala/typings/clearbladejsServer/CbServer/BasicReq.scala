package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicReq extends js.Object {
  val isLogging: Boolean
  val params: StringDictionary[js.Any]
  val systemKey: String
  val systemSecret: String
  val userEmail: String
  val userToken: String
  val userid: String
}

object BasicReq {
  @scala.inline
  def apply(
    isLogging: Boolean,
    params: StringDictionary[js.Any],
    systemKey: String,
    systemSecret: String,
    userEmail: String,
    userToken: String,
    userid: String
  ): BasicReq = {
    val __obj = js.Dynamic.literal(isLogging = isLogging.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], userEmail = userEmail.asInstanceOf[js.Any], userToken = userToken.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicReq]
  }
}

