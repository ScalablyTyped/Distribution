package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeScreenAutomationRequest extends js.Object {
  /**
    * The ID of the app that contains the screen automation.
    */
  var appId: ResourceId = js.native
  /**
    *  The request token for performing the automation action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will return the response of the previous call rather than performing the action again.   Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    *  The row ID for the automation if the automation is defined inside a block with source or list. 
    */
  var rowId: js.UndefOr[RowId] = js.native
  /**
    * The ID of the automation action to be performed.
    */
  var screenAutomationId: ResourceId = js.native
  /**
    * The ID of the screen that contains the screen automation.
    */
  var screenId: ResourceId = js.native
  /**
    *  Variables are optional and are needed only if the screen requires them to render correctly. Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is an object which currently has only one property, rawValue, which holds the value of the variable to be passed to the screen. 
    */
  var variables: js.UndefOr[VariableValueMap] = js.native
  /**
    * The ID of the workbook that contains the screen automation.
    */
  var workbookId: ResourceId = js.native
}

object InvokeScreenAutomationRequest {
  @scala.inline
  def apply(
    appId: ResourceId,
    screenAutomationId: ResourceId,
    screenId: ResourceId,
    workbookId: ResourceId,
    clientRequestToken: ClientRequestToken = null,
    rowId: RowId = null,
    variables: VariableValueMap = null
  ): InvokeScreenAutomationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], screenAutomationId = screenAutomationId.asInstanceOf[js.Any], screenId = screenId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeScreenAutomationRequest]
  }
}

