package typings.awsSdkClientDynamodbNode.mod

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput
object UntagResourceInput {
  
  inline def apply(ResourceArn: String, TagKeys: js.Array[String] | Iterable[String]): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
}
