package typings.awsSdkUtilEndpoints

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibIsValidHostLabelMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/lib/isValidHostLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidHostLabel(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHostLabel")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidHostLabel(value: String, allowSubDomains: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidHostLabel")(value.asInstanceOf[js.Any], allowSubDomains.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
