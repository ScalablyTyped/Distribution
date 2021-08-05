package typings.awsSdkClientDynamodbBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTimeToLiveInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
object DescribeTimeToLiveInput {
  
  inline def apply(TableName: String): DescribeTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeToLiveInput]
  }
}
