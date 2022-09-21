package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementFlags extends StObject
@JSImport(".typescript-nn5FuAjk", "ElementFlags")
@js.native
object ElementFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementFlags & Double] = js.native
  
  @js.native
  sealed trait Fixed
    extends StObject
       with ElementFlags
  /* 3 */ val Fixed: typings.typescriptNn5FuAjk.mod.ElementFlags.Fixed & Double = js.native
  
  @js.native
  sealed trait NonRequired
    extends StObject
       with ElementFlags
  /* 14 */ val NonRequired: typings.typescriptNn5FuAjk.mod.ElementFlags.NonRequired & Double = js.native
  
  @js.native
  sealed trait NonRest
    extends StObject
       with ElementFlags
  /* 11 */ val NonRest: typings.typescriptNn5FuAjk.mod.ElementFlags.NonRest & Double = js.native
  
  @js.native
  sealed trait Optional
    extends StObject
       with ElementFlags
  /* 2 */ val Optional: typings.typescriptNn5FuAjk.mod.ElementFlags.Optional & Double = js.native
  
  @js.native
  sealed trait Required
    extends StObject
       with ElementFlags
  /* 1 */ val Required: typings.typescriptNn5FuAjk.mod.ElementFlags.Required & Double = js.native
  
  @js.native
  sealed trait Rest
    extends StObject
       with ElementFlags
  /* 4 */ val Rest: typings.typescriptNn5FuAjk.mod.ElementFlags.Rest & Double = js.native
  
  @js.native
  sealed trait Variable
    extends StObject
       with ElementFlags
  /* 12 */ val Variable: typings.typescriptNn5FuAjk.mod.ElementFlags.Variable & Double = js.native
  
  @js.native
  sealed trait Variadic
    extends StObject
       with ElementFlags
  /* 8 */ val Variadic: typings.typescriptNn5FuAjk.mod.ElementFlags.Variadic & Double = js.native
}
