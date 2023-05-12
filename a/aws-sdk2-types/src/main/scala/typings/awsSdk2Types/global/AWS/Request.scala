package typings.awsSdk2Types.global.AWS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AWS.Request")
@js.native
open class Request[D, E] protected ()
  extends typings.awsSdk2Types.mod.Request[D, E] {
  /**
    * Creates a request for an operation on a given service with a set of input parameters.
    *
    * @param {AWS.Service} service - The service to perform the operation on.
    * @param {string} operation - The operation to perform on the service.
    * @param {object} params - Parameters to send to the operation.
    */
  def this(service: typings.awsSdk2Types.libServiceMod.Service, operation: String) = this()
  def this(service: typings.awsSdk2Types.libServiceMod.Service, operation: String, params: Any) = this()
}
