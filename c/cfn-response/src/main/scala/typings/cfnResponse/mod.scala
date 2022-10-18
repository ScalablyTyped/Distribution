package typings.cfnResponse

import typings.awsLambda.handlerMod.Context
import typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cfn-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cfn-response", "FAILED")
  @js.native
  val FAILED: typings.cfnResponse.cfnResponseStrings.FAILED = js.native
  
  @JSImport("cfn-response", "SUCCESS")
  @js.native
  val SUCCESS: typings.cfnResponse.cfnResponseStrings.SUCCESS = js.native
  
  inline def send(event: CloudFormationCustomResourceEvent, context: Context, responseStatus: ResponseStatus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String,
    noEcho: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: Unit,
    noEcho: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: Unit,
    physicalResourceId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: Unit,
    physicalResourceId: String,
    noEcho: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: Unit,
    physicalResourceId: Unit,
    noEcho: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cfnResponse.cfnResponseStrings.SUCCESS
    - typings.cfnResponse.cfnResponseStrings.FAILED
  */
  trait ResponseStatus extends StObject
  object ResponseStatus {
    
    inline def FAILED: typings.cfnResponse.cfnResponseStrings.FAILED = "FAILED".asInstanceOf[typings.cfnResponse.cfnResponseStrings.FAILED]
    
    inline def SUCCESS: typings.cfnResponse.cfnResponseStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.cfnResponse.cfnResponseStrings.SUCCESS]
  }
}
