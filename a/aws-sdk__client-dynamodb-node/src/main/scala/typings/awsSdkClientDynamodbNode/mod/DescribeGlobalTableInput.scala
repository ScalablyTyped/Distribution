package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalTableInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
object DescribeGlobalTableInput {
  
  @scala.inline
  def apply(GlobalTableName: String): DescribeGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalTableInput]
  }
}
