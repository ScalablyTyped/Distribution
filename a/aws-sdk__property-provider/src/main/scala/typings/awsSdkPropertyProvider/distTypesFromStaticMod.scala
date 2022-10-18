package typings.awsSdkPropertyProvider

import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromStaticMod {
  
  @JSImport("@aws-sdk/property-provider/dist-types/fromStatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromStatic[T](staticValue: T): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStatic")(staticValue.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
}
