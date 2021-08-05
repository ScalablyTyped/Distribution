package typings.awsSdkClientKmsNode.mod

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput
object UntagResourceInput {
  
  inline def apply(KeyId: String, TagKeys: js.Array[String] | Iterable[String]): UntagResourceInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
}
