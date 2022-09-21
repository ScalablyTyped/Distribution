package typings.awsSdkBuildTypes.customizationMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkBuildTypes.treeModelMod.TreeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ConfigurationDefinition = StringDictionary[ConfigurationPropertyDefinition]

type CustomizationProvider = js.Function2[/* model */ TreeModel, /* target */ RuntimeTarget, ServiceCustomizationDefinition]
