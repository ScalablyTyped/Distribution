package typings.awsSdkSignatureV4

import typings.awsSdkTypes.httpMod.HeaderBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasHeaderMod {
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/hasHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hasHeader(soughtHeader: String, headers: HeaderBag): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasHeader")(soughtHeader.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
