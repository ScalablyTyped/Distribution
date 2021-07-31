package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsInput extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedStreamArn in the previous operation. 
    */
  var ExclusiveStartStreamArn: js.UndefOr[StreamArn] = js.undefined
  
  /**
    * The maximum number of streams to return. The upper limit is 100.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  
  /**
    * If this parameter is provided, then only the streams associated with this table name are returned.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.TableName] = js.undefined
}
object ListStreamsInput {
  
  @scala.inline
  def apply(): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsInput]
  }
  
  @scala.inline
  implicit class ListStreamsInputMutableBuilder[Self <: ListStreamsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusiveStartStreamArn(value: StreamArn): Self = StObject.set(x, "ExclusiveStartStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartStreamArnUndefined: Self = StObject.set(x, "ExclusiveStartStreamArn", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
