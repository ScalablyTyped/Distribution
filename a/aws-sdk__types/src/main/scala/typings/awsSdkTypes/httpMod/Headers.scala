package typings.awsSdkTypes.httpMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends Map[String, String] {
  /**
    * Returns a new instance of Headers with the specified header set to the
    * provided value. Does not modify the original Headers instance.
    *
    * @param headerName    The name of the header to add or overwrite
    * @param headerValue   The value to which the header should be set
    */
  def withHeader(headerName: String, headerValue: String): Headers = js.native
  /**
    * Returns a new instance of Headers without the specified header. Does not
    * modify the original Headers instance.
    *
    * @param headerName    The name of the header to remove
    */
  def withoutHeader(headerName: String): Headers = js.native
}

