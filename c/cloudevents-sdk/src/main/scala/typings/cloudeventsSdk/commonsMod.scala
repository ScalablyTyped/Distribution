package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonsMod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/validation/commons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sanityAndClone(headers: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("sanityAndClone")(headers.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def sanityContentType(contentType: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sanityContentType")(contentType.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def validateArgs(payload: Any, attributes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgs")(payload.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
