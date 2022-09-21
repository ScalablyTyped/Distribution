package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPointForObjectLambdaResult extends StObject {
  
  /**
    * Specifies the ARN for the Object Lambda Access Point.
    */
  var ObjectLambdaAccessPointArn: js.UndefOr[typings.awsSdk.s3controlMod.ObjectLambdaAccessPointArn] = js.undefined
}
object CreateAccessPointForObjectLambdaResult {
  
  inline def apply(): CreateAccessPointForObjectLambdaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessPointForObjectLambdaResult]
  }
  
  extension [Self <: CreateAccessPointForObjectLambdaResult](x: Self) {
    
    inline def setObjectLambdaAccessPointArn(value: ObjectLambdaAccessPointArn): Self = StObject.set(x, "ObjectLambdaAccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setObjectLambdaAccessPointArnUndefined: Self = StObject.set(x, "ObjectLambdaAccessPointArn", js.undefined)
  }
}
