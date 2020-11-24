package typings.awsSdkMiddlewareContentLength

import typings.awsSdkTypes.utilMod.BodyLengthCalculator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait BodyLengthChecker extends js.Object {
    
    def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator = js.native
  }
}
