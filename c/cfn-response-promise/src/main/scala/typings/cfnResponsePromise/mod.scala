package typings.cfnResponsePromise

import typings.awsLambda.handlerMod.Context
import typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cfn-response-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cfn-response-promise", "FAILED")
  @js.native
  val FAILED: typings.cfnResponsePromise.cfnResponsePromiseStrings.FAILED = js.native
  
  @JSImport("cfn-response-promise", "SUCCESS")
  @js.native
  val SUCCESS: typings.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS = js.native
  
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typings.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS | typings.cfnResponsePromise.cfnResponsePromiseStrings.FAILED
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typings.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS | typings.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.Object
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typings.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS | typings.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.Object,
    physicalResourceId: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typings.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS | typings.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.Object,
    physicalResourceId: String,
    noEcho: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typings.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS | typings.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.Object,
    physicalResourceId: Unit,
    noEcho: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typings.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS | typings.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: Unit,
    physicalResourceId: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typings.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS | typings.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: Unit,
    physicalResourceId: String,
    noEcho: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typings.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS | typings.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: Unit,
    physicalResourceId: Unit,
    noEcho: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], responseStatus.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], physicalResourceId.asInstanceOf[js.Any], noEcho.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
