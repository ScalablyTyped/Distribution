package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeyInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput
object DescribeKeyInput {
  
  @scala.inline
  def apply(KeyId: String): DescribeKeyInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyInput]
  }
}
