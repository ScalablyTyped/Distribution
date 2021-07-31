package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput
object UpdateTableInput {
  
  @scala.inline
  def apply(TableName: String): UpdateTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableInput]
  }
}
