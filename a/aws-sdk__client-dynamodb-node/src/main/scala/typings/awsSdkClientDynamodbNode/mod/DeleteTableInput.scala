package typings.awsSdkClientDynamodbNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTableInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput
object DeleteTableInput {
  
  @scala.inline
  def apply(TableName: String): DeleteTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableInput]
  }
}
