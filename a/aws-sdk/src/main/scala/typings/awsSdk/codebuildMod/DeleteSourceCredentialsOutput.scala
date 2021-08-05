package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSourceCredentialsOutput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
}
object DeleteSourceCredentialsOutput {
  
  inline def apply(): DeleteSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSourceCredentialsOutput]
  }
  
  extension [Self <: DeleteSourceCredentialsOutput](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
  }
}
