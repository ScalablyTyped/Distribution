package typings.awsSdk.globalMod

import typings.awsSdk.metadataServiceMod.MetadataServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/global", "MetadataService")
@js.native
/**
  * Creates a new MetadataService object with a given set of options.
  */
class MetadataService ()
  extends typings.awsSdk.coreMod.MetadataService {
  def this(options: MetadataServiceOptions) = this()
}
/* static members */
@JSImport("aws-sdk/global", "MetadataService")
@js.native
object MetadataService extends js.Object {
  
  /**
    * 169.254.169.254
    */
  var host: String = js.native
}
