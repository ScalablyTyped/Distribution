package typings.awsSdkUtilMiddleware

import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeProvider[T](input: T): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProvider")(input.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  inline def normalizeProvider[T](input: Provider[T]): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProvider")(input.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
}
