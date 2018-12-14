package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebRequestBody extends js.Object {
  /** Optional. Errors when obtaining request body data. */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional.
           * If the request method is POST and the body is a sequence of key-value pairs encoded in UTF8, encoded as either multipart/form-data, or application/x-www-form-urlencoded, this dictionary is present and for each key contains the list of all values for that key. If the data is of another media type, or if it is malformed, the dictionary is not present. An example value of this dictionary is {'key': ['value1', 'value2']}.
           */
  var formData: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  /**
           * Optional.
           * If the request method is PUT or POST, and the body is not already parsed in formData, then the unparsed request body elements are contained in this array.
           */
  var raw: js.UndefOr[js.Array[UploadData]] = js.undefined
}

