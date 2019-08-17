package typings.ckeditor.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filterNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.ckeditor.CKEDITORNs.style

  type allowedContentRule = String | style | StringDictionary[js.Any]
  type allowedContentRules = allowedContentRule | js.Array[allowedContentRule]
  type contentRule = String | style
  type disallowedContentRules = String | StringDictionary[js.Any]
}
