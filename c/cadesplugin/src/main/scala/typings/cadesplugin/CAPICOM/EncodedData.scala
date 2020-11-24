package typings.cadesplugin.CAPICOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodedData extends js.Object {
  
  val Format: String = js.native
  
  def Value(): String = js.native
  def Value(EncodingType: CAPICOM_ENCODING_TYPE): String = js.native
}
