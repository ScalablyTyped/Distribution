package typings.awsSdkBuildTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object customizationMod {
  
  type ConfigurationDefinition = org.scalablytyped.runtime.StringDictionary[typings.awsSdkBuildTypes.customizationMod.ConfigurationPropertyDefinition]
  
  type CustomizationProvider = js.Function2[
    /* model */ typings.awsSdkBuildTypes.treeModelMod.TreeModel, 
    /* target */ typings.awsSdkBuildTypes.customizationMod.RuntimeTarget, 
    typings.awsSdkBuildTypes.customizationMod.ServiceCustomizationDefinition
  ]
}
