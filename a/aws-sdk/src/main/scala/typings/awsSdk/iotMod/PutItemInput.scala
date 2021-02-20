package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutItemInput extends StObject {
  
  /**
    * The table where the message data will be written.
    */
  var tableName: TableName = js.native
}
object PutItemInput {
  
  @scala.inline
  def apply(tableName: TableName): PutItemInput = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutItemInput]
  }
  
  @scala.inline
  implicit class PutItemInputMutableBuilder[Self <: PutItemInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
