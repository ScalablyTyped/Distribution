package typings.awsSdk.global.AWS

import typings.awsSdk.metadataServiceMod.MetadataServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AWS.MetadataService")
@js.native
/**
  * Creates a new MetadataService object with a given set of options.
  */
open class MetadataService ()
  extends typings.awsSdk.mod.MetadataService {
  def this(options: MetadataServiceOptions) = this()
}
/* static members */
object MetadataService {
  
  @JSGlobal("AWS.MetadataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 169.254.169.254
    */
  @JSGlobal("AWS.MetadataService.host")
  @js.native
  def host: String = js.native
  inline def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
}
