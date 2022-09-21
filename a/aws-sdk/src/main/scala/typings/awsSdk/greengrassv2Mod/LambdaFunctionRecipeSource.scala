package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionRecipeSource extends StObject {
  
  /**
    * The component versions on which this Lambda function component depends.
    */
  var componentDependencies: js.UndefOr[ComponentDependencyMap] = js.undefined
  
  /**
    * The system and runtime parameters for the Lambda function as it runs on the Greengrass core device.
    */
  var componentLambdaParameters: js.UndefOr[LambdaExecutionParameters] = js.undefined
  
  /**
    * The name of the component. Defaults to the name of the Lambda function.
    */
  var componentName: js.UndefOr[ComponentNameString] = js.undefined
  
  /**
    * The platforms that the component version supports.
    */
  var componentPlatforms: js.UndefOr[ComponentPlatformList] = js.undefined
  
  /**
    * The version of the component. Defaults to the version of the Lambda function as a semantic version. For example, if your function version is 3, the component version becomes 3.0.0.
    */
  var componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
  
  /**
    * The ARN of the Lambda function. The ARN must include the version of the function to import. You can't use version aliases like $LATEST.
    */
  var lambdaArn: NonEmptyString
}
object LambdaFunctionRecipeSource {
  
  inline def apply(lambdaArn: NonEmptyString): LambdaFunctionRecipeSource = {
    val __obj = js.Dynamic.literal(lambdaArn = lambdaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionRecipeSource]
  }
  
  extension [Self <: LambdaFunctionRecipeSource](x: Self) {
    
    inline def setComponentDependencies(value: ComponentDependencyMap): Self = StObject.set(x, "componentDependencies", value.asInstanceOf[js.Any])
    
    inline def setComponentDependenciesUndefined: Self = StObject.set(x, "componentDependencies", js.undefined)
    
    inline def setComponentLambdaParameters(value: LambdaExecutionParameters): Self = StObject.set(x, "componentLambdaParameters", value.asInstanceOf[js.Any])
    
    inline def setComponentLambdaParametersUndefined: Self = StObject.set(x, "componentLambdaParameters", js.undefined)
    
    inline def setComponentName(value: ComponentNameString): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentPlatforms(value: ComponentPlatformList): Self = StObject.set(x, "componentPlatforms", value.asInstanceOf[js.Any])
    
    inline def setComponentPlatformsUndefined: Self = StObject.set(x, "componentPlatforms", js.undefined)
    
    inline def setComponentPlatformsVarargs(value: ComponentPlatform*): Self = StObject.set(x, "componentPlatforms", js.Array(value*))
    
    inline def setComponentVersion(value: ComponentVersionString): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "componentVersion", js.undefined)
    
    inline def setLambdaArn(value: NonEmptyString): Self = StObject.set(x, "lambdaArn", value.asInstanceOf[js.Any])
  }
}
