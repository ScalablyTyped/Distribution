package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput
object DescribeTableInput {
  
  @scala.inline
  def apply(TableName: String): DescribeTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableInput]
  }
}
