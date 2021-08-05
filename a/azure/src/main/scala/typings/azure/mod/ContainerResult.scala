package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "ContainerResult")
@js.native
class ContainerResult () extends StObject {
  def this(name: String) = this()
  def this(name: String, publicAccessLevel: String) = this()
  
  var etag: String = js.native
  
  def getPropertiesFromHeaders(headers: js.Any): Unit = js.native
  
  var lastModified: String = js.native
  
  var leaseDuration: String = js.native
  
  var leaseState: String = js.native
  
  var leaseStatus: String = js.native
  
  var metadata: StorageMetadata = js.native
  
  var name: String = js.native
  
  var publicAccessLevel: String = js.native
  
  var requestId: String = js.native
  
  var signedIdentifiers: js.Array[SignedIdentifier] = js.native
}
/* static members */
object ContainerResult {
  
  @JSImport("azure", "ContainerResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(containerXml: js.Any): ContainerResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(containerXml.asInstanceOf[js.Any]).asInstanceOf[ContainerResult]
}
