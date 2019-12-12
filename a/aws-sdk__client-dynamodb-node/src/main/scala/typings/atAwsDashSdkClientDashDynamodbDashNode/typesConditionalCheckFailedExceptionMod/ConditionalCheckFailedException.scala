package typings.atAwsDashSdkClientDashDynamodbDashNode.typesConditionalCheckFailedExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalCheckFailedException
  extends ServiceException[_ConditionalCheckFailedExceptionDetails]
     with DeleteItemExceptionsUnion
     with PutItemExceptionsUnion
     with UpdateItemExceptionsUnion {
  @JSName("name")
  var name_ConditionalCheckFailedException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ConditionalCheckFailedException = js.native
}

