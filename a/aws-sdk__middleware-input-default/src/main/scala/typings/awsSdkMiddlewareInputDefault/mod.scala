package typings.awsSdkMiddlewareInputDefault

import org.scalablytyped.runtime.TopLevel
import typings.awsSdkTypes.middlewareMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-input-default", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def inputDefault[Input /* <: js.Object */](inputBag: InputDefaultArgs[Input]): Middleware[Input, _] = js.native
  type InputDefaultArgs[Input /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ field in keyof Input ]:? Input[field]}
    */ typings.awsSdkMiddlewareInputDefault.awsSdkMiddlewareInputDefaultStrings.InputDefaultArgs with TopLevel[Input]
}

