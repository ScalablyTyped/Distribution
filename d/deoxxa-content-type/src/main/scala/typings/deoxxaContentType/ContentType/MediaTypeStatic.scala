package typings.deoxxaContentType.ContentType

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTypeStatic
  extends Instantiable1[/* s */ String, MediaType]
     with Instantiable2[/* s */ String, /* p */ js.Any, MediaType] {
  
  def mediaCmp(a: MediaType, b: MediaType): Double = js.native
  
  def parseMedia(`type`: String): MediaType = js.native
  
  def select(availableTypes: js.Array[MediaType], acceptedTypes: js.Array[MediaType]): String = js.native
  def select(availableTypes: js.Array[MediaType], acceptedTypes: js.Array[MediaType], options: SelectOptions): String = js.native
  
  def splitContentTypes(str: String): js.Array[String] = js.native
  
  def splitQuotedString(str: String): js.Array[String] = js.native
  def splitQuotedString(str: String, delimiter: js.UndefOr[scala.Nothing], quote: String): js.Array[String] = js.native
  def splitQuotedString(str: String, delimiter: String): js.Array[String] = js.native
  def splitQuotedString(str: String, delimiter: String, quote: String): js.Array[String] = js.native
}
