package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.AuthenticationExtensionsClientOutputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PublicKeyCredential")
@js.native
open class PublicKeyCredential ()
  extends StObject
     with typings.typescriptNn5FuAjk.PublicKeyCredential {
  
  /* CompleteClass */
  override def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
  
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* CompleteClass */
  override val rawId: typings.typescriptNn5FuAjk.ArrayBuffer = js.native
  
  /* CompleteClass */
  override val response: typings.typescriptNn5FuAjk.AuthenticatorResponse = js.native
  
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}
object PublicKeyCredential {
  
  @JSGlobal("PublicKeyCredential")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUserVerifyingPlatformAuthenticatorAvailable(): typings.typescriptNn5FuAjk.Promise[scala.Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserVerifyingPlatformAuthenticatorAvailable")().asInstanceOf[typings.typescriptNn5FuAjk.Promise[scala.Boolean]]
}
