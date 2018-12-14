package typings
package deoxxaDashContentDashTypeLib.ContentTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTypeStatic
  extends org.scalablytyped.runtime.Instantiable1[/* s */ java.lang.String, MediaType]
     with org.scalablytyped.runtime.Instantiable2[/* s */ java.lang.String, /* p */ js.Any, MediaType] {
  def mediaCmp(a: MediaType, b: MediaType): scala.Double = js.native
  def parseMedia(`type`: java.lang.String): MediaType = js.native
  def select(availableTypes: js.Array[MediaType], acceptedTypes: js.Array[MediaType]): java.lang.String = js.native
  def select(availableTypes: js.Array[MediaType], acceptedTypes: js.Array[MediaType], options: SelectOptions): java.lang.String = js.native
  def splitContentTypes(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitQuotedString(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitQuotedString(str: java.lang.String, delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  def splitQuotedString(str: java.lang.String, delimiter: java.lang.String, quote: java.lang.String): js.Array[java.lang.String] = js.native
}

