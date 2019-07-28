package typings.clearbladejsDashServer.CbServerNs

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
    val __obj = js.Dynamic.literal(isLogging = isLogging, params = params, systemKey = systemKey, systemSecret = systemSecret, userEmail = userEmail, userToken = userToken, userid = userid)
  
    __obj.asInstanceOf[BasicReq]
  }
}

