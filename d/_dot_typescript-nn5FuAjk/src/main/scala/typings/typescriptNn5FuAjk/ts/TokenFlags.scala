package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenFlags extends StObject
@JSGlobal("ts.TokenFlags")
@js.native
object TokenFlags extends StObject {
  
  @js.native
  sealed trait BinarySpecifier
    extends StObject
       with TokenFlags
  
  @js.native
  sealed trait HexSpecifier
    extends StObject
       with TokenFlags
  
  @js.native
  sealed trait None
    extends StObject
       with TokenFlags
  
  @js.native
  sealed trait Octal
    extends StObject
       with TokenFlags
  
  @js.native
  sealed trait OctalSpecifier
    extends StObject
       with TokenFlags
  
  @js.native
  sealed trait Scientific
    extends StObject
       with TokenFlags
}
