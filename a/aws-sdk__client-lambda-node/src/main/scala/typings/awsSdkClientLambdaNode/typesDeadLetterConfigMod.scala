package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeadLetterConfigMod {
  
  @js.native
  trait DeadLetterConfig extends StObject {
    
    /**
      * <p>The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.</p>
      */
    var TargetArn: js.UndefOr[String] = js.native
  }
  object DeadLetterConfig {
    
    @scala.inline
    def apply(): DeadLetterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeadLetterConfig]
    }
    
    @scala.inline
    implicit class DeadLetterConfigMutableBuilder[Self <: DeadLetterConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargetArn(value: String): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
    }
  }
  
  type UnmarshalledDeadLetterConfig = DeadLetterConfig
}
