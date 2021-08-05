package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeadLetterConfigMod {
  
  trait DeadLetterConfig extends StObject {
    
    /**
      * <p>The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.</p>
      */
    var TargetArn: js.UndefOr[String] = js.undefined
  }
  object DeadLetterConfig {
    
    inline def apply(): DeadLetterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeadLetterConfig]
    }
    
    extension [Self <: DeadLetterConfig](x: Self) {
      
      inline def setTargetArn(value: String): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
      
      inline def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
    }
  }
  
  type UnmarshalledDeadLetterConfig = DeadLetterConfig
}
