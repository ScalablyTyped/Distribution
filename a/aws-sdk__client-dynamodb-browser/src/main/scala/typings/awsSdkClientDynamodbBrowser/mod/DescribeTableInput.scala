package typings.awsSdkClientDynamodbBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput
object DescribeTableInput {
  
  inline def apply(TableName: String): DescribeTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableInput]
  }
}
