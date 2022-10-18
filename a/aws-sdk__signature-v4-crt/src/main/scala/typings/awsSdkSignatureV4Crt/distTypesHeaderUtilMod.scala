package typings.awsSdkSignatureV4Crt

import typings.awsSdkTypes.distTypesHttpMod.HeaderBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeaderUtilMod {
  
  @JSImport("@aws-sdk/signature-v4-crt/dist-types/headerUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteHeader(soughtHeader: String, headers: HeaderBag): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteHeader")(soughtHeader.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getHeaderValue(soughtHeader: String, headers: HeaderBag): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderValue")(soughtHeader.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def hasHeader(soughtHeader: String, headers: HeaderBag): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasHeader")(soughtHeader.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
