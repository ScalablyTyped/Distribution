package typings
package chromeLib.chromeNs.devtoolsNs.inspectedWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /** The URL of the resource. */
  var url: java.lang.String = js.native
  /**
    * Gets the content of the resource.
    * @param callback A function that receives resource content when the request completes.
    * The callback parameter should be a function that looks like this:
    * function(string content, string encoding) {...};
    * Parameter content: Content of the resource (potentially encoded).
    * Parameter encoding: Empty if content is not encoded, encoding name otherwise. Currently, only base64 is supported.
    */
  def getContent(
    callback: js.Function2[/* content */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the content of the resource.
    * @param content New content of the resource. Only resources with the text type are currently supported.
    * @param commit True if the user has finished editing the resource, and the new content of the resource should be persisted; false if this is a minor change sent in progress of the user editing the resource.
    * @param callback A function called upon request completion.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function(object error) {...};
    * Optional parameter error: Set to undefined if the resource content was set successfully; describes error otherwise.
    */
  def setContent(content: java.lang.String, commit: scala.Boolean): scala.Unit = js.native
  def setContent(
    content: java.lang.String,
    commit: scala.Boolean,
    callback: js.Function1[/* error */ js.Object, scala.Unit]
  ): scala.Unit = js.native
}

