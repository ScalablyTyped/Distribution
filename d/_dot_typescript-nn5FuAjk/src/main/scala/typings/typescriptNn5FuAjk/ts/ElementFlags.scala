package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementFlags extends StObject
@JSGlobal("ts.ElementFlags")
@js.native
object ElementFlags extends StObject {
  
  @js.native
  sealed trait Fixed
    extends StObject
       with ElementFlags
  
  @js.native
  sealed trait NonRequired
    extends StObject
       with ElementFlags
  
  @js.native
  sealed trait NonRest
    extends StObject
       with ElementFlags
  
  @js.native
  sealed trait Optional
    extends StObject
       with ElementFlags
  
  @js.native
  sealed trait Required
    extends StObject
       with ElementFlags
  
  @js.native
  sealed trait Rest
    extends StObject
       with ElementFlags
  
  @js.native
  sealed trait Variable
    extends StObject
       with ElementFlags
  
  @js.native
  sealed trait Variadic
    extends StObject
       with ElementFlags
}
