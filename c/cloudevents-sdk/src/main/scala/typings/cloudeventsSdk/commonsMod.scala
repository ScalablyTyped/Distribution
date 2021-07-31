package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonsMod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/validation/commons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sanityAndClone(headers: js.Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("sanityAndClone")(headers.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @scala.inline
  def sanityContentType(contentType: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sanityContentType")(contentType.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def validateArgs(payload: js.Any, attributes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgs")(payload.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
