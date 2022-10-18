package typings.beforeAfterHook

import typings.beforeAfterHook.mod.TypeStoreKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beforeAfterHookStrings {
  
  @js.native
  sealed trait Error
    extends StObject
       with TypeStoreKey
  inline def Error: Error = "Error".asInstanceOf[Error]
  
  @js.native
  sealed trait Options
    extends StObject
       with TypeStoreKey
  inline def Options: Options = "Options".asInstanceOf[Options]
  
  @js.native
  sealed trait Result
    extends StObject
       with TypeStoreKey
  inline def Result: Result = "Result".asInstanceOf[Result]
  
  @js.native
  sealed trait after extends StObject
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait before extends StObject
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait error_ extends StObject
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait wrap extends StObject
  inline def wrap: wrap = "wrap".asInstanceOf[wrap]
}
