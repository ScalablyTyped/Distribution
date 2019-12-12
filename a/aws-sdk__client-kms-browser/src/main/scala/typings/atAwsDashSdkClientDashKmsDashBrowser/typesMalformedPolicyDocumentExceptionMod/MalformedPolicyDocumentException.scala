package typings.atAwsDashSdkClientDashKmsDashBrowser.typesMalformedPolicyDocumentExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MalformedPolicyDocumentException
  extends ServiceException[_MalformedPolicyDocumentExceptionDetails]
     with CreateKeyExceptionsUnion
     with PutKeyPolicyExceptionsUnion {
  @JSName("name")
  var name_MalformedPolicyDocumentException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.MalformedPolicyDocumentException = js.native
}

