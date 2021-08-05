package typings.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdk.presignerMod.Presigner
import typings.awsSdk.presignerMod.Presigner.PresignerOptions
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesPollyMod {
  
  @JSImport("aws-sdk/lib/services/polly", "PollyCustomizations")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  class PollyCustomizations () extends Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  /* static members */
  object PollyCustomizations {
    
    @JSImport("aws-sdk/lib/services/polly", "PollyCustomizations")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/services/polly", "PollyCustomizations.Presigner")
    @js.native
    def Presigner: Instantiable1[/* options */ js.UndefOr[PresignerOptions], typings.awsSdk.presignerMod.Presigner] = js.native
    inline def Presigner_=(x: Instantiable1[/* options */ js.UndefOr[PresignerOptions], Presigner]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Presigner")(x.asInstanceOf[js.Any])
  }
}
