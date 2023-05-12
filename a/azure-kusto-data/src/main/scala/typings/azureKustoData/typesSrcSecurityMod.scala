package typings.azureKustoData

import typings.azureKustoData.typesSrcTokenProviderMod.TokenProviderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcSecurityMod {
  
  @JSImport("azure-kusto-data/types/src/security", JSImport.Default)
  @js.native
  open class default protected () extends AadHelper {
    def this(kcsb: typings.azureKustoData.typesSrcConnectionBuilderMod.default) = this()
  }
  
  @JSImport("azure-kusto-data/types/src/security", "AadHelper")
  @js.native
  open class AadHelper protected () extends StObject {
    def this(kcsb: typings.azureKustoData.typesSrcConnectionBuilderMod.default) = this()
    
    def getAuthHeader(): js.Promise[String | Null] = js.native
    
    var tokenProvider: js.UndefOr[TokenProviderBase] = js.native
  }
}
