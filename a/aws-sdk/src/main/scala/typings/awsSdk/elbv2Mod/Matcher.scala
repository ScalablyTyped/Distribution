package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matcher extends StObject {
  
  /**
    * You can specify values between 0 and 99. You can specify multiple values (for example, "0,1") or a range of values (for example, "0-5"). The default value is 12.
    */
  var GrpcCode: js.UndefOr[typings.awsSdk.elbv2Mod.GrpcCode] = js.undefined
  
  /**
    * For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200. You can specify multiple values (for example, "200,202") or a range of values (for example, "200-299"). For Network Load Balancers and Gateway Load Balancers, this must be "200–399". Note that when using shorthand syntax, some values such as commas need to be escaped.
    */
  var HttpCode: js.UndefOr[typings.awsSdk.elbv2Mod.HttpCode] = js.undefined
}
object Matcher {
  
  inline def apply(): Matcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matcher]
  }
  
  extension [Self <: Matcher](x: Self) {
    
    inline def setGrpcCode(value: GrpcCode): Self = StObject.set(x, "GrpcCode", value.asInstanceOf[js.Any])
    
    inline def setGrpcCodeUndefined: Self = StObject.set(x, "GrpcCode", js.undefined)
    
    inline def setHttpCode(value: HttpCode): Self = StObject.set(x, "HttpCode", value.asInstanceOf[js.Any])
    
    inline def setHttpCodeUndefined: Self = StObject.set(x, "HttpCode", js.undefined)
  }
}
