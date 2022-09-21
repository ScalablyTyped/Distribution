package typings.awsSdkFetchHttpHandler

import typings.awsSdkFetchHttpHandler.fetchHttpHandlerMod.FetchHttpHandlerOptions
import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/fetch-http-handler", "FetchHttpHandler")
  @js.native
  open class FetchHttpHandler ()
    extends typings.awsSdkFetchHttpHandler.fetchHttpHandlerMod.FetchHttpHandler {
    def this(options: FetchHttpHandlerOptions) = this()
    def this(options: Provider[js.UndefOr[FetchHttpHandlerOptions]]) = this()
  }
  
  @JSImport("@aws-sdk/fetch-http-handler", "streamCollector")
  @js.native
  val streamCollector: StreamCollector = js.native
}
