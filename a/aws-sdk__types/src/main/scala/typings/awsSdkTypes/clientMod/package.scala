package typings.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type ConfigApplicator[FullConfiguration] = js.Function2[
    /* config */ FullConfiguration, 
    /* clientMiddlewareStack */ typings.awsSdkTypes.middlewareMod.MiddlewareStack[js.Any, js.Any, js.Any], 
    scala.Unit
  ]
  type ConfigurationDefinition[Configuration /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, ResolvedConfiguration /* <: Configuration */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof Configuration ]: @aws-sdk/types.@aws-sdk/types/build/client.ConfigurationPropertyDefinition<Configuration[P], ResolvedConfiguration[P], Configuration, ResolvedConfiguration>}
    */ typings.awsSdkTypes.awsSdkTypesStrings.ConfigurationDefinition with js.Any
}
