package typings.expoGlr2XJCr

import typings.expoGlr2XJCr.withExpoRootTypesDTsMod.InitialProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport(".expo-glr2XJCr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Logs {
    
    @JSImport(".expo-glr2XJCr", "Logs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def disableExpoCliLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableExpoCliLogging")().asInstanceOf[Unit]
    
    inline def enableExpoCliLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableExpoCliLogging")().asInstanceOf[Unit]
  }
  
  inline def registerRootComponent[P /* <: InitialProps */](component: ComponentType[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRootComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
