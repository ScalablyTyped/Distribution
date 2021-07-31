package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsOfResourceInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
object ListTagsOfResourceInput {
  
  @scala.inline
  def apply(ResourceArn: String): ListTagsOfResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsOfResourceInput]
  }
}
