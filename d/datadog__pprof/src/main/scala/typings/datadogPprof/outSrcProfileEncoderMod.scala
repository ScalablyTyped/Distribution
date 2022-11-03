package typings.datadogPprof

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outSrcProfileEncoderMod {
  
  @JSImport("@datadog/pprof/out/src/profile-encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encode(
    profile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify perftools.profiles.IProfile */ Any
  ): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(profile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def encodeSync(
    profile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify perftools.profiles.IProfile */ Any
  ): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSync")(profile.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
