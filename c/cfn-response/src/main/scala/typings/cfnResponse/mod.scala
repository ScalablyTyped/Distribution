package typings.cfnResponse

import typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceEvent
import typings.awsLambda.handlerMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cfn-response", "FAILED")
  @js.native
  val FAILED: typings.cfnResponse.cfnResponseStrings.FAILED = js.native
  
  @JSImport("cfn-response", "SUCCESS")
  @js.native
  val SUCCESS: typings.cfnResponse.cfnResponseStrings.SUCCESS = js.native
  
  @JSImport("cfn-response", "send")
  @js.native
  def send(event: CloudFormationCustomResourceEvent, context: Context, responseStatus: ResponseStatus): Unit = js.native
  @JSImport("cfn-response", "send")
  @js.native
  def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: js.UndefOr[scala.Nothing],
    noEcho: Boolean
  ): Unit = js.native
  @JSImport("cfn-response", "send")
  @js.native
  def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: String
  ): Unit = js.native
  @JSImport("cfn-response", "send")
  @js.native
  def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: String,
    noEcho: Boolean
  ): Unit = js.native
  @JSImport("cfn-response", "send")
  @js.native
  def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object
  ): Unit = js.native
  @JSImport("cfn-response", "send")
  @js.native
  def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: js.UndefOr[scala.Nothing],
    noEcho: Boolean
  ): Unit = js.native
  @JSImport("cfn-response", "send")
  @js.native
  def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String
  ): Unit = js.native
  @JSImport("cfn-response", "send")
  @js.native
  def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String,
    noEcho: Boolean
  ): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.cfnResponse.cfnResponseStrings.SUCCESS
    - typings.cfnResponse.cfnResponseStrings.FAILED
  */
  trait ResponseStatus extends StObject
  object ResponseStatus {
    
    @scala.inline
    def FAILED: typings.cfnResponse.cfnResponseStrings.FAILED = "FAILED".asInstanceOf[typings.cfnResponse.cfnResponseStrings.FAILED]
    
    @scala.inline
    def SUCCESS: typings.cfnResponse.cfnResponseStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.cfnResponse.cfnResponseStrings.SUCCESS]
  }
}
