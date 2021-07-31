package typings.awsSdkMiddlewareInputDefault

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-input-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def inputDefault[Input /* <: js.Object */](inputBag: InputDefaultArgs[Input]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inputDefault")(inputBag.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  type InputDefaultArgs[Input /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ field in keyof Input ]:? Input[field]}
    */ typings.awsSdkMiddlewareInputDefault.awsSdkMiddlewareInputDefaultStrings.InputDefaultArgs & TopLevel[Input]
}
