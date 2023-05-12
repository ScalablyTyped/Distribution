package typings.cucumberCucumber.libApiTypesMod

import typings.cucumberCucumber.libModelsTestCaseHookDefinitionMod.default
import typings.cucumberCucumberExpressions.mod.ParameterTypeRegistry
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.UndefinedParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cucumberCucumber.libApiTypesMod.ISupportCodeCoordinates
  - typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
*/
trait ISupportCodeCoordinatesOrLibrary extends StObject
object ISupportCodeCoordinatesOrLibrary {
  
  inline def ISupportCodeCoordinates(importPaths: js.Array[String], requireModules: js.Array[String], requirePaths: js.Array[String]): typings.cucumberCucumber.libApiTypesMod.ISupportCodeCoordinates = {
    val __obj = js.Dynamic.literal(importPaths = importPaths.asInstanceOf[js.Any], requireModules = requireModules.asInstanceOf[js.Any], requirePaths = requirePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cucumberCucumber.libApiTypesMod.ISupportCodeCoordinates]
  }
  
  inline def ISupportCodeLibrary(
    World: Any,
    afterTestCaseHookDefinitions: js.Array[default],
    afterTestRunHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default],
    afterTestStepHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default],
    beforeTestCaseHookDefinitions: js.Array[default],
    beforeTestRunHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestRunHookDefinitionMod.default],
    beforeTestStepHookDefinitions: js.Array[typings.cucumberCucumber.libModelsTestStepHookDefinitionMod.default],
    defaultTimeout: Double,
    originalCoordinates: typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeCoordinates,
    parallelCanAssign: (Pickle, js.Array[Pickle]) => Boolean,
    parameterTypeRegistry: ParameterTypeRegistry,
    stepDefinitions: js.Array[typings.cucumberCucumber.libModelsStepDefinitionMod.default],
    undefinedParameterTypes: js.Array[UndefinedParameterType]
  ): typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary = {
    val __obj = js.Dynamic.literal(World = World.asInstanceOf[js.Any], afterTestCaseHookDefinitions = afterTestCaseHookDefinitions.asInstanceOf[js.Any], afterTestRunHookDefinitions = afterTestRunHookDefinitions.asInstanceOf[js.Any], afterTestStepHookDefinitions = afterTestStepHookDefinitions.asInstanceOf[js.Any], beforeTestCaseHookDefinitions = beforeTestCaseHookDefinitions.asInstanceOf[js.Any], beforeTestRunHookDefinitions = beforeTestRunHookDefinitions.asInstanceOf[js.Any], beforeTestStepHookDefinitions = beforeTestStepHookDefinitions.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], originalCoordinates = originalCoordinates.asInstanceOf[js.Any], parallelCanAssign = js.Any.fromFunction2(parallelCanAssign), parameterTypeRegistry = parameterTypeRegistry.asInstanceOf[js.Any], stepDefinitions = stepDefinitions.asInstanceOf[js.Any], undefinedParameterTypes = undefinedParameterTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary]
  }
}
