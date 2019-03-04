package typings
package chromeLib.chromeNs.devtoolsNs.networkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * Returns content of the response body.
    * @param callback A function that receives the response body when the request completes.
    * The callback parameter should be a function that looks like this:
    * function(string content, string encoding) {...};
    * Parameter content: Content of the response body (potentially encoded).
    * Parameter encoding: Empty if content is not encoded, encoding name otherwise. Currently, only base64 is supported.
    */
  def getContent(
    callback: js.Function2[/* content */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  ): scala.Unit
}

object Request {
  @scala.inline
  def apply(
    getContent: js.Function1[
      js.Function2[/* content */ java.lang.String, /* encoding */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): Request = {
    val __obj = js.Dynamic.literal(getContent = getContent)
  
    __obj.asInstanceOf[Request]
  }
}

