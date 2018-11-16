package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "ContainerResult")
@js.native
class ContainerResult () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, publicAccessLevel: java.lang.String) = this()
  var etag: java.lang.String = js.native
  var lastModified: java.lang.String = js.native
  var leaseDuration: java.lang.String = js.native
  var leaseState: java.lang.String = js.native
  var leaseStatus: java.lang.String = js.native
  var metadata: StorageMetadata = js.native
  var name: java.lang.String = js.native
  var publicAccessLevel: java.lang.String = js.native
  var requestId: java.lang.String = js.native
  var signedIdentifiers: js.Array[SignedIdentifier] = js.native
  def getPropertiesFromHeaders(headers: js.Any): scala.Unit = js.native
}

@JSImport("azure", "ContainerResult")
@js.native
object ContainerResult extends js.Object {
  def parse(containerXml: js.Any): azureLib.azureMod.ContainerResult = js.native
}

