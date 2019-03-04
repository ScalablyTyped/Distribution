package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicReq extends js.Object {
  val isLogging: scala.Boolean
  val params: org.scalablytyped.runtime.StringDictionary[js.Any]
  val systemKey: java.lang.String
  val systemSecret: java.lang.String
  val userEmail: java.lang.String
  val userToken: java.lang.String
  val userid: java.lang.String
}

object BasicReq {
  @scala.inline
  def apply(
    isLogging: scala.Boolean,
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    userEmail: java.lang.String,
    userToken: java.lang.String,
    userid: java.lang.String
  ): BasicReq = {
    val __obj = js.Dynamic.literal(isLogging = isLogging, params = params, systemKey = systemKey, systemSecret = systemSecret, userEmail = userEmail, userToken = userToken, userid = userid)
  
    __obj.asInstanceOf[BasicReq]
  }
}

