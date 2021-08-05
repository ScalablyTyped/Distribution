package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSolutionVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the solution containing the training configuration information.
    */
  var solutionArn: Arn
  
  /**
    * The scope of training to be performed when creating the solution version. The FULL option trains the solution version based on the entirety of the input solution's training data, while the UPDATE option processes only the data that has changed in comparison to the input solution. Choose UPDATE when you want to incrementally update your solution version instead of creating an entirely new one.  The UPDATE option can only be used when you already have an active solution version created from the input solution using the FULL option and the input solution was trained with the native-recipe-hrnn-coldstart recipe. 
    */
  var trainingMode: js.UndefOr[TrainingMode] = js.undefined
}
object CreateSolutionVersionRequest {
  
  inline def apply(solutionArn: Arn): CreateSolutionVersionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSolutionVersionRequest]
  }
  
  extension [Self <: CreateSolutionVersionRequest](x: Self) {
    
    inline def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
    
    inline def setTrainingMode(value: TrainingMode): Self = StObject.set(x, "trainingMode", value.asInstanceOf[js.Any])
    
    inline def setTrainingModeUndefined: Self = StObject.set(x, "trainingMode", js.undefined)
  }
}
