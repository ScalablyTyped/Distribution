package typings.atAwsDashSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildClientMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack

  type ConfigApplicator[FullConfiguration] = js.Function2[
    /* config */ FullConfiguration, 
    /* clientMiddlewareStack */ MiddlewareStack[js.Any, js.Any, js.Any], 
    Unit
  ]
  type ConfigurationDefinition[Configuration /* <: StringDictionary[js.Any] */, ResolvedConfiguration /* <: Configuration */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof Configuration ]: @aws-sdk/types.@aws-sdk/types/build/client.ConfigurationPropertyDefinition<Configuration[P], ResolvedConfiguration[P], Configuration, ResolvedConfiguration>}
    */ typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.ConfigurationDefinition with js.Any
}
