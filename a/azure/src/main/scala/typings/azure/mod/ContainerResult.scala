package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "ContainerResult")
@js.native
class ContainerResult () extends js.Object {
  def this(name: String) = this()
  def this(name: String, publicAccessLevel: String) = this()
  var etag: String = js.native
  var lastModified: String = js.native
  var leaseDuration: String = js.native
  var leaseState: String = js.native
  var leaseStatus: String = js.native
  var metadata: StorageMetadata = js.native
  var name: String = js.native
  var publicAccessLevel: String = js.native
  var requestId: String = js.native
  var signedIdentifiers: js.Array[SignedIdentifier] = js.native
  def getPropertiesFromHeaders(headers: js.Any): Unit = js.native
}

/* static members */
@JSImport("azure", "ContainerResult")
@js.native
object ContainerResult extends js.Object {
  def parse(containerXml: js.Any): ContainerResult = js.native
}

