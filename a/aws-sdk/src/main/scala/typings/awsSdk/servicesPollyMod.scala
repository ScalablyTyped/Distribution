package typings.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdk.presignerMod.Presigner.PresignerOptions
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/polly", JSImport.Namespace)
@js.native
object servicesPollyMod extends js.Object {
  @js.native
  class PollyCustomizations () extends Service
  
  /* static members */
  @js.native
  object PollyCustomizations extends js.Object {
    var Presigner: Instantiable1[js.UndefOr[/* options */ PresignerOptions], typings.awsSdk.presignerMod.Presigner] = js.native
  }
  
}

