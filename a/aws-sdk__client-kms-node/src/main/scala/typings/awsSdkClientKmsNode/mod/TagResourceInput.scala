package typings.awsSdkClientKmsNode.mod

import typings.awsSdkClientKmsNode.typesTagMod.Tag
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput
object TagResourceInput {
  
  @scala.inline
  def apply(KeyId: String, Tags: js.Array[Tag] | Iterable[Tag]): TagResourceInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
}
