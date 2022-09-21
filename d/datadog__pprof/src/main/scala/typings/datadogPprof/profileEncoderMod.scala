package typings.datadogPprof

import typings.datadogPprof.profileMod.perftools.profiles.IProfile
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileEncoderMod {
  
  @JSImport("@datadog/pprof/out/src/profile-encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encode(profile: IProfile): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(profile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def encodeSync(profile: IProfile): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSync")(profile.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
