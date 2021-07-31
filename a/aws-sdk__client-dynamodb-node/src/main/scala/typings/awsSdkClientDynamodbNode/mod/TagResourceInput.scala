package typings.awsSdkClientDynamodbNode.mod

import typings.awsSdkClientDynamodbNode.typesTagMod.Tag
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput
object TagResourceInput {
  
  @scala.inline
  def apply(ResourceArn: String, Tags: js.Array[Tag] | Iterable[Tag]): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
}
