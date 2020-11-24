package typings.cloudeventsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONParser extends js.Object {
  
  var decorator: js.Any = js.native
  
  def parse(payload: String): js.Any = js.native
  /**
    * Parses the payload with an optional decorator
    * @param {object|string} payload the JSON payload
    * @return {object} the parsed JSON payload.
    */
  def parse(payload: js.Object): js.Any = js.native
}
