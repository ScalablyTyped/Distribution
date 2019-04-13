package typings
package blobDashStreamLib.blobDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlobStream
  extends nodeLib.NodeJSNs.WritableStream {
  def toBlob(): stdLib.Blob = js.native
  def toBlob(`type`: java.lang.String): stdLib.Blob = js.native
  def toBlobURL(): java.lang.String = js.native
  def toBlobURL(`type`: java.lang.String): java.lang.String = js.native
}

